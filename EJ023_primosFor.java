import java.util.Scanner;

/**
 * 
 * @author Oscar Bort
 * 
 */
public class EJ023_primosFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lim = sc.nextInt();
        boolean esPrimo = true;
        /*
        En este ejercicio hacemos un primer bucle que recorre cada número hasta el límite, y dentro de este otro bucle que busca los primos hasta el límite de i, si hay un divisible, hace break y vuelve al primer bucle, reinicia a true y volvemos a empezar. */
        for (int i = 2; i <= lim; i++){
            esPrimo = true;
            for (int j = 2; j < i; j++){                
                if (i % j == 0){
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) System.out.println(i + " es primo.");
            else System.out.println(i + " no es primo");
        }        
        sc.close();
    }
}
