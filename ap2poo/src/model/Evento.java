package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Evento {


    private String titulo;
    private String data;
    private int duracao;
    private double orcamento;
    private Local local;
    private List<Participante> inscritos;


    public Evento(String data, int duracao, double orcamento, String titulo) {
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.orcamento = orcamento;

    }


    public Evento(String data, int duracao, double orcamento, String titulo, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.orcamento = orcamento;
        this.local = local;

    }

    public Evento(String data, int duracao, double orcamento, String titulo, List<Participante> inscritos, Local local) {
        this.data = data;
        this.duracao = duracao;
        this.inscritos = new ArrayList<Participante>();
        this.orcamento = orcamento;
        this.titulo = titulo;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }


    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void addInscrito(Participante participante){
        this.inscritos.add(participante);
    }


    public void removeInscrito(Participante participante){
        this.inscritos.remove(participante);
    }


}
