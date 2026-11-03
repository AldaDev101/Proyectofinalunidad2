import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas trabajadas: ");
        double horas = sc.nextDouble();
        System.out.print("Costo por hora: ");
        double costoHora = sc.nextDouble();
        
        double salarioNeto = ((horas * costoHora) * 0.88) - 150.0;
        System.out.println("Salario neto final: " + salarioNeto);
    }
}
