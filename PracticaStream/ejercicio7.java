package PracticaStream;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio7 {
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("200000.00");
    public static void main(String[] args) {
        List<Producto> catalagoProductos = List.of(
            new Producto("Samsung j7", "celular", new BigDecimal("40000.00")),
            new Producto("Samsung s21", "celular", new BigDecimal("200000.00")),
            new Producto("Motorola edge", "celular", new BigDecimal("150000.00"))
        );

        List<String> nombreProductosBaratos = catalagoProductos.stream()
            .filter(producto -> PRECIO_BUSQUEDA.compareTo(producto.getValor()) > 0)
            .map(producto -> producto.getNombre())
            .collect(Collectors.toList());
        System.out.println(nombreProductosBaratos);
    }
}
