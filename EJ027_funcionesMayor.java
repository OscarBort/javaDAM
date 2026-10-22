import java.util.Scanner;

public class EJ027_funcionesMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer valor: ");
        int num1 = sc.nextInt();
        System.out.print("Dame el segundo valor: ");
        int num2 = sc.nextInt();

        int mayor = EsMayor(num1, num2);

        System.out.println("El mayor de " + num1 + " y de " + num2 + " es el " + mayor);
        
        sc.close();
    }

    public static int EsMayor (int x, int y){
        if (x >= y) return x;
        else return y;
    }
}
