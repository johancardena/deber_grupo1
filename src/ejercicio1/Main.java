package ejercicio1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Solicitar la velocidad inicial
            System.out.print("Ingrese la velocidad inicial (m/s): ");
            double velocidad = Double.parseDouble(scanner.nextLine().trim());

            // Solicitar el ángulo de lanzamiento
            System.out.print("Ingrese el ángulo de lanzamiento (grados): ");
            double angulo = Double.parseDouble(scanner.nextLine().trim());

            // Crear objeto Pelota
            Pelota pelota = new Pelota(velocidad, angulo);

            // Solicitar el tiempo
            System.out.print("Ingrese el tiempo (s): ");
            double tiempo = Double.parseDouble(scanner.nextLine().trim());

            // Calcular la altura
            double altura = pelota.calcularAltura(tiempo);

            // Imprimir el resultado
            System.out.printf("La altura de la pelota a los %.2f segundos es: %.2f metros.%n", tiempo, altura);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Tipo de entrada no válido.");
        } finally {
            scanner.close();
        }
    }
}
