package model;

public class Sala extends Local {

    private String numero;
    private boolean temMultimedia;


    public Sala(int maxCap, String nome, String predio, String numero, boolean temMultimedia) {
        super(maxCap, nome, predio);
        this.numero = numero;
        this.temMultimedia = temMultimedia;
    }

    public boolean isTemMultimedia() {
        return temMultimedia;
    }

    public void setTemMultimedia(boolean temMultimedia) {
        this.temMultimedia = temMultimedia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
