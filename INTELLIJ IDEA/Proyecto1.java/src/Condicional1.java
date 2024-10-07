import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
         Scanner lectura = new Scanner(System.in);
         String examenVirtual = "OK";
         String examen = "APROBADO";
        System.out.println("Ingrese su edad: ");
        int edad = lectura.nextInt();
         if (edad>=18 && examenVirtual.equals("OK") && examen.equals("APROBADO")) {
             System.out.println("Habilitado para sacar cante");

         }else {
             System.out.println("No habilitado para sacar carnet");
         }
    }
}
