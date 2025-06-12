package model;

public class Laboratorio extends Local {

    private int numeroComputadores;
    private String tipo;

    public Laboratorio(int maxCap, String nome, String predio, int numeroComputadores, String tipo) {
        super(maxCap, nome, predio);
        this.numeroComputadores = numeroComputadores;
        this.tipo = tipo;
    }

    public int getNumeroComputadores() {
        return numeroComputadores;
    }

    public void setNumeroComputadores(int numeroComputadores) {
        this.numeroComputadores = numeroComputadores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
