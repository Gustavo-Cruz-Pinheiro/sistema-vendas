package model;

public class Usuario {

    private int idUsu;
    private int qtdAcesso;
    private int status;
    private String nome;
    private String senha;
    private String email;

    public Usuario() {
    }

    public Usuario(int idUsu, int qtdAcesso, int status, String nome, String senha, String email) {
        this.idUsu = idUsu;
        this.qtdAcesso = qtdAcesso;
        this.status = status;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public int getQtdacesso() {
        return qtdAcesso;
    }

    public void setQtdacesso(int qtdAcesso) {
        this.qtdAcesso = qtdAcesso;
    }

    public int getStatus() {
        return status;
    }

    public void  setStatus(int status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
