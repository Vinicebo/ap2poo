package model;

public class Palestrante {

    private String nome;
    private String email;
    private String instituicao;

    public Palestrante(String email, String instituicao, String nome) {
        this.email = email;
        this.instituicao = instituicao;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
