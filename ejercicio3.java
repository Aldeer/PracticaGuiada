import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//instanciar la clase escaner
        int calificacion = 0;//declaracion de la variable calificacion
        System.out.println("\nEste programa devuelve un String con la calificacion del alumno.");
        System.out.print("Introduce el la calificacion del alumno: ");
        calificacion = in.nextInt();//introduccion del valor por consola
        in.close();
        if (calificacion <= 100 && calificacion >= 93) {
            System.out.println("\nCalificacion: Excelente");
        } else if (calificacion < 93 && calificacion >= 85) {
            System.out.println("\nCalificacion: Sobresaliente");
        } else if (calificacion < 85 && calificacion >= 75) {
            System.out.println("\nCalificacion: Distinguido");
        } else if (calificacion < 75 && calificacion >= 60) {
            System.out.println("\nCalificacion: Bueno");
        } else if (calificacion < 60 && calificacion >= 0) {
            System.out.println("\nCalificacion: Desaprobado");
        } else {
            System.out.println("\nError: numero Incorrecto");
        }

    }
}
