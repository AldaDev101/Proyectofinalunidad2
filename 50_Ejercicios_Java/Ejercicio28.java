import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero positivo: ");
        int num = sc.nextInt();
        
        boolean noTerminaEnCero = (num % 10) != 0;
        System.out.println("NO termina en cero: " + noTerminaEnCero);
    }
}
