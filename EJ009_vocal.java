import java.util.Scanner;

public class EJ009_vocal {
    public static void main(String[] args) {
        
        char letra;
        Scanner sc = new Scanner(System.in);

        // Ahora pedimos una letra

        System.out.print("Introduce una letra: ");
        letra = sc.next().charAt(0);
        letra = Character.toLowerCase(letra);

        System.out.println(letra);
        // Ahora comparamos con las vocales para saber si es correcto, los char se comparan con ==, los string con .equals()

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') System.out.print("Es una vocal");
        else System.out.println("No es una vocal.");

        sc.close();

    }
}
