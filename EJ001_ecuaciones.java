import java.util.Scanner;

public class EJ001_ecuaciones {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int a = datos.nextInt();
        int b = datos.nextInt();

        if(a != 0) {double despejado = -b / a;
        System.out.print("El resultado es: " + despejado);}
        else System.out.print("A no puede ser 0");
        datos.close();
    }
}
