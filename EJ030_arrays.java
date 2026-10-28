/**
 * @author Oscar Bort
 */
public class EJ030_arrays {
    public static void main(String[] args) {
    // Vamos a crear un array de 10 número enteros

    int muestra1 [] = new int[100];
    int max = 0, min = 0, sum = 0;

    for (int i = 0; i < muestra1.length; i++){
        muestra1[i] = (int)(Math.random() * 101 - 50);
        if (i == 0){
            max = muestra1[i];
            min = muestra1[i];
        }
        if (muestra1[i] > max) max = muestra1[i];
        if (muestra1[i] < min) min = muestra1[i];
        sum += muestra1[i];
    }
    // Java no recorre el array al imprimir, tienes que recorrerlo con un for para ver cada valor que tiene.
    for (int i = 0; i < muestra1.length; i++)
    System.out.println(muestra1[i]);

    System.out.println("El número más grande es " + max + " el menor es " + min + " y la media de todos es " + (sum/muestra1.length));

    // Por defecto un array de boolean se llena de false
    /*boolean vec1 [] = new boolean[5];
    for (int i = 0; i < vec1.length; i++) System.out.println(vec1[i]);
    */
    }
}
