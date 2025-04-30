package Herencia_Polimorfismo;

public abstract class Persona {
    protected String nombre;
    protected int edad;



    public void comer(){
        System.out.println("Soy persona y como");
    }

    public abstract void estudiar();

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Mi nombre es "+nombre+" y mi edad es "+edad);
    }
}
