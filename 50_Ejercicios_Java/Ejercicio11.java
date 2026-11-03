import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura en Celsius: ");
        double temp = sc.nextDouble();
        
        boolean congelacion = temp <= 0.0;
        System.out.println("Esta en estado de congelacion: " + congelacion);
    }
}
