import java.util.Scanner;

/**
 * 
 * @author Oscar Bort
 * 
 */

public class EJ021_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filas, columnas;
        String matriz = "";

        // Aquí vamos a pedir cuantas filas y columnas quiere el usuario, entonces creamos el primer for para controlar cuantas vueltas da las filas (de arriba a abajo), y dentro del mismo creamos otro for que cuenta las columnas (de izquierda a derecha), cuando j se completa, sale a i, hace el salto de linea y vuelve a entrar en j, hasta que i completa todas las vueltas y dibuja la matriz final.
        System.out.print("Dime las filas que quieres: ");
        filas = sc.nextInt();
        System.out.print("Dime las columnas que quieres: ");
        columnas = sc.nextInt();

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                matriz += "* ";
            }
            matriz += "\n";
        }
        System.out.println(matriz);
        sc.close();
    }
}
