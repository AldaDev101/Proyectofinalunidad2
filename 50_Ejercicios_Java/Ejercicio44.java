import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Coordenada x: ");
        double x = sc.nextDouble();
        System.out.print("Coordenada y: ");
        double y = sc.nextDouble();
        
        boolean primerCuadrante = (x > 0.0) && (y > 0.0);
        System.out.println("Esta en el primer cuadrante: " + primerCuadrante);
    }
}
