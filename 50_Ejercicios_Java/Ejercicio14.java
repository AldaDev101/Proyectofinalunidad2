import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radio r1: ");
        double r1 = sc.nextDouble();
        System.out.print("Radio r2: ");
        double r2 = sc.nextDouble();
        
        boolean r1Mayor = (3.14159 * r1 * r1) > (3.14159 * r2 * r2);
        System.out.println("Area 1 supera a Area 2: " + r1Mayor);
    }
}
