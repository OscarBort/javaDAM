import java.util.Scanner;
import java.lang.Math;

/**
 * 
 * @author Oscar Bort
 * 
 */

public class EJ024_Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        char repetir = 'n';

        System.out.println("Que quieres calcular:");
        System.out.println("1 Raiz cubica de: ");
        System.out.println("2 Logaritmo base 10 de: ");
        System.out.println("3 Factorial de: ");
        System.out.println("4 N es primo: ");
        System.out.println("0 Cerrar");

        opcion = sc.nextInt();

        /* En este ejercicio pedimos un valor para hacer el cálculo que se nos pide, y después tenemos que pedir otro cálculo para repetir el proceso, para eso usamos el while, si quiere repetir el proceso pedimos de nuevo la opción, si no quiere repetir, le damos a opción valor 0 para que vaya al menú de salir, y este tiene un return para cerrar el programa entero */

        while (opcion != 0){
            if (repetir == 's'){
            System.out.println("Que quieres calcular:");
            System.out.println("1 Raiz cubica de: ");
            System.out.println("2 Logaritmo base 10 de: ");
            System.out.println("3 Factorial de: ");
            System.out.println("4 N es primo: ");
            System.out.println("0 Cerrar");
            
            repetir = 'n';
            opcion = sc.nextInt();
            }
        switch (opcion){
            case 1:
                System.out.print("Dime el valor a calcular: ");
                int valor = sc.nextInt();
                System.out.println("La raiz cúbica es: " + Math.cbrt(valor));
                System.out.print("Quieres hacer otro cálculo? S/N: ");
                repetir = Character.toLowerCase(sc.next().charAt(0));
                if (repetir == 'n'){
                    opcion = 0;
                }
                System.out.println("----------------\n");
                break;

            case 2:
                System.out.print("Dime el valor a calcular: ");
                int valor2 = sc.nextInt();
                System.out.println("El logaritmo base 10 es: " + Math.log10(valor2));
                System.out.print("Quieres hacer otro cálculo? S/N: ");
                repetir = Character.toLowerCase(sc.next().charAt(0));

                if (repetir == 'n'){
                    opcion = 0;
                }
                System.out.println("----------------\n");
                break;

            case 3:
                System.out.print("Dime el valor a calcular: ");
                int valor3 = sc.nextInt(), sumando = 1;
                for (int i = valor3; i >= 1; i--) {
                    sumando *= i;
                }
                System.out.println("El factorial es: " + sumando);
                System.out.print("Quieres hacer otro cálculo? S/N: ");
                repetir = Character.toLowerCase(sc.next().charAt(0));
                if (repetir == 'n'){
                    opcion = 0;
                }
                System.out.println("----------------\n");
                break;

            case 4:
                System.out.print("Dime el valor a calcular: ");
                int valor4 = sc.nextInt();
                boolean esPrimo = true;
                for (int i = 2; i < valor4; i++){                
                    if (valor4 % i == 0){
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) System.out.println(valor4 + " es primo.");
                else System.out.println(valor4 + " no es primo");
                System.out.print("Quieres hacer otro cálculo? S/N: ");
                repetir = sc.next().charAt(0);
                if (repetir == 'n'){
                    opcion = 0;
                }
                System.out.println("----------------\n");
                break;

            case 0: 
                System.out.println("Saliendo...");
                return;                
            default:
                System.out.println("Esa opción no es válida, introduce una correcta.");
                System.out.println("");
                System.out.println("Que quieres calcular:");
                System.out.println("1 Raiz cubica de: ");
                System.out.println("2 Logaritmo base 10 de: ");
                System.out.println("3 Factorial de: ");
                System.out.println("4 N es primo: ");
                System.out.println("0 Cerrar");
                opcion = sc.nextInt();
                break;
        }
        }
        sc.close();
    }
}
