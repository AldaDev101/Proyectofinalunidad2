import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el anio: ");
        int anio = sc.nextInt();
        
        boolean esBisiesto = ((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0);
        System.out.println("El anio es bisiesto: " + esBisiesto);
    }
}
