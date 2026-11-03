import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de 2 digitos (10-99): ");
        int num = sc.nextInt();
        
        boolean digitosIguales = (num / 10) == (num % 10);
        System.out.println("Los dos digitos son iguales: " + digitosIguales);
    }
}
