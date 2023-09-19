package pruebacompuesta;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Considerando un rango entre 1 y 10 para asignar la nota de un curso, el
 * programa ilustra la selección múltiple con la sentencia switch.
 *
 */

public class Pruebacompuesta {

    public static void main(String[] args) {
        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca calificación (1 - 10), pulse Intro:");
        nota = entrada.nextInt();
        switch (nota) {
            case 10:
            case 9:
                System.out.println("Excelente.");
                break;
            case 8:
            case 7:
                System.out.println("Notable.");
                break;
            case 6:
                System.out.println("Aprobado.");
            case 5:
                System.out.println("Reprobado.");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Suspendido.");
                break;
            default:
                System.out.println("no es posible esta nota.");
        }
        System.out.println("Final de programa.");
    }
}
