package Herencia_Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Alumno a1 = new Alumno("Pepito", 19, 12);
        Profesor p1 = new Profesor("Coco", 35, "Ingeniero") ;
        a1.mostrarDatos();
        a1.estudiar();
        p1.mostrarDatos();
        p1.estudiar();
    }
}
