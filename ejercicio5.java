import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int numero = 0;//declaracion de variable
        Scanner in = new Scanner(System.in);//instanciar objeto escanner
        
        System.out.println("\nEste programa pide un numero por consola y el resultado de multiplicarlo por los valores 1, 2, 3, ..., 10");
        System.out.print("\nIngresa un numero entero: ");
        numero = in.nextInt();
        in.close();
        System.out.println("");//se agrega un salto de linea para mejor visualizacion del codigo
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }
}
