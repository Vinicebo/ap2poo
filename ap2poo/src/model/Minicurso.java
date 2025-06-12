package model;

import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Minicurso extends Evento {

    private List<Instrutor> instrutores;
    private int cargaHoraria;
    private List<String> materiais;


    public Minicurso(String data, int duracao, Local local, double orcamento, String titulo, int cargaHoraria, List<String> materiais, List<Instrutor> instrutores) {
        super(data, duracao, local, orcamento, titulo);
        this.cargaHoraria = cargaHoraria;
        this.instrutores = new ArrayList<Instrutor>();
        this.materiais = new ArrayList<String>();
    }

    public Minicurso(String data, int duracao, Local local, double orcamento, String titulo, int cargaHoraria) {
        super(data, duracao, local, orcamento, titulo);
        this.cargaHoraria = cargaHoraria;
        this.instrutores = new ArrayList<Instrutor>();
        this.materiais = new ArrayList<String>();

    }







    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }



    public List<String> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<String> materiais) {
        this.materiais = materiais;
    }


    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public void addInstrutor(Instrutor instrutor){
        this.instrutores.add(instrutor);
    }

    public void removeInstrutor(Instrutor instrutor){
        this.instrutores.remove(instrutor);
    }

    public void addMaterial(String material){
        this.materiais.add(material);
    }
}
