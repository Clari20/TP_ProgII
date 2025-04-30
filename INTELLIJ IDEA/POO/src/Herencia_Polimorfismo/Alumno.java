package Herencia_Polimorfismo;

public class Alumno extends Persona{
    private int legajo;

    public Alumno(String nombre, int edad, int legajo) {
        super(nombre, edad);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public void estudiar() {
        System.out.println("Yo estudio como alumno");
    }
}
