/** En este ejercicio vamos a usar el while para contar la cantidad de números positivos y números negativos nos ha introducido el usuario */
import java.util.Scanner;

public class EJ013_contarPosNeg {
    public static void main(String[] args) {
        int pos = 0, neg = 0, x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un número entero: ");
        x = sc.nextInt();

        /** Una vez hemos declarado las variables y pedido el primer número entramos en el while y mientras sea diferente a 0, sumamos 1 al contador según si es positivo o negativo usando un if dentro del while para diferenciarlo.
         * Acabamos presentando un resumen del sumando de cada tipo de entero que nos han introducido
         */
        while (x != 0) {
            System.out.println("Has introducido el " + x);
            if(x > 0){
                pos++;
                System.out.println("LLevas " + pos + " números positivos.");
            }
            else {
                neg++;
                System.out.println("LLevas " + neg + " números negativos.");
            }           
            System.out.print("Dame otro número: ");
            x = sc.nextInt();
        }
        System.out.println("En total has metido " + pos + " números positivos y " + neg + " números negativos.");
        sc.close();
    }
}
