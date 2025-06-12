package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Participante {
    private String nome;
    private String cpf;
    private String email;
    private String curso;
    private List<Evento> eventosTnscritos;

    public Participante(String cpf, String curso, String email, String nome) {
        this.cpf = cpf;
        this.curso = curso;
        this.email = email;
        this.nome = nome;
    }

    public Participante(String cpf, String curso, String email, List<Evento> eventos, String nome) {
        this.cpf = cpf;
        this.curso = curso;
        this.email = email;
        this.eventosTnscritos = new ArrayList<Evento>();
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Evento> getEventos() {
        return eventosTnscritos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventosTnscritos = eventos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addEvento(Evento evento){
        this.eventosTnscritos.add(evento);
    }


    public void removeEvento(Evento evento){
        this.eventosTnscritos.remove(evento);
    }


}
