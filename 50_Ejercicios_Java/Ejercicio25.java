import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota Examen 1: ");
        double ex1 = sc.nextDouble();
        System.out.print("Nota Examen 2: ");
        double ex2 = sc.nextDouble();
        
        boolean aprueba = (ex1 >= 80.0) || (ex2 >= 80.0);
        System.out.println("Aprueba la certificacion: " + aprueba);
    }
}
