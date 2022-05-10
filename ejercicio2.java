import java.util.Scanner;

public class ejercicio2 {
    public static void main(String [] args) {
        int num1 = 0, num2 = 0, num3= 0;//declaracion de las variables donde se van a almacenar los 3 numeros
        Scanner in =  new Scanner(System.in);//instanciar el objeto escaner
        System.out.print("\nIngresa el primer numero: ");
        num1 = in.nextInt();//se almacena el primer numero ingresado por consola
        System.out.print("Ingresa el segundo numero: ");
        num2 = in.nextInt();//se almacena el segundo numero ingresado por consola
        System.out.print("Ingresa el tercer numero: ");
        num3 = in.nextInt();//se almacena el tercer numero ingresado por consola
        in.close();//cerramos el objeto escanner instanciado luego de ingresar los valores
        //imprimimos en consola los valores ingresados y almacenados 
        System.out.println(mostrarNumerosIngresadosEnOrden(num1, num2, num3));
    }
    public static String mostrarNumerosIngresadosEnOrden (int a, int b, int c) {
        return "\nEl primer n° es " + a +
        "\nEl segundo n° es " + b + 
        "\nEl tercer n° es " + c;
    }
}
