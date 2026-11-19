/**
 * @author Oscar Bort
 * En este ejercicio recorremos una matriz asignándole valores entre 1 y 9, ayudándonos del auxiliar para asignar los números correctos, dado que a diferencia de un array simple, como tenemos dos capas hay que usar un aux exterior
 */
public class EJ032Matriz {
    public static void main(String[] args) {
        int filas = 3, columnas = 3;
        int matriz [][] = new int[filas][columnas];
        //Como matriz ya está asignada, al método solo le mandamos la variable, no es necesario usar los corchetes
        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
    }

    public static void rellenarMatriz(int [][] matriz){
        int aux = 1;
        for (int i = 0; i < matriz.length; i++){
            for  (int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = aux;
                aux++;
            }            
        }
    }

    public static void imprimirMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for  (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
