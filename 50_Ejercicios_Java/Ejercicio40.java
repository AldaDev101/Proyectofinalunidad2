import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor inicial de maquinaria: ");
        double valorInicial = sc.nextDouble();
        System.out.print("Valor de rescate final: ");
        double valorRescate = sc.nextDouble();
        System.out.print("Anios de vida util: ");
        double vidaUtil = sc.nextDouble();
        
        double depreciacionAnual = (valorInicial - valorRescate) / vidaUtil;
        System.out.println("Costo de depreciacion anual: " + depreciacionAnual);
    }
}
