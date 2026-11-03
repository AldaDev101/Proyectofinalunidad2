import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio (r): ");
        double r = sc.nextDouble();
        System.out.print("Ingrese la altura (h): ");
        double h = sc.nextDouble();
        
        double volumen = 3.14159 * (r * r) * h;
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
