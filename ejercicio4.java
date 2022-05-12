import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int numero = 0, op = 1; //declaracion de variable
        Scanner in = new Scanner(System.in);//instanciar el objeto escaner
        
        while (op == 1){
            System.out.println("\nEste programa pide un numero del 1 al 7 y devuelve el dia de la semana segun el numero ingresado.");
            System.out.print("Introduce un numero del 1 al 7: ");
            numero = in.nextInt();//almacenamos el valor ingresado por consola
            System.out.println("Dia: " + devolverDiaDeLaSemana(numero));

            System.out.print("\nSi deseas continuar presina 1, de lo contrario cualquier otro numero: ");
            op = in.nextInt();
            if (op != 1){
                break;
            }
        }
        System.out.println("El programa ha finalizado");
        in.close();//cerramos el objeto escanner

       
    }
    public static String devolverDiaDeLaSemana(int num){
        switch (num){
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";
            default:
                return "Error: numero incorrecto";
        }
    }
}
