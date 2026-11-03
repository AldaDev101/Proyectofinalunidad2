import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Edad del asistente: ");
        int edad = sc.nextInt();
        System.out.print("Pase VIP (1 para si, 0 para no): ");
        int vip = sc.nextInt();
        
        boolean accesoPreferencial = (edad < 12) || (vip == 1);
        System.out.println("Acceso preferencial: " + accesoPreferencial);
    }
}
