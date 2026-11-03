import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Aportacion Socio A: ");
        double socioA = sc.nextDouble();
        System.out.print("Aportacion Socio B: ");
        double socioB = sc.nextDouble();
        System.out.print("Ganancia total: ");
        double gananciaTotal = sc.nextDouble();
        
        double gananciaSocioA = gananciaTotal * (socioA / (socioA + socioB));
        System.out.println("Ganancia correspondiente al Socio A: " + gananciaSocioA);
    }
}
