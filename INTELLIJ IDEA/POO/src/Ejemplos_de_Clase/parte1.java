package Ejemplos_de_Clase;

public class parte1 {

    public static class Persona {
        String nombre; // Atributo que identifica el nombre de una persona
        String apellidos; // Atributo que identifica los apellidos de una persona
        String númeroDocumentoIdentidad; // Atributo que identifica el número de documento de identidad de una persona
        int añoNacimiento;
        String paisOrigen; // Nuevo atributo que identifica el país de origen de una persona
        char genero; // Nuevo atributo que identifica el género de una persona

        public Persona(String nombre, String apellidos, String númeroDocumentoIdentidad, int añoNacimiento, String paisOrigen, char genero) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
            this.añoNacimiento = añoNacimiento;
            this.paisOrigen = paisOrigen; // Inicialización del nuevo atributo paisOrigen
            this.genero = genero; // Inicialización del nuevo atributo genero
        }

        public void imprimir() {
            System.out.println("Nombre = " + nombre);
            System.out.println("Apellidos = " + apellidos);
            System.out.println("Número de documento de identidad = " + númeroDocumentoIdentidad);
            System.out.println("Año de nacimiento = " + añoNacimiento);
            System.out.println("Pais de origen = " + paisOrigen); // Mostrar el valor del nuevo atributo paisOrigen
            System.out.println("Genero = " + genero); // Mostrar el valor del nuevo atributo genero
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Colombia", 'M');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001, "México", 'M');
        p1.imprimir();
        p2.imprimir();
    }
}








