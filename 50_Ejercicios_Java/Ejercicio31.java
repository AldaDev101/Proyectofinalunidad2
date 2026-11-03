import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de unidades: ");
        int unidades = sc.nextInt();
        System.out.print("Precio unitario: ");
        double precioUnitario = sc.nextDouble();
        
        boolean aplicaDescuento = (unidades > 50) && ((unidades * precioUnitario) > 5000.0);
        System.out.println("Aplica descuento por compra voluminosa: " + aplicaDescuento);
    }
}
