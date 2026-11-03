import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio de costo: ");
        double costo = sc.nextDouble();
        System.out.print("Precio de venta al publico: ");
        double venta = sc.nextDouble();
        
        boolean margenAdecuado = ((venta - costo) / costo) >= 0.30;
        System.out.println("Margen de ganancia es mayor o igual al 30%: " + margenAdecuado);
    }
}
