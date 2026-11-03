import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora (0 a 23): ");
        int hora = sc.nextInt();
        
        boolean horaValida = (hora >= 0) && (hora <= 23);
        System.out.println("Es formato de hora valido: " + horaValida);
    }
}
