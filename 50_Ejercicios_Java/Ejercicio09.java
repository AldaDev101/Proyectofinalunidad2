import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total de horas: ");
        int horasTotales = sc.nextInt();
        
        int dias = horasTotales / 24;
        int horasSobrantes = horasTotales % 24;
        
        System.out.println("Dias completos: " + dias + ", Horas sobrantes: " + horasSobrantes);
    }
}
