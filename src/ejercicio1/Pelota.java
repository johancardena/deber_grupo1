package ejercicio1;

public class Pelota {
    double velocidadInicial;
    double anguloLanzamiento;

    // Constructor
    public Pelota(double velocidadInicial, double anguloLanzamiento) {
        this.velocidadInicial = velocidadInicial;
        this.anguloLanzamiento = anguloLanzamiento;
    }

    // Método para calcular la altura a un tiempo t
    public double calcularAltura(double tiempo) {
        // Convertir el ángulo a radianes
        double anguloRadianes = Math.toRadians(this.anguloLanzamiento);
        // Constante de gravedad
        double g = 9.81;

        // calcular la altura
        double altura = (velocidadInicial * Math.sin(anguloRadianes) * tiempo) - (0.5 * g * Math.pow(tiempo, 2));
        return altura;
    }
}
