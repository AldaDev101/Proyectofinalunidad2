import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sueldo mensual: ");
        double sueldo = sc.nextDouble();
        System.out.print("Anios de antiguedad laboral: ");
        int antiguedad = sc.nextInt();
        System.out.print("Deudas actuales: ");
        double deudas = sc.nextDouble();
        
        boolean aprobado = (sueldo > 15000.0) && (antiguedad > 3) && (deudas < 5000.0);
        System.out.println("Prestamo hipotecario aprobado: " + aprobado);
    }
}
