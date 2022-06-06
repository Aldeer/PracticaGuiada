package PracticaStream;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class ejercicio4 {
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("200000.00");
    public static void main(String[] args) {
        List<Producto> catalgoProductos = List.of(
          new Producto("Samsun j7", "celular", new BigDecimal("40000.00")),
          new Producto("Samsung s21", "celular", new BigDecimal("200000.00")),
          new Producto("Motorola edge Special edition", "celular", new BigDecimal("159899.00"))  
        );

        Optional<Producto> productoBarato = catalgoProductos.stream()
            .filter(producto -> PRECIO_BUSQUEDA.compareTo(producto.getValor()) > 0)
            .findFirst();

        if(productoBarato.isPresent()){
            System.out.println("El primer producto que se encontro menor a $" + PRECIO_BUSQUEDA + " es " + productoBarato.get());
        } else {
            System.out.println("No se encontro un producto menor a $" + PRECIO_BUSQUEDA);
        }
    }

}

