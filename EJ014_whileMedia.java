import java.util.Scanner;

/** En este ejercicio calcularemos la media que nos da el total de los números introducidos por el usuario entre sus intentos
 * 
 * @author Oscar Bort
 * 
 * 
 */

public class EJ014_whileMedia {
    public static void main(String[] args) {
        int sumando = 0, x;
        double cont = 0;
        Scanner sc = new Scanner(System.in);

        /** Empezamos con un do para que todo esté dentro del bucle, guardamos cada valor que pedimos en x para poder comparar en el while, y llevamos la cuenta del sumando y el contador, una vez el usuario nos da 0 pasamos a realizar la media */

        do {
            System.out.print("Dame un número entero, el 0 finaliza el programa: ");
            x = sc.nextInt();
            sumando += x;
            System.out.println("Llevas un total de " + sumando);
            cont++;
        } while (x != 0);


        System.out.println("La suma de los valores es " + sumando + " en " + cont + " intentos, y la media es: " + (sumando/cont));

        sc.close();
    }
}
