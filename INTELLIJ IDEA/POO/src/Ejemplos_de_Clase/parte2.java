package Ejemplos_de_Clase;

public class parte2 {

    public class Planeta {

        // Atributos de la clase Planeta
        private String nombre;
        private int cantidadSatelites;
        private double masa;
        private double volumen;
        private int diametro;
        private int distanciaMediaAlSol;
        private TipoPlaneta tipoPlaneta;
        private boolean observableASimpleVista;
        private double periodoOrbital; // Nuevo atributo para el periodo orbital en años
        private double periodoRotacion; // Nuevo atributo para el periodo de rotación en días

        // Enumerado para el tipo de planeta
        public enum TipoPlaneta {
            GASEOSO, TERRESTRE, ENANO
        }

        // Constructor de la clase Planeta
        public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaAlSol, TipoPlaneta tipoPlaneta, boolean observableASimpleVista, double periodoOrbital, double periodoRotacion) {
            this.nombre = nombre;
            this.cantidadSatelites = cantidadSatelites;
            this.masa = masa;
            this.volumen = volumen;
            this.diametro = diametro;
            this.distanciaMediaAlSol = distanciaMediaAlSol;
            this.tipoPlaneta = tipoPlaneta;
            this.observableASimpleVista = observableASimpleVista;
            this.periodoOrbital = periodoOrbital;
            this.periodoRotacion = periodoRotacion;
        }

        // Método para imprimir los valores de los atributos
        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Cantidad de satélites: " + cantidadSatelites);
            System.out.println("Masa: " + masa + " kg");
            System.out.println("Volumen: " + volumen + " km³");
            System.out.println("Diámetro: " + diametro + " km");
            System.out.println("Distancia media al Sol: " + distanciaMediaAlSol + " millones de km");
            System.out.println("Tipo de planeta: " + tipoPlaneta);
            System.out.println("Observable a simple vista: " + observableASimpleVista);
            System.out.println("Período orbital: " + periodoOrbital + " años");
            System.out.println("Período de rotación: " + periodoRotacion + " días");
            System.out.println();
        }

        // Método para calcular la densidad del planeta
        public double calcularDensidad() {
            return masa / volumen;
        }


        public boolean esPlanetaExterior() {
            double distanciaEnUA = distanciaMediaAlSol * 1e6 / 149597870;
            return distanciaEnUA > 3.4;
        }

        public void main(String[] args) {
            // Crear dos planetas
            Planeta planeta1 = new Planeta("Júpiter", 79, 1.898e27, 1.431e15, 139820, 778, TipoPlaneta.GASEOSO, true, 11.86, 0.41);
            Planeta planeta2 = new Planeta("Marte", 2, 6.39e23, 1.631e11, 6779, 227, TipoPlaneta.TERRESTRE, true, 1.88, 1.03);

            // Mostrar los valores de los atributos de los planetas
            planeta1.imprimir();
            planeta2.imprimir();

            // Calcular e imprimir la densidad de cada planeta
            System.out.println("Densidad de " + planeta1.nombre + ": " + planeta1.calcularDensidad() + " kg/km³");
            System.out.println("Densidad de " + planeta2.nombre + ": " + planeta2.calcularDensidad() + " kg/km³");

            // Determinar e imprimir si cada planeta es exterior
            System.out.println(planeta1.nombre + " es un planeta exterior: " + planeta1.esPlanetaExterior());
            System.out.println(planeta2.nombre + " es un planeta exterior: " + planeta2.esPlanetaExterior());
        }
    }

}
