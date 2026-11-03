import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Estatura en metros: ");
        double estatura = sc.nextDouble();
        
        boolean sobrepeso = (peso / (estatura * estatura)) >= 25.0;
        System.out.println("Tiene sobrepeso (IMC >= 25.0): " + sobrepeso);
    }
}
