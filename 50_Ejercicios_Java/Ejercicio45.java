import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero de 3 cifras: ");
        int num = sc.nextInt();
        
        int sumaDigitos = (num / 100) + ((num / 10) % 10) + (num % 10);
        System.out.println("Suma total de sus tres digitos: " + sumaDigitos);
    }
}
