import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor a: ");
        int a = sc.nextInt();
        System.out.print("Valor b: ");
        int b = sc.nextInt();
        System.out.print("Valor c: ");
        int c = sc.nextInt();
        
        boolean ordenCreciente = (a < b) && (b < c);
        System.out.println("Estan en orden estrictamente creciente: " + ordenCreciente);
    }
}
