import java.util.Scanner;

public class EJ029_potenciaRecursivo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el valor que quieres potenciar: ");
        int base = sc.nextInt();
        System.out.print("Dime cuantas veces potenciarlo: ");
        int potencia = sc.nextInt();

        System.out.println(base + " elevado a " + potencia + " es igual a: " + potenciaIterativa(base, potencia));
        System.out.println(base + " elevado a " + potencia + " es igual a: " + potenciaRecursiva(base, potencia));

        sc.close();
    }

    public static int potenciaRecursiva(int a, int b) {
    if (b == 0) {
        return 1;
    }
    return a * potenciaRecursiva(a, b - 1);
}

    public static int potenciaIterativa(int a, int b){
        int sum = 1;
        for (int i = 1; i <= b; i++){
            sum *= a;
        }
        return sum;
    }
    
}