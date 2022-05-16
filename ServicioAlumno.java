import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class ServicioAlumno {
     public static void main(String[] args) throws IOException {
        File archivo = new File("C:/Users/Emanuel/Documents/Java Info 2022/PracticaGuiada/Archivos/Alumnos.txt");
        System.out.println("\nArchivo: " + archivo.getName());

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            /* System.out.println(linea); */
            Alumno alumno = crearAlumno(linea);
            Integer edad = alumno.getFechaNacimiento() != null ? calcularEdad(alumno.getFechaNacimiento()) : null;

            System.out.println(String.format("Alumno: %s %s tiene la edad de %s años", alumno.getApellido(), 
                alumno.getNombre(), edad != null ? edad : "N/A"));
        }
        br.close();
    }

    private static int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate now = LocalDate.now();
        Integer edad = Period.between(fechaNacimiento, now).getYears();
        return edad;
    }

    private static Alumno crearAlumno(String linea) {
        String[] valor = linea.split(",");
        LocalDate fechaNacimiento;
        try {
            fechaNacimiento = LocalDate.parse(valor[2]);
        } catch (DateTimeParseException exception) {
            fechaNacimiento = null;
        }
        Alumno alumno = new Alumno(valor[0], valor[1], fechaNacimiento, valor[3]);
        return alumno;
    }     
}
