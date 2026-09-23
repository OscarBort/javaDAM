import java.util.Scanner;
public class Ejemplos2 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo: ");
        double base = datos.nextDouble();
        datos.nextLine();
        System.out.println("Ingrese la altura del rectángulo: ");
        double altura = datos.nextDouble();
        double area = base * altura;
        System.out.println("Es area del rectángulo es: " + area);
    }
}
