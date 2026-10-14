import java.util.Scanner;

/**
 * 
 * @author Oscar Bort
 * 
 */
public class EJ019_factorialFor {
    public static void main(String[] args) {
        int fact, sumando = 1;

        Scanner sc = new Scanner(System.in);

        fact = sc.nextInt();


        while (fact < 0) {
            System.out.print("El numero es incorrecto, mete otro: ");
            fact = sc.nextInt();
        }
        // En este for cogemos el numero inicial (que debe ser mayor de 1), y multiplicamos el número por su anterior para calcular su factorial
        for (int i = fact; i >= 1; i--) {
            sumando *= i;
        }

        System.out.println(sumando);
        sc.close();
    }
}
