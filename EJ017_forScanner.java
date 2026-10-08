import java.util.Scanner;


/**
 * 
 * En este ejercicio pedimos dos números, los ordenamos y los recorremos con el for
 * @author Oscar Bort
 * 
 */
public class EJ017_forScanner {
    public static void main(String[] args) {
        
        int x, y, ini, fin;

        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un número: ");
        x = sc.nextInt();
        System.out.print("Dame otro número: ");
        y = sc.nextInt();

        if (x < y) {
            ini = x;
            fin = y;
        }
        else{
            ini = y;
            fin = x;
        }

        for (int i = ini; i <= fin; i++) {
            System.out.println(i);
        }
    sc.close();
    }
    
}
