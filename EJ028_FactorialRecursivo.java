public class EJ028_FactorialRecursivo {
    public static void main(String[] args) {
        factorialIterativo(7);
        

        System.out.println("El factorial recursivo de 7 es: " + factorialRecursivo(7));
    }
    
    public static void factorialIterativo(int n){
        int sum = 1;
        for (int i = n; i >= 1; i--){
            sum *= i;
        }

        System.out.println("El factoria iterativo de " + n + " es igual a " + sum);
    }

    public static int factorialRecursivo(int n){
        if (n == 0) return 1;
        return n * factorialRecursivo(n - 1);
    }
}
