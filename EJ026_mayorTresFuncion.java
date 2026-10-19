import java.util.Scanner;

/**
 * 
 * @author Oscar Bort 
 * 
 */

public class EJ026_mayorTresFuncion {

    // La función debe estar dentro de class pero fuera de Main
    
    public static void mayor3(int x, int y, int z){
            if (x > y && x > z) System.out.println(x + " es el mayor.");
            else if (y > z) System.out.println(y + " es el mayor.");
            else System.out.println(z + " es el mayor.");
        }

    //Aquí ejecutamos el programa, lo de arriba es la función que llamamos en el main.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        
        mayor3(num1, num2, num3);

        sc.close();
    }
}
