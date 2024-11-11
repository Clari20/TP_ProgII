package Ejercicio1;

import java.util.ArrayList;

public class CargarNotas {
    public static void main(String[] args) {
        // Crear un alumno
        Alumno alumno = new Alumno("Juan Pérez", 123456);

        // Crear notas
        Nota nota1 = new Nota(8.5, "Matemáticas");
        Nota nota2 = new Nota(9.0, "Historia");

        // Añadir notas al alumno
        ArrayList<Nota> notas = new ArrayList<>();
        notas.add(nota1);
        notas.add(nota2);
        alumno.setNotas(notas);

        // Imprimir notas del alumno
        alumno.imprimirNota();
    }
}

