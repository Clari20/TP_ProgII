package Herencia_Polimorfismo;

public class Profesor extends Persona implements Volador{
    private String titulo;

    public Profesor(String nombre, int edad, String titulo) {
        super(nombre, edad);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void estudiar() {
        System.out.println("Yo estudio como profesor");
    }

    @Override
    public void volar() {
        System.out.println("Yo vuelo los fines de semana");
    }
}
