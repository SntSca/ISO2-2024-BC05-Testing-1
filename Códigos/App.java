
import java.time.LocalDate;
import java.util.Scanner;
import Persona;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Persona persona = new Persona();
        
        System.out.print("Introduce el nombre: ");
        persona.setNombre(scanner.nextLine());

        System.out.print("Introduce la fecha de nacimiento (formato: yyyy-mm-dd): ");
        String fechaNacimientoStr = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        persona.setFechaNacimiento(fechaNacimiento);

        System.out.print("Introduce la titulación: ");
        persona.setTitulacion(scanner.nextLine());

        System.out.print("Introduce la nacionalidad: ");
        persona.setNacionalidad(scanner.nextLine());

        System.out.print("Introduce el número de teléfono: ");
        persona.setNumeroTelefono(scanner.nextLine());

        System.out.print("Introduce el correo electrónico: ");
        persona.setCorreoElectronico(scanner.nextLine());

        System.out.println("Es elegible para matricularse: " + persona.esElegibleParaMatricularse());

        scanner.close();
    }
}

