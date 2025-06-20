package model;

public class Auditorio extends Local {

    private boolean temSistemaSom;
    private boolean temTraducaoSimultanea;

    public Auditorio(int maxCap, String nome, String predio, boolean temSistemaSom, boolean temTraducaoSimultanea) {
        super(maxCap, nome, predio);
        this.temSistemaSom = temSistemaSom;
        this.temTraducaoSimultanea = temTraducaoSimultanea;
    }

    public boolean isTemSistemaSom() {
        return temSistemaSom;
    }

    public void setTemSistemaSom(boolean temSistemaSom) {
        this.temSistemaSom = temSistemaSom;
    }

    public boolean isTemTraducaoSimultanea() {
        return temTraducaoSimultanea;
    }

    public void setTemTraducaoSimultanea(boolean temTraducaoSimultanea) {
        this.temTraducaoSimultanea = temTraducaoSimultanea;
    }
}
