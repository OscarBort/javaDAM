import java.util.Scanner;

public class EJ010_diasSemana {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número de 1 a 7: ");

        int dia = sc.nextInt();

        /*switch (dia) {
            case 1:
                System.out.println("Hoy es lunes.");
                break;
            case 2:
                System.out.println("Hoy es martes.");
                break;
            case 3:
                System.out.println("Hoy es miércoles.");
                break;
            case 4:
                System.out.println("Hoy es jueves.");
                break;
            case 5:
                System.out.println("Hoy es viernes.");
                break;
            case 6:
                System.out.println("Hoy es sábado.");
                break;
            case 7:
                System.out.println("Hoy es domingo.");
                break;
            default:
                System.out.println("Bebe menos red bull");
                break;
        }*/

        // En este ejemplo, aprovechamos que del 1 al 5 devuelven lo mismo para poner solo un break al final.
        switch (dia) {
            case 1:
                
            case 2:
                
            case 3:
                
            case 4:
                
            case 5:
                System.out.println("Es entre semana.");
                break;
            case 6:
                
            case 7:
                System.out.println("Es finde.");
                break;
            default:
                System.out.println("Bebe menos red bull");
                break;
        }
    sc.close();
    }
}
