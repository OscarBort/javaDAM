/**En este ejercicio añadimos el valor de x como String a medida que lo aumentamos y lo guardamos en la variable numeros con la coma como separador, y al final imprimimos todos los números.
     * 
     * 
     * @author Oscar
     * 
     */
public class EJ015_mostrarMil {

    
    public static void main(String[] args) {
        int x = 1, fin = 100;
        //String numeros = String.valueOf(x);
        
        /*while (x < fin){
            x++;
            numeros += ", " + x;
        }*/

        /*while (x > fin){
            x--;
            numeros += ", " + x;
        }
        System.out.println(numeros);*/


        while (x <= fin){
            if (x % 2 == 0 && x % 5 == 0) System.out.println(x + " es múltiplo de 2 y 5.");
            else if (x % 2 == 0) System.out.println(x + " es múltiplo de 2.");
            else if (x % 5 == 0) System.out.println(x + " es múltiplo de 5.");
            x++;
        }
    }
}
