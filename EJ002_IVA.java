import java.util.Scanner;

public class EJ002_IVA {
    public static void main(String[] args) {
        Scanner iva = new Scanner(System.in);
        System.out.println("¿Qué IVA tienes: general, reducido o superreducido?");
        String tipo = iva.nextLine();
        System.out.println("Dime el precio del producto.");
        double precio = iva.nextDouble();
        switch (tipo){
            case "general":
            System.out.print("El precio total es: " + precio * 1.21);
            break;
            case "reducido":
            System.out.print("El precio total es: " + precio  * 1.10);
            break;
            case "superreducido":
            System.out.print("El precio total es: " + precio  * 1.04);
            break;
            default:
            System.out.print("Introduce unos datos válidos");            
            }
        iva.close();
    }
}
