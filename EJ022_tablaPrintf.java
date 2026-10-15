import java.util.Scanner;

/**
 * 
 * @author Oscar Bort
 * 
 */

public class EJ022_tablaPrintf {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Hasta que número quieres la tabla?: ");
        int tabla = sc.nextInt(), resultado;

        /* En este for imprimimos con printf, en este caso ponemos %d para indicar que ponemos un entero, y los 02 significa que los números deben ocupar dos espacios y rellenar con 0 los espacios vacíos.
        Otros comandos de printf son:
        %s para String
        %f para decimales (si añadimos .2 redondeamos a dos decimales, pudiendo poner cualquier número en el 2)
        %b para Booleano
        %c para Char
        %n para Salto de linea */
        for (int i = 1; i <= tabla; i++){
            //System.out.println("Tabla del " + i + "\n");
            for (int j = 1; j <= 10; j++){
                resultado = i * j;
                System.out.printf("%02d X %02d = %03d\t", j, i, resultado);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
