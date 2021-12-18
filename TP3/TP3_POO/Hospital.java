
/**
 * Clase Hospital realiza una consulta de los datos filiatorios de un paciente.
 * 
 * @author Valenzuela Luciano
 * @version 9/2021
 */
public class Hospital
{
    private String nombreHospital;
    private String nombreDirector;
    /**
     * Constructor
     * @param String hospital, String director
     */
    public Hospital(String p_hospital, String p_director){
        setHospital(p_hospital);
        setDirector(p_director);
    }
    /**
     * Setters
     */
    private void setHospital(String p_hospital){
        this.nombreHospital = p_hospital;
    }
    private void setDirector(String p_director){
        this.nombreDirector = p_director;
    }
    /**
     * Getters
     */
    public String getHospital(){
        return nombreHospital;
    }
    public String getDirector(){
        return nombreDirector;
    }
    /**
     * Muestra por pantalla la informacion del hospital y del paciente.
     * @param Paciente p_paciente
     */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        Paciente elPaciente = p_paciente; 
        System.out.println("Hospital: " + this.getHospital() + " - " + this.getDirector());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Paciente: " + elPaciente.getNombre() + " - " + "Historia Clinica: " + elPaciente.getHistoria() + " - " + elPaciente.getDomicilio());
        System.out.println("Localidad: " + elPaciente.getVive().getNombre() + " - " + "Provincia: " + elPaciente.getVive().getProvincia());
    }
}
