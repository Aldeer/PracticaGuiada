package PracticaStream;

import java.math.BigDecimal;

public class Producto {
    private String nombre;
    private String tipo;
    private BigDecimal valor;
    
  

    public Producto(String nombre, String tipo, BigDecimal valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", tipo=" + tipo + ", valor=" + valor + "]";
    }
}
