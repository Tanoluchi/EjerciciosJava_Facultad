import java.util.*;
/**
 * Clase GestionHospital realiza la instancia de los objetos Hospital, Paciente y muestra por pantalla los datos filiatorios de un paciente.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class GestionHospital
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String paciente, domicilio, localidadVive, provinciaVive, localidadNacido, provinciaNacido, hospital, director;
        System.out.println("Ingrese historia clinica del paciente: ");
        int historiaClinica = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese nombre completo del paciente: ");
        paciente = teclado.nextLine();
        System.out.println("Ingrese domicilio del paciente: ");
        domicilio = teclado.nextLine();
        System.out.println("Ingrese localidad donde vive: ");
        localidadVive = teclado.nextLine();
        System.out.println("Ingrese provincia: ");
        provinciaVive = teclado.nextLine();
        System.out.println("Ingrese localidad donde nacio: ");
        localidadNacido = teclado.nextLine();
        System.out.println("Ingrese provincia: ");
        provinciaNacido = teclado.nextLine();
        System.out.println("Ingrese nombre del hospital: ");
        hospital = teclado.nextLine();
        System.out.println("Ingrese nombre completo del director: ");
        director = teclado.nextLine();
        
        Paciente unPaciente = new Paciente(historiaClinica, paciente, domicilio, new Localidad(localidadNacido, provinciaNacido), new Localidad(localidadVive, provinciaVive));
        Hospital unHospital = new Hospital(hospital, director);
        
        unPaciente.mostrarDatosPantalla();
        unPaciente.cadenaDeDatos();
        unHospital.consultaDatosFiliatorios(unPaciente);
    }
}
