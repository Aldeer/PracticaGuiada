import java.time.LocalDate;

public class Alumno {

    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String pais;
    
    
    public Alumno(String apellido, String nombre, LocalDate fechaNacimiento, String pais) {
        setApellido(apellido);
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setPais(pais);
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override

    public String toString(){
        return "{Apellido: " + getApellido() + " Nombre: " + getNombre() + 
        " Fecha de Nacimiento: " + getFechaNacimiento() + " Pais: " + getPais() + "}"; 
    }

}
