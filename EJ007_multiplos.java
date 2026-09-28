import java.util.Scanner;

public class EJ007_multiplos {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.print("Dame un número entero: ");
        int x = numero.nextInt();

        if      (x % 5 == 0 && x % 2 == 0) System.out.println(x + " es múltiplo de 2 y de 5");
        else if (x % 5 == 0)               System.out.println(x + " es múltiplo de 5 pero no de 2");
        else if (x % 2 == 0)               System.out.println(x + " es múltiplo de 2 pero no de 5");
        else                               System.out.println(x + "No es multiplo de 2 ni de 5");
        numero.close();
    }
}
