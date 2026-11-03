import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total de ventas mensuales: ");
        double ventas = sc.nextDouble();
        
        boolean bonoEspecial = ventas >= 20000.0;
        System.out.println("Obtiene bono especial: " + bonoEspecial);
    }
}
