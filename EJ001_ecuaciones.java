import java.util.Scanner;
import java.lang.Math;

public class EJ001_ecuaciones {
    public static void main(String[] args) {
        /** Ecuacion de primer grado */
        Scanner datos = new Scanner(System.in);
        /*System.out.println("Dame el primer valor.");
        double a = datos.nextInt();
        System.out.println("Dame el segundo valor.");
        double b = datos.nextInt();

        if(a != 0) {double despejado = -b / a;
        System.out.print("El resultado es: " + despejado);}
        else System.out.print("A no puede ser 0");*/

        // Ecuación segundo grado Ax2 + Bx + C = 0
        System.out.println("Dame el primer valor: ");
        double a = datos.nextDouble();
        System.out.println("Dame el segundo valor: ");
        double b = datos.nextDouble();
        System.out.println("Dame el tercer valor: ");
        double c = datos.nextDouble();

        double res1 = (-b - Math.sqrt(Math.pow(b, 2) -4 * a * c)) / (2 * a);
        double res2 = (-b + Math.sqrt(Math.pow(b, 2) -4 * a * c)) / (2 *a);

        System.out.println("El primer resultado es: " + res1);
        System.out.println("El primer resultado es: " + res2);

        datos.close();
    }
}
