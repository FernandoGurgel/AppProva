package com.example.fernando.appprova;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by fernando on 24/04/17.
 */

public class Produto {

    private String nomeProduto;
    private String[] embalagemTipo = {"Lata","Sache","Unidade","Quilo","Pecas","Pacote"};
    private ArrayList<String> localizacaoTipo; //{"Deposito","Balcao1","Balcao2","Pratileira1","Pratileira2","ShowRoom"};
    private String embalagem;
    private double precoCusto;
    private double precoVenda;
    private ArrayList<String> categoria;

    public Produto() {
        super();
    }

    public Produto(String nomeProduto, ArrayList<String> localizacaoTipo, String embalagem, double precoCusto, double precoVenda, ArrayList<String> categoria) {
        this.nomeProduto = nomeProduto;
        this.localizacaoTipo = localizacaoTipo;
        this.embalagem = embalagem;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.categoria = categoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String[] getEmbalagemTipo() {
        return embalagemTipo;
    }

    public void setEmbalagemTipo(String[] embalagemTipo) {
        this.embalagemTipo = embalagemTipo;
    }

    public ArrayList<String> getLocalizacaoTipo() {
        return localizacaoTipo;
    }

    public void setLocalizacaoTipo(ArrayList<String> localizacaoTipo) {
        this.localizacaoTipo = localizacaoTipo;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public ArrayList<String> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<String> categoria) {
        this.categoria = categoria;
    }
}
