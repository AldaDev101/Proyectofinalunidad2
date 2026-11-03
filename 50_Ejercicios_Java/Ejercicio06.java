import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de cambio en pesos: ");
        int cambio = sc.nextInt();
        
        int monedas10 = cambio / 10;
        int monedas1 = cambio % 10;
        
        System.out.println("Monedas de $10: " + monedas10 + ", Monedas de $1: " + monedas1);
    }
}
