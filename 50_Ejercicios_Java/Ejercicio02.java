import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad en dolares: ");
        double dolares = sc.nextDouble();
        System.out.print("Tipo de cambio a pesos: ");
        double tipoCambio = sc.nextDouble();
        System.out.print("Porcentaje de comision (ej. 2.5): ");
        double comisionPorcentaje = sc.nextDouble();
        
        double totalNeto = (dolares * tipoCambio) * (1 - (comisionPorcentaje / 100.0));
        System.out.println("Total neto en pesos: " + totalNeto);
    }
}
