/**
 * 
 * @author Oscar Bort
 * 
 */

public class EJ018_sumarMil {
    public static void main(String[] args) {
        int sumando = 0;

        // En este bucle for recorremos los números del 1 al 1000, en cada vuelta i aumenta en uno su valor, y le añadimos el valor actual al sumando para que al acabar las vueltas, nos devuelva el total de sumar i en cada vuelta
        for (int i = 1; i <=1000; i++){
            sumando += i;
        }

        // Esta es la formula de Gauss que devuelve la suma siendo mil el último número en este caso y el 1 el primer número, para saber el número que nos tiene que devolver el bucle for.
        System.out.println((1000*(1000 + 1))/2);

        // La formula buena para calcular sin hardcodear es: sum = ((fin - ini + 1) * (ini + fin)) / 2
        //De esta forma, con el fin - ini + 1, calculamos el recorrido del bucle y se lo aplicamos a la formula.

        System.out.println("El total es: " + sumando);
    }
}
