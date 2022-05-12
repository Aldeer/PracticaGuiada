import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int numero = 0, op = 1;//declaracion de variable
        Scanner in = new Scanner(System.in);//instanciar objeto escanner
        
        while (op == 1){
            System.out.println("\nEste programa pide un numero por consola y el resultado de multiplicarlo por los valores 1, 2, 3, ..., 10");
            System.out.print("\nIngresa un numero entero: ");
            numero = in.nextInt();
            System.out.println("");//se agrega un salto de linea para mejor visualizacion del codigo
            devolverMultiplicaciones(numero);

            System.out.print("\nPresiona 1 para continuar, para terminar cualquier otro numero: ");
            op = in.nextInt();
            if(op != 1){
                break;
            }
        }
        System.out.println("\nEl programa ha finalizado");
        
        in.close();
        
    }
    public static int devolverMultiplicaciones(int numero){
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
        return 0;
    }
}
