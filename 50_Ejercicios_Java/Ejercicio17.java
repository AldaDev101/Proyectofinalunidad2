import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidad registrada (km/h): ");
        double vel = sc.nextDouble();
        
        boolean excede = vel > 110.0;
        System.out.println("Excede limite de 110.0 km/h: " + excede);
    }
}
