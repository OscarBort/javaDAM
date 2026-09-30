import java.util.Scanner;

public class EJ008_cambioDinero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vamos a pedir un número entero, entonces empezaremos dividiendo por el siguiente número más grande entre 50, 20, 10, 5, 2 o 1. Cuando sepamos los que nos da, haremos un % por ese número, y si no da 0, pasaremos al siguiente más bajo.

        System.out.print("Dime cuanto dinero tienes: ");
        int dinero = sc.nextInt();
        int div50, div20, div10, div5, div2;

        // En cada if comprobamos si el valor es mayor que el billete, entonces comprobamos cuantos billetes tienes y con el % vemos el resto que nos queda y pasamos al siguiente billete.
        if (dinero >= 50){
            div50 = dinero / 50;
            System.out.println("Tienes " + div50 + " billetes de 50 euros.");
            dinero %= 50;
        }
        if (dinero >= 20){
            div20 = dinero / 20;
            System.out.println("Tienes " + div20 + " billetes de 20 euros.");
            dinero %= 20;
        }
        if (dinero >= 10){
            div10 = dinero / 10;
            System.out.println("Tienes " + div10 + " billetes de 10 euros.");
            dinero %= 10;
        }
        if (dinero >= 5){
            div5 = dinero / 5;
            System.out.println("Tienes " + div5 + " billetes de 5 euros.");
            dinero %= 5;
        }
        if (dinero >= 2){
            div2 = dinero / 2;
            System.out.println("Tienes " + div2 + " monedas de 2 euros.");
            dinero %= 2;
        }
        if (dinero >= 1) System.out.println("Tienes " + dinero + " moneda de 1 euro.");

        sc.close();
    }
}
