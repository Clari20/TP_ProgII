package Ejemplo1;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona(15, "Pepe");
        Curso c1 = new Curso("Matematica");
        Auto a1 = new Auto(" V W ");
        Auto a2 = new Auto("Peugeot");
        p1.setCurso(c1);
        p1.agregarAutos(a1);
        p1.agregarAutos(a2);

        System.out.println(p1.getNombre()+" esta cursando "+p1.getCurso().getNombre());
        p1.mostrarAutos();
    }
}
