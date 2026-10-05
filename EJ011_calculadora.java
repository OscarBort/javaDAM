import java.util.Scanner;

public class EJ011_calculadora {
    public static void main(String[] args) {

        Scanner opcion = new Scanner(System.in);

        System.out.println("Elige la opción: ");
        System.out.println("1 - sumar");
        System.out.println("2 - restar");
        System.out.println("3 - multiplicar");
        System.out.println("4 - dividir");
        System.out.println("0 - cerrar");

        int operacion = opcion.nextInt();

        switch (operacion) {
            case 1:
                System.out.print("Introduce el primer valor: ");
                int suma1 = opcion.nextInt();
                System.out.print("Introduce el segundo valor: ");
                int suma2 = opcion.nextInt();
                System.out.println("La suma es: " + (suma1 + suma2));
                break;
            case 2:
                System.out.print("Introduce el primer valor: ");
                int resta1 = opcion.nextInt();
                System.out.print("Introduce el segundo valor: ");
                int resta2 = opcion.nextInt();
                System.out.println("La suma es: " + (resta1 - resta2));
                break;
            case 3:
                System.out.print("Introduce el primer valor: ");
                int mult1 = opcion.nextInt();
                System.out.print("Introduce el segundo valor: ");
                int mult2 = opcion.nextInt();
                System.out.println("La suma es: " + (mult1 * mult2));
                break;
            case 4:
                System.out.print("Introduce el primer valor: ");
                int div1 = opcion.nextInt();
                System.out.print("Introduce el segundo valor: ");
                int div2 = opcion.nextInt();
                if (div2 > 0) System.out.println("La suma es: " + (div1 / div2));
                else System.out.print("No podemos dividir por 0 o negativo");
                break;
            case 0:
                System.out.println("Saliendo...");
            default:
                System.out.println("Numero no válido");
                break;
        }
    opcion.close();
    }
}
