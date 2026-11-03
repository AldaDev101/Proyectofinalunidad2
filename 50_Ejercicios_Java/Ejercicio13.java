import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero: ");
        int num = sc.nextInt();
        
        boolean terminaEnCero = (num % 10) == 0;
        System.out.println("El ultimo digito es 0: " + terminaEnCero);
    }
}
