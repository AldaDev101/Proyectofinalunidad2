import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Monto de inversion: ");
        double monto = sc.nextDouble();
        System.out.print("Dias de plazo: ");
        int dias = sc.nextInt();
        
        double rendimiento = monto * (0.095 * (dias / 365.0));
        System.out.println("Rendimiento ganado: " + rendimiento);
    }
}
