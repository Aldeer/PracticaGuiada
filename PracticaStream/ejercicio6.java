package PracticaStream;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio6 {
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("200000.00");
    public static void main(String[] args) {
        List<Producto> catalgoProductos = List.of(
          new Producto("Samsun j7", "celular", new BigDecimal("40000.00")),
          new Producto("Samsung s21", "celular", new BigDecimal("200000.00")),
          new Producto("Motorola edge Special edition", "celular", new BigDecimal("159899.00"))  
        );

        List<Producto> productoBaratos = catalgoProductos.stream()
            .filter(producto -> PRECIO_BUSQUEDA.compareTo(producto.getValor()) > 0)
            .collect(Collectors.toList());
        System.out.println(productoBaratos);
    }

}

