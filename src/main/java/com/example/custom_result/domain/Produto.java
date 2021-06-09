package com.example.custom_result.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "CodProduto")
    @JsonProperty("CodProduto")
    private int codProduto;

    @Column(name = "DescProd")
    @JsonProperty("DescProd")
    private String descProd;
}
