import java.util.Scanner;

/**
 * 
 * @author Oscar Bort
 * 
 */

public class EJ020_potenciaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame la base: ");
        int base = sc.nextInt();

        System.out.print("Dame la potencia: ");
        int pot = sc.nextInt();

        int total = base;

        // Aquí después de pedir la base y la potencia, recorremos multiplicando cada vuelta por el número base, hay que tener en cuenta que si le damos el valor base, tiene que dar una vuelta memos, si iniciamos total a 1, se pone el igual en la condición.
        for (int i = 1; i < pot; i++){
            total *= base;
        }

        System.out.println(base + " elevado a " + pot + " es igual a: " + total);

        sc.close();
    }
}
