package Ejercicio1;

public class Nota {
    private double notaExamen;
    private String catedra;

    public Nota(double notaExamen, String catedra) {
        this.notaExamen = notaExamen;
        this.catedra = catedra;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }
}
