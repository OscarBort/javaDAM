import java.util.Scanner;

public class EJ005_notasCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota: ");
        int nota = sc.nextInt();
        if (nota >= 0 && nota <=10) {
            if (nota == 10) System.out.println("Tienes un sobresaliente.");
            else if (nota >= 7) System.out.println("Tienes un notable");
            else if (nota >= 5) System.out.println("Aprobado por los pelos");
            else System.out.println("Prueba otra vez");
        }
        else System.out.println("Aprende a poner notas subnormal");
        sc.close();
    }
}
