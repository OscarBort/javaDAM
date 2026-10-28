import java.lang.Math;
public class EJ031_arraysNotas {
    public static void main(String[] args) {
        int alumnos[] = new int [13];
        int aprobados = 0, suspensos = 0, sobresalientes = 0;

        for (int i = 0; i < alumnos.length; i++){
            alumnos[i] = (int)(Math.random() * 11);
            if (alumnos[i] >= 5) aprobados++;
            else suspensos++;

            if (alumnos[i] >= 9) sobresalientes++;
            System.out.println("La primera nota es: " + alumnos[i]);
        }

        System.out.println("En este curso hay " + aprobados + " aprobados, " + suspensos + " suspensos y " + sobresalientes + " sobresalientes.");
    }   
}
