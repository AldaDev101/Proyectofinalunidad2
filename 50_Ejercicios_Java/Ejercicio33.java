import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Minutos totales de estacionamiento: ");
        int minutos = sc.nextInt();
        
        int totalPagar = ((minutos + 59) / 60) * 25;
        System.out.println("Total a pagar: $" + totalPagar);
    }
}
