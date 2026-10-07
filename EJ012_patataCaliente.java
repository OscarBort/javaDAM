import java.util.Scanner;
import java.lang.Math;

public class EJ012_patataCaliente {
    public static void main(String[] args) {

        //Creamos patata para que el usuario pruebe, el Math.random para coger un número del 1 al 10, y aciertos para llevar la cuenta
        int patata;
        final int ACIERTO = (int) (Math.random() * 10) + 1; // como el valor no debe variar, lo hacemos constante
        int contador = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número del 1 al 10: ");
        patata = sc.nextInt();

        // Si no acierta, le dice que el número secreto es mayor o menor, y le pedimos de nuevo el número y sumamos el contador, si acierta a la primera no entra al bucle y directamente lo felicita
        while (patata != ACIERTO) {
            if (patata < ACIERTO) System.out.println("Mayor");
            else System.out.println("Menor");
            System.out.print("Dime otro número: ");
            patata = sc.nextInt();
            contador++;
        }

        System.out.println("Correcto, el número era " + ACIERTO + ", solo has necesitado " + contador + " intentos.");
        sc.close();

    }
}
