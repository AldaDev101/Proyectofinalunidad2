import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor decimal: ");
        double num = sc.nextDouble();
        
        boolean esNegativo = num < 0.0;
        System.out.println("El numero es estrictamente menor que cero: " + esNegativo);
    }
}
