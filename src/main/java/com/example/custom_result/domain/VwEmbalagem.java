package com.example.custom_result.domain;

import org.springframework.context.annotation.PropertySource;

import javax.persistence.*;

@Entity
public class VwEmbalagem {

    @Id
    private int codEmbalagem;
    private int codProduto;
    private String descProd;
    private String refProd;
    private String aux;
    private double qtdUnit;

    public VwEmbalagem(int codEmbalagem, int codProduto, String descProd, String refProd, String aux, double qtdUnit) {
        this.codEmbalagem = codEmbalagem;
        this.codProduto = codProduto;
        this.descProd = descProd;
        this.refProd = refProd;
        this.aux = aux;
        this.qtdUnit = qtdUnit;
    }

    public VwEmbalagem() {
    }

    public int getCodEmbalagem() {
        return codEmbalagem;
    }

    public void setCodEmbalagem(int codEmbalagem) {
        this.codEmbalagem = codEmbalagem;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public String getRefProd() {
        return refProd;
    }

    public void setRefProd(String refProd) {
        this.refProd = refProd;
    }

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }

    public double getQtdUnit() {
        return qtdUnit;
    }

    public void setQtdUnit(double qtdUnit) {
        this.qtdUnit = qtdUnit;
    }
}
