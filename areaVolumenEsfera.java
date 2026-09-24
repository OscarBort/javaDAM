import java.lang.Math;
//import java.util.Scanner;
public class areaVolumenEsfera {
    public static void main(String[] args) {
        /*Scanner radio = new Scanner(System.in);
        double r = radio.nextDouble();
        double area = 4 * Math.PI * Math.pow(r, 2);
        System.out.println("El area de una esfera es:" + area);
        datos.close()*/

        double alpha = 30;
        double tangente = Math.sin(alpha) / Math.cos(alpha);
        System.out.println("La tangente es: " + tangente);
        System.out.println(Math.tan(alpha));
    }
}
