package PracticaStream;

import java.math.BigDecimal;
import java.util.List;

public class ejercicio5 {
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("20000.00");
    public static void main(String[] args) {
        List<Producto> catalgoProductos = List.of(
          new Producto("Samsun j7", "celular", new BigDecimal("40000.00")),
          new Producto("Samsung s21", "celular", new BigDecimal("200000.00")),
          new Producto("Motorola edge Special edition", "celular", new BigDecimal("159899.00"))  
        );

        Producto productoBarato = catalgoProductos.stream()
            .filter(producto -> PRECIO_BUSQUEDA.compareTo(producto.getValor()) > 0)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("No se encontro producto menor a $"+ PRECIO_BUSQUEDA));

        System.out.println("El producto menor a " + PRECIO_BUSQUEDA + " es " + productoBarato);
    }

}

