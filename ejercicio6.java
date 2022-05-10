import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        boolean contiunar = true;
        int numero = 0;
        Scanner in =  new Scanner(System.in);
        
        System.out.println("\nEste programa nos pide que ingrese un numero y lo muestra por pantalla.");
        while (contiunar) {
            System.out.print("\nPor favor, ingrese un numero: ");
            numero = in.nextInt();
            System.out.println("\nEl numero ingresado es " + numero);

            System.out.println("\nPresione 1 si desea continuar, o cualquier otro numero para finalizar");
            numero = in.nextInt();
            if (numero != 1) {
                break;
            }
        }
        in.close();
        System.out.println("\nEl programa ha finalizado");
    }
}
