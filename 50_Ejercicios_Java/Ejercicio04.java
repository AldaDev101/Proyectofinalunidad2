import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tiempo en segundos (t): ");
        double t = sc.nextDouble();
        
        double distancia = 9.81 * (0.5 * (t * t));
        System.out.println("Distancia recorrida: " + distancia);
    }
}
