import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//instanciar la clase escaner
        int calificacion = 0;//declaracion de la variable calificacion
        System.out.println("\nEste programa devuelve un String con la calificacion del alumno.");
        System.out.print("Introduce el la calificacion del alumno: ");
        calificacion = in.nextInt();//introduccion del valor por consola
        in.close();
        System.out.println("\nCalificacion: " + devolverCalificacion(calificacion));
    }
    public static String devolverCalificacion (int num) {
        if (num >= 0 && num < 59) {
            return "Desaprobado";
        } else if (num < 75) {
            return "Bueno";
        } else if (num < 85) {
            return "Distinguido";
        } else if (num < 93) {
            return "Sobresaliente";
        } else if (num <= 100) {
            return "Excelente";
        } else {
            return "ERROR: numero incorrecto";
        }
    }
}
