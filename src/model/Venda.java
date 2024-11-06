package model;

public class Venda {
    
    private int idVenda;
    private int qtdVenda;
    private int idProd;

    public Venda() {
    }
    
    public Venda(int idVenda, int qtdVenda, int idProd) {
        this.idVenda = idVenda;
        this.qtdVenda = qtdVenda;
        this.idProd = idProd;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }
    
}
