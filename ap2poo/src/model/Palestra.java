package model;

public class Palestra extends Evento {

    private Palestrante palestrante;

    public Palestra(String data, int duracao, double orcamento, String titulo, Palestrante palestrante, Local local) {
        super(data, duracao, local, orcamento, titulo);
        this.palestrante = palestrante;
    }


    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }
}
