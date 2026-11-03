import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingreso mensual: ");
        double ingreso = sc.nextDouble();
        System.out.print("Pago de tarjeta: ");
        double pagoTarjeta = sc.nextDouble();
        
        boolean superaPorcentaje = pagoTarjeta > (ingreso * 0.30);
        System.out.println("El pago de tarjeta supera el 30% del ingreso: " + superaPorcentaje);
    }
}
