package model;

import java.util.ArrayList;
import java.util.List;

public class Local {

    private String nome;
    private int maxCap;
    private String predio;


    public Local(int maxCap, String nome, String predio) {
        this.maxCap = maxCap;
        this.nome = nome;
        this.predio = predio;
    }


    public int getMaxCap() {
        return maxCap;
    }

    public void setMaxCap(int maxCap) {
        this.maxCap = maxCap;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

}
