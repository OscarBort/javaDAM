import java.util.Scanner;

/**
 * 
 * @author Oscar Bort
 * 
 */
public class EJ023_primosFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lim = 10;
        boolean esPrimo = true;

        for (int i = 2; i < lim; i++){
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
