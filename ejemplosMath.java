//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
import java.lang.Math;
public class ejemplosMath {
    public static void main(String[] args) {
        // Area círculo
        double radio = 5.0;
        double areaCirculo = 2 * Math.PI * radio;
        System.out.println("El área del círculo es: " + areaCirculo);

        // Exponentes

        System.out.println("El resultado de 2 elevado a la 3 es: " + Math.pow(2, 3));

        // Raíz cuadrada

        System.out.println("La raiz cuadrada de 21 es: " + Math.sqrt(49));
    }
}
