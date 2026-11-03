import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor a: ");
        int a = sc.nextInt();
        System.out.print("Valor b: ");
        int b = sc.nextInt();
        System.out.print("Valor c: ");
        int c = sc.nextInt();
        
        boolean iguales = (a == b) && (b == c);
        System.out.println("Los tres numeros son identicos: " + iguales);
    }
}
