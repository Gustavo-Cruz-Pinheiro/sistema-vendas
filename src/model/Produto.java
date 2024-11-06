package model;

public class Produto {

    private int idProd;
    private float valor;
    private int qtdProd;
    private String marca;
    private String descricao;
    private String modelo;

    public Produto() {
    }

    public Produto(int idProd, float valor, int qtdProd, String marca, String descricao, String modelo) {
        this.idProd = idProd;
        this.valor = valor;
        this.qtdProd = qtdProd;
        this.marca = marca;
        this.descricao = descricao;
        this.modelo = modelo;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtdProd() {
        return qtdProd;
    }

    public void setQtdProd(int qtdProd) {
        this.qtdProd = qtdProd;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
