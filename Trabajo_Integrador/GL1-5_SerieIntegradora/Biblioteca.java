import java.util.*;

/**
 * Clase Biblioteca
 * 
 * @author Valenzuela Luciano Juan Ignacio 
 */
public class Biblioteca
{
    private String nombre;
    private ArrayList<Socio> socios;
    private ArrayList<Libro> libros;
    /**
     * Constructor
     * @param String nombre
     */
    public Biblioteca(String p_nombre){
        this.setNombre(p_nombre);
        this.setLibros(new ArrayList<Libro>());
        this.setSocios(new ArrayList<Socio>());
    }
    /**
     * Setters
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setLibros(ArrayList<Libro> p_libros){
        this.libros = p_libros;
    }
    private void setSocios(ArrayList<Socio> p_socios){
        this.socios = p_socios;
    }
    /**
     * Getters
     */
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Libro> getLibros(){
        return this.libros;
    }
    public ArrayList<Socio> getSocios(){
        return this.socios;
    }
    /**
     * Agrega un nuevo socio a la coleccion socios
     * @param Socio socio
     */
    public void addSocio(Socio p_socio){
        this.getSocios().add(p_socio);
    }
    /**
     * Quita un socio de la coleccion socios
     * @param Socio socio
     */
    public void removeSocio(Socio p_socio){
        this.getSocios().remove(p_socio);
    }
    /**
     * Agrega un nuevo libro a la coleccion libros
     */
    private void addLibro(Libro p_libro){
        this.getLibros().add(p_libro);
    }
    /**
     * Quita un libro de la coleccion libros
     */
    public void removeLibro(Libro p_libro){
        this.getLibros().remove(p_libro);
    }
    /**
     * Se instancia un libro y luego se agrega a la coleccion de libros
     */
    public void nuevoLibro(String p_titulo, int p_edicion, String p_editorial, int p_anio){
        Libro unLibro = new Libro(p_titulo, p_edicion, p_editorial, p_anio);
        this.addLibro(unLibro);
    }
    /**
     * Se instancia a un alumno y luego se agrega a la coleccion de socios
     */
    public void nuevoSocioEstudiante(int p_dniSocio, String p_nombre, String p_carrera){
        Socio unEstudiante = new Estudiante(p_dniSocio, p_nombre, p_carrera);
        this.addSocio(unEstudiante);
    }
    /**
     * Se instancia a un docente y luego se agrega a la coleccion de socios
     */
    public void nuevoSocioDocente(int p_dniSocio, String p_nombre, String p_area){
        Socio unDocente = new Docente(p_dniSocio, p_nombre, p_area);
        this.addSocio(unDocente);
    }
    /**
     * Devuelve la cantidad de socios del tipo pasado por parametro.
     * @param String tipo_socio
     * @return cantidad de socios de un tipo.
     */
    public int cantidadSociosPorTipo(String p_objeto){
        int contador = 0;
        for(Socio s: this.getSocios()){
            if(s.soyDeLaClase().equals(p_objeto)){
                contador += 1;
            }
        }
        return contador;
    }
    /**
     * Se crea un prestamo, luego se le agrega al libro y al socio.
     * @param Calendar fechaRetiro, Socio socio, Libro libro
     * @return true o false
     */
    public boolean prestarLibro(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro){
        boolean presta = false;
        if(p_socio.puedePedir() == true && p_libro.prestado() == false){
            Prestamo unPrestamo = new Prestamo(p_fechaRetiro, p_socio, p_libro);
            p_libro.addPrestamo(unPrestamo);
            p_socio.addPrestamo(unPrestamo);
            presta = true;
        }
        return presta;
    }
    /**
     * Realiza una verificacion, si el libro esta prestado entonces se prosigue a devolverlo, 
     * se asigna la fecha de devolución del prestamo con la fecha actual.
     * @param Libro libro
     */
    public void devolverLibro(Libro p_libro){
        // Asigna la fecha de devolución del préstamo con la fecha actual.
        Calendar fecha = Calendar.getInstance();
        if(p_libro.prestado() == true){
             p_libro.getPrestamo().registrarFechaDevolucion(fecha);
        }
    }
    /**
     * Verifica que prestamos estan vencidos y los agrega a una coleccion de prestamos vencidos.
     * @return coleccion de prestamos vencidos.
     */
    public ArrayList<Prestamo> prestamosVencidos(){
        Calendar fecha_actual = Calendar.getInstance();
        ArrayList<Prestamo> prestamosVencidos = new ArrayList<Prestamo>();
        for(Libro l: this.getLibros()){ // Recorremos libros
           for(Prestamo prestamo: l.getPrestamos()){ // Por cada libro, recorremos su coleccion de prestamos
               if(prestamo.vencido(fecha_actual) == true){ // Si el prestamo esta vencido, proseguimos a agregarlo a la coleccion de prestamos vencidos.
                    prestamosVencidos.add(prestamo);
            }
           }  
        }
        return prestamosVencidos;
    }
    /**
     * Verificamos si el docente es responsable, si lo es lo agregamos a la coleccion
     * de docentes responsables.
     * @return coleccion de docentes
     */
    public ArrayList<Docente> docentesResponsables(){
        ArrayList<Docente> docentesResponsables = new ArrayList();
        Docente docente;    
        for(Socio s: this.getSocios()){ // Recorremos la coleccion de socios
            if(s.soyDeLaClase().equals("Docente")){ // Verificamos si el socio es un docente
                docente = (Docente)s; // Se inicializa docente con el socio docente
                if(docente.esResponsable() == true){ // Si es un docente, verificamos si es responsable. Si es así se agrega a la coleccion.
                    docentesResponsables.add(docente);
                }
            }
        }
        return docentesResponsables;
    }
    /**
     * Realizamos una verificacion, si el libro esta prestado entonces retornamos
     * el nombre de el que posee el libro pasado por parametro. Caso contrario
     * se retorna "El libro se encuentra en la biblioteca".
     * @param Libro libro
     * @return String de quien tiene el libro.
     */
    public String quienTieneElLibro(Libro p_libro){
        if(p_libro.prestado() == true){
            return p_libro.getPrestamo().getSocio().getNombre();
        }else{
            return "El libro se encuentra en la biblioteca";
        }
    }
    /**
     * Devuelve una lista con todos los socios.
     * @return lista de socios.
     */
    public String listaDeSocios(){
        /*
         * 1) D.N.I.: <<dni>> || <<nombre y apellido>> (<<tipo>>) || Libros Prestados: <<cant. prést. actuales >>
         */
        String myString = "";
        int contador = 1;
        for(Socio s: this.getSocios()){
            myString += contador + ") " + s.toString() + "\n";
            contador++;
        }
        myString += "**************************************\n";
        myString += "Cant. Socios tipo Estudiante: " + this.cantidadSociosPorTipo("Estudiante") + "\n";
        myString += "Cant. Socios tipo Docente: " + this.cantidadSociosPorTipo("Docente") + "\n";
        myString += "**************************************\n";
        
        return myString;
    }
    /**
     * Devuelvela lista de libros en forma de String.
     * @return String lista de libros.
     */
    public String listaDeLibros(){
        /*
         * 1) Titulo: JAVA. Como Programar || Prestado: (No)
         */
        String myString = "";
        for(int i = 0; i < this.getLibros().size(); i++) {
            
            if(this.getLibros().get(i).prestado() == true) {
                myString = myString + (i+1) +") " + this.getLibros().get(i).toString() + " || Prestado: (SI)\n";
            }else {
                myString = myString + (i+1) + ") " + this.getLibros().get(i).toString() + " || Prestado: (NO)\n";
            }
            
        }
        return myString;
    }
    /**
     * Devuelve la lista de docentes responsables como un string.
     * @return String lista de docentes responsables.
     */
    public String listaDeDocentesResponsables(){
       String myString = "";
        
        for(int i = 0; i < this.docentesResponsables().size(); i++) {
            myString = myString + "* " + this.docentesResponsables().get(i).toString() + "\n";
        }
        
        return myString;        
    }
    /**
     * Se busca a un socio con el dni pasado por parametro.
     * @param int dni
     * @return Socio
     */
    public Socio buscarSocio(int dni){
        for(Socio s: this.getSocios()){ // Recorremos la coleccion de socios
            if(s.getDniSocio() == dni){ // Se verifica si el dni del socio es igual al pasado por parametro.
                return s; // Si pasa la verificacion, se devuelve al socio.
            }
        }
        // Si no se encuentra al socio entonces se retornara null.
        return null;
    }
}
