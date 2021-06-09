package com.example.custom_result.repository;

import com.example.custom_result.domain.IEmbalagemCount;
import com.example.custom_result.domain.VwEmbalagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmbalagemRepository extends JpaRepository<VwEmbalagem, Integer> {

    @Query(nativeQuery = true, value =
            "select " +
            "  cod_produto as codProduto," +
            "  desc_prod as descProd," +
            "  count(cod_embalagem) as qtd " +
            "from vw_embalagem " +
            "group by " +
            "  cod_produto," +
            "  desc_prod ")
    List<IEmbalagemCount> countTotalEmbalagemInterface();

    List<VwEmbalagem> findByCodProduto(int codProduto);
}
