public class EJ016_mostrarMilFor {

    /**En este bucle for mostraremos como lo recorre y como puedes hacerlo machacando una variable o no según su notación.
     * 
     * @author Oscar Bort
     * 
     */
    public static void main(String[] args) {
        int ini = 1, fin = 100;

        /** Con este primer bucle, asigno el valor de ini a i, y trabajo sobre i */
        for (int i = ini; i <= fin; i++) {
            System.out.println(i);
        }

        /** En este bucle, uso ini directamente y al acabar el bucle la sobreescribo y al acabar el for, ini vale lo que vale al final del bucle */
        for (; ini <= fin; ini++) {
            System.out.println(ini);
        }

    }
}
