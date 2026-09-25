import java.util.Scanner;

public class EJ004_angulosTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, total;
        System.out.print("Dime el primer ángulo: ");
        a = sc.nextDouble();
        System.out.print("Dime el segundo ángulo: ");
        b = sc.nextDouble();
        System.out.print("Dime el tercer ángulo: ");
        c = sc.nextDouble();
        total = a + b + c;
        if (total == 180) System.out.println("Es un triángulo");
        else System.out.println("No es un triángulo");
        sc.close();
    }
}
