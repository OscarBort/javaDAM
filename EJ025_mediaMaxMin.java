import java.util.Scanner;
/**
 * 
 * @author Oscar Bort
 * 
 */
public class EJ025_mediaMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt(), sumando = 0, max = numero, min = numero;
        double contador = 0;

        if(numero == 0) {
            System.out.println("Necesito al menos un número diferente a 0: ");
            numero = sc.nextInt();
            min = numero;
        }

        while (numero != 0){
            sumando += numero;
            contador++;
            System.out.println("Llevamos un total de " + sumando + " en " + contador + " intentos.");
            if (numero > max){
                max = numero;
            }
            if (numero < min){
                min = numero;
            }
            System.out.print("Introduce más números o un 0 para salir: ");
            numero = sc.nextInt();
        }

        System.out.println("La media de todos los números es: " + (sumando/contador) + " el número más alto es " + max + " y el mínimo es " + min);

        sc.close();
    }
}
