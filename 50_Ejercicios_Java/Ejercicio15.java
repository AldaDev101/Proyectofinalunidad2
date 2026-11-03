import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero: ");
        int num = sc.nextInt();
        
        boolean esDivisible3 = (num % 3) == 0;
        System.out.println("Es divisible exactamente entre 3: " + esDivisible3);
    }
}
