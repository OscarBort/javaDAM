import java.util.Scanner;
import java.lang.Math;

/**
 * 
 * @author Oscar Bort
 * 
 */

public class EJ024A_calculadoraFunciones {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        

        /* En este ejercicio dividimos los cálculos en funciones, y una vez hecho el cálculo se repite hasta que el usuario pone un 0, al estar dentro del do, siempre se repite todo. */

        do {
            System.out.println("Que quieres calcular:");
            System.out.println("1 Raiz cubica de: ");
            System.out.println("2 Logaritmo base 10 de: ");
            System.out.println("3 Factorial de: ");
            System.out.println("4 N es primo: ");
            System.out.println("0 Cerrar");

            opcion = sc.nextInt();
        switch (opcion){
            case 1:
                raizCub();
                System.out.println();
                break;

            case 2:
                log10();
                System.out.println();
                break;

            case 3:
                factorial();
                System.out.println();
                break;

            case 4:
                esPrimo();
                System.out.println();
                break;

            case 0: 
                System.out.println("Saliendo...");
                return;                
            default:
                System.out.println("Esa opción no es válida, introduce una correcta.");
                System.out.println();
                break;
        }
        } while (opcion != 0);
        sc.close();
    }
    /**
     * En este método calculamos una raiz cúbica con la biblioteca Math. 
     */
    public static void raizCub(){
                System.out.print("Dime el valor a calcular: ");
                int valor = sc.nextInt();
                System.out.println("-----------------------");
                System.out.println("La raiz cúbica es: " + Math.cbrt(valor));
    }
    /**
     * En este método calculamos el logaritmo base 10 con la biblioteca Math.
     */
    public static void log10(){
                System.out.print("Dime el valor a calcular: ");
                int valor = sc.nextInt();
                System.out.println("-----------------------");
                System.out.println("El logaritmo base 10 es: " + Math.log10(valor));
    }
    /**
     * En este método el factorial de un número recorriendo el bucle for.
     */
    public static void factorial(){
                System.out.print("Dime el valor a calcular: ");
                int valor = sc.nextInt(), sumando = 1;
                for (int i = valor; i >= 1; i--) {
                    sumando *= i;
                }
                System.out.println("-----------------------");
                System.out.println("El factorial es: " + sumando);
    }
    /**
     * En este método si un número es primo.
     */
    public static void esPrimo(){
                System.out.print("Dime el valor a calcular: ");
                int valor = sc.nextInt();
                boolean esPrimo = true;
                for (int i = 2; i < valor; i++){                
                    if (valor % i == 0){
                        esPrimo = false;
                        break;
                    }
                }
                System.out.println("-----------------------");
                if (esPrimo) System.out.println(valor + " es primo.");
                else System.out.println(valor + " no es primo");
    }
}
