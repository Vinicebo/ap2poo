package model;

import java.util.List;
import java.util.ListResourceBundle;

public class Seminario extends Evento {
    private List<Participante> alunosParticipantes;
    private String nomeAlunoApresentador;
    private String tema;
    private String nomeOrientador;

    public Seminario(String data, int duracao, Local local, double orcamento, String titulo, List<Participante> alunosParticipantes, String nomeAlunoApresentador, String nomeOrientador, String tema) {
        super(data, duracao, local, orcamento, titulo);
        this.alunosParticipantes = alunosParticipantes;
        this.nomeAlunoApresentador = nomeAlunoApresentador;
        this.nomeOrientador = nomeOrientador;
        this.tema = tema;
    }


    public List<Participante> getAlunosParticipantes() {
        return alunosParticipantes;
    }

    public void setAlunosParticipantes(List<Participante> alunosParticipantes) {
        this.alunosParticipantes = alunosParticipantes;
    }

    public String getNomeAlunoApresentador() {
        return nomeAlunoApresentador;
    }

    public void setNomeAlunoApresentador(String nomeAlunoApresentador) {
        this.nomeAlunoApresentador = nomeAlunoApresentador;
    }

    public String getNomeOrientador() {
        return nomeOrientador;
    }

    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void addAluno(Participante participante){
        this.alunosParticipantes.add(participante);
    }



    public void removeAluno(Participante participante){
        this.alunosParticipantes.remove(participante);
    }
}
