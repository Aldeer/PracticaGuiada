package PracticaStream;

import java.math.BigDecimal;
import java.util.List;

public class ejercicio9 {
    public static void main(String[] args) {
        List<Producto> catalogoProductos = List.of(
            new Producto("Samsung j7", "Celulares", new BigDecimal("40000.00")),
            new Producto("Samsung s21", "Celulares", new BigDecimal("200000.00")),
            new Producto("Motorola edge", "Celulares", new BigDecimal("150000.00"))  
        );

        catalogoProductos.forEach(producto -> producto.setValor(
            producto.getValor().multiply(new BigDecimal("1.15")))
        );
        catalogoProductos.forEach(producto -> System.out.println(producto));
    }
}
