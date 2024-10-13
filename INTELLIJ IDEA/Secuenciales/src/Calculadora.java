import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distance = scanner.nextDouble();

        System.out.print("Ingrese el consumo de combustible del vehículo en litros por kilómetro: ");
        double fuelConsumption = scanner.nextDouble();

        System.out.print("Ingrese el precio del combustible por litro: ");
        double fuelPrice = scanner.nextDouble();

        double totalCost = distance * fuelConsumption * fuelPrice;

        System.out.printf("El costo total del viaje es: %.2f pesos\n", totalCost);
    }
}

