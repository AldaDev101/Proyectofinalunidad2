import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingreso anual: ");
        double ingresoAnual = sc.nextDouble();
        System.out.print("Puntaje crediticio: ");
        int puntaje = sc.nextInt();
        
        boolean calificaGold = (ingresoAnual >= 300000.0) && (puntaje > 700);
        System.out.println("Califica para tarjeta Gold: " + calificaGold);
    }
}
