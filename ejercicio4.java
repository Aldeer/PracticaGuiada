import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int numero = 0; //declaracion de variable
        Scanner in = new Scanner(System.in);//instanciar el objeto escaner
        System.out.println("\nEste programa pide un numero del 1 al 7 y devuelve el dia de la semana segun el numero ingresado.");
        System.out.print("Introduce un numero del 1 al 7: ");
        numero = in.nextInt();//almacenamos el valor ingresado por consola
        in.close();//cerramos el objeto escanner

        switch (numero){
            case 1:
                System.out.println("\nLunes");
                break;
            case 2:
                System.out.println("\nMartes");
                break;
            case 3:
                System.out.println("\nMiercoles");
                break;
            case 4:
                System.out.println("\nJueves");
                break;
            case 5:
                System.out.println("\nViernes");
                break;
            case 6:
                System.out.println("\nSabado");
                break;
            case 7:
                System.out.println("\nDomingo");
                break;
            default:
                System.out.println("\nError: numero fuera de rango");
                break;
        }
    }
}
