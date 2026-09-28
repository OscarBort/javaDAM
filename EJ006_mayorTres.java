import java.util.Scanner;

public class EJ006_mayorTres {
    public static void main(String[] args) {
        int a, b, c;
        Scanner numero = new Scanner(System.in);

        System.out.print("Dame el primer número: ");
        a = numero.nextInt();
        System.out.print("Dame el segundo número: ");
        b = numero.nextInt();
        System.out.print("Dame el tercer número: ");
        c = numero.nextInt();

        if      (a > b && a > c) System.out.println(a + " es el mayor.");
        else if (b > c)          System.out.println(b + " es el mayor.");
        else                     System.out.println(c + " es el mayor.");
        numero.close();
    }
    
}
