import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero: ");
        int num = sc.nextInt();
        
        boolean multiploAmbos = ((num % 4) == 0) && ((num % 6) == 0);
        System.out.println("Es multiplo simultaneo de 4 y 6: " + multiploAmbos);
    }
}
