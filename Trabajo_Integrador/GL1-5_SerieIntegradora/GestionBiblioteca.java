import java.util.*;

public class GestionBiblioteca 
{
    public static void main(String [] Args)
    {
        Calendar fechaHoy =  new GregorianCalendar();
        Calendar otraFecha = new GregorianCalendar(2020,11,8);
        
        // Instanciamos las colecciones
        ArrayList<Libro> libro = new ArrayList<Libro>();
        ArrayList<Socio> socio = new ArrayList<Socio>();
        // Instanciamos biblioteca
        Biblioteca biblioteca = new Biblioteca("Bibliote UNNE");
        
        // Agregamos libros a la biblioteca
        biblioteca.nuevoLibro("Java. Como Programar",100,"Moglia",2006);
        biblioteca.nuevoLibro("Vivir para Contarla",100,"El Principito",2002);
        biblioteca.nuevoLibro("Programando con Java",9,"oceano",2010);
        biblioteca.nuevoLibro("Algebra y geometria analitica",8,"kapeluz",1995);
        biblioteca.nuevoLibro("TURBO Pascal 7",10,"dunken",1999);
        
        // Agregamos socios docentes
        biblioteca.nuevoSocioDocente(30815263,"Daniel Mosqueda","Algebra");
        biblioteca.nuevoSocioDocente(26892060,"Cecilia Espindola","Informatica");
        biblioteca.nuevoSocioDocente(34718285,"Alfonzo Vallejos","Informatica");
        
        // Agregamos socios estudiantes
        biblioteca.nuevoSocioEstudiante(33123654,"Ivana Nadal","Lic en Quimica");
        biblioteca.nuevoSocioEstudiante(30626353,"Ana Marder","Ingenieria Electronica");
        biblioteca.nuevoSocioEstudiante(35363231,"Ivan Merk","L.S.I");
        biblioteca.nuevoSocioEstudiante(29636454,"Rodrigo Canteros","Profesorado matematica");
        biblioteca.nuevoSocioEstudiante(28989656,"Mariana Galvez","Lic. en biologia");       
        
        // Instanciamos un estudiante y un docente
        Estudiante estudiante1 = new Estudiante(37258621,"Marcos Contreras","Lic en Fisica");
        Docente docente1 = new Docente(25890060,"Fabian Escalante","Calculo");
        
        // Se los agrega a la coleccion de socios
        biblioteca.addSocio(estudiante1);
        biblioteca.addSocio(docente1);
        
        // Instanciamos 2 libros
        Libro libro1 = new Libro("Programacion Logica",10,"Corrientes",2006);
        Libro libro2 = new Libro("Calculo II",9,"Moglia",1998);
        
        // Agregamos los 2 libros a la biblioteca
        biblioteca.nuevoLibro("Programacion Logica",10,"Corrientes",2006);
        biblioteca.nuevoLibro("Calculo II",9,"Moglia",1998);
        
        // Se realiza el prestamo de libros
        biblioteca.prestarLibro(otraFecha,estudiante1,libro1);
        biblioteca.prestarLibro(otraFecha,docente1,libro2);
        
        Scanner teclado = new Scanner(System.in);
        int dni, edicion, anio, opcion, numero;
        String nombre, area, carrera, titulo, editorial, apellido; 
        System.out.println("**** Gestion de Biblioteca ****");
           do {
                char continuar = 's';
                System.out.println("\nSeleccione una opcion: ");
                System.out.println("1) Agregar un Nuevo Socio Docente");
                System.out.println("2) Agregar un Nuevo Socio Estudiante");
                System.out.println("3) Agregar un Nuevo Libro");
                System.out.println("4) Prestar un Libro");
                System.out.println("5) Devolver un Libro");
                System.out.println("6) Listar Docentes Responsables");
                System.out.println("7) Listar Socios");
                System.out.println("8) Listar Libros");
                System.out.println("9) Eliminar un Socio");
                System.out.println("10) Eliminar un Libro");
                System.out.println("11) Modificar Dias de Docente");
                System.out.println("12) Que socio tiene prestado el libro?"); 
                System.out.println("13) Finalizar Proceso de Gestion");
                opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            while(continuar != 'n' && continuar != 'N'){
                                System.out.println("*** Cargar nuevo Socio Docente ***\n");
                                System.out.println("Ingrese numero de D.N.I: "); 
                                dni = teclado.nextInt();
                                System.out.println("Ingrese Nombre: "); 
                                nombre = teclado.next();
                                System.out.println("Ingrese Apellido: "); 
                                apellido = teclado.next();
                                System.out.println("Ingrese Area: "); 
                                area = teclado.next();
                                biblioteca.nuevoSocioDocente(dni, (nombre + " " + apellido), area);
                                System.out.println("Se agregado al socio docente con exito!");
                                System.out.println("Desea seguir ingresando docentes? (S/N)");
                                continuar = teclado.next().charAt(0);
                            }
                       break;
                        
                    case 2:
                        while(continuar != 'n' && continuar != 'N'){
                            System.out.println("\t  *** Carga nuevo Socio Estudiante ***\n");
                            System.out.println("Ingrese numero de D.N.I: "); 
                            dni = teclado.nextInt();
                            System.out.println("Ingrese Nombre: "); 
                            nombre = teclado.next();
                            System.out.println("Ingrese Apellido: "); 
                            apellido = teclado.next();
                            System.out.println("Ingrese Carrera: "); 
                            carrera = teclado.next();
                            biblioteca.nuevoSocioEstudiante(dni, (nombre + " " + apellido), carrera);
                            System.out.println("Se ha agregado al socio estudiante con exito!");
                            System.out.println("Desea seguir ingresando estudiantes? (S/N)");
                            continuar = teclado.next().charAt(0);
                        }
                        break;  
                        
                    case 3:
                        System.out.println("*** Carga nuevo Libro ***\n");
                        System.out.println("Ingrese Titulo; "); 
                        titulo = teclado.next();
                        System.out.println("Ingrese Edicion: "); 
                        edicion = teclado.nextInt();
                        System.out.println("Ingrese Editorial: "); 
                        editorial = teclado.next();
                        System.out.println("Ingrese A??o de Publicacion: ");
                        anio = teclado.nextInt();
                        biblioteca.nuevoLibro(titulo, edicion, editorial, anio);
                        System.out.println("Se ha agregado el libro con exito!");
                        break;
                        
                    case 4:
                        System.out.println("\t*** Prestar un Libro ***\n");
                        // Imprimimos por pantalla los libros enumerados
                        for (int i = 0; i<biblioteca.getLibros().size(); i++){
                            System.out.println((i+1) + ") " + biblioteca.getLibros().get(i).toString());
                        }
                        
                        System.out.print("\nIngrese numero del Libro: "); 
                        numero = teclado.nextInt();
                        System.out.print("\nIngrese el numero de DNI del socio: "); 
                        dni = teclado.nextInt();
                        // Verificamos si el n??mero es un entero, y que no supere el tama??o de la coleccion de libros y por ??ltimo
                        // verificamos que socio (buscado por el dni) se encuentra registrado.
                        // si algo falla mostrara una leyenda de que ha ocurrido un error.
                        if (numero > 0 && numero <= biblioteca.getLibros().size() && biblioteca.buscarSocio(dni) != null){
                            // Si prestarLibro devuelve true significa que pudo ser prestado al socio solicitado.
                            // Entonces mostramos una leyenda de que se ha prestado al socio exitosamente.
                            // Caso contrario indicamos que el libro ya se encuentra prestado.
                            if (biblioteca.prestarLibro(fechaHoy, biblioteca.buscarSocio(dni), biblioteca.getLibros().get(numero - 1))){
                                System.out.println("\nEl " + biblioteca.getLibros().get(numero-1).toString());
                                System.out.println("Ha sido Prestado al Socio: " + biblioteca.buscarSocio(dni).toString());
                            }else{
                                System.out.println("\nEl " + biblioteca.getLibros().get(numero-1).toString());
                                System.out.println("Ya esta Prestado");
                            }
                        }else{
                            System.out.println("Ha ocurrido un error, no es posible prestar el libro.");
                        }
                        break;
                        
                    case 5:
                        System.out.println("\t*** Devolver Libro ***\n");
                        // Imprimimos por pantalla los libros enumerados
                        for (int i = 0; i<biblioteca.getLibros().size(); i++){
                            System.out.println((i+1) + ") " + biblioteca.getLibros().get(i).toString()); 
                        }
                        
                        System.out.print("\nIngrese el numero del Libro: "); 
                        numero = teclado.nextInt();
                        // Se verifica que el numero sea un entero y que no supere el tama??o de la coleccion de libros. Si cumple la condici??n
                        // entonces proseguimos a devolver el libro y mostramos la leyenda de que el libro ha sido devuelto.
                        // Si algo falla mostramos la leyenda "El numero ingresado es incorrecto!"
                        if (numero > 0 && numero <= biblioteca.getLibros().size()){
                            // Enviamos el mensaje de devolverLibro a biblioteca, le pasamos por parametro el libro indicado por el usuario.
                            // Esto se realiza enviando un mensaje de getLibros (Devuelve la coleccion de libros), luego traemos el libro
                            // ubicado en la posici??n numero - 1.
                            biblioteca.devolverLibro(biblioteca.getLibros().get( numero - 1));
                            System.out.println("\nEl Libro" + biblioteca.getLibros().get(numero - 1).toString() + " Ha sido Devuelto");
                        }else{
                            System.out.println("El numero ingresado es incorrecto!");
                        }
                        break;                    
                        
                    case 6:
                        System.out.println("\nLista de socios Responsable\n");
                        System.out.println(biblioteca.listaDeDocentesResponsables());
                        break;
                        
                    case 7:
                        System.out.println("\nLista de socios\n");
                        System.out.println(biblioteca.listaDeSocios());
                        break;
                    
                    case 8:
                        System.out.println("\nLista de Libros\n");
                        System.out.println(biblioteca.listaDeLibros());
                        break;
                        
                    case 9:
                        System.out.println("\t*** Eliminar Socio ***\n");
                        System.out.println("Ingrese el DNI del Socio: "); 
                        dni = teclado.nextInt();
                        // Verificamos que el socio exista, si existe proseguimos a eliminar el socio.
                        // Caso contrario mostramos la leyenda "El numero de socio no existe"
                        if (biblioteca.buscarSocio(dni) != null){
                            biblioteca.removeSocio(biblioteca.buscarSocio(dni));
                            System.out.println("\nEl socio ha sido eliminado correctamente!");
                        }else{
                            System.out.println("\nEl numero de socio no existe!");
                        }
                        break;
                        
                    case 10:
                        System.out.println("\t*** Eliminar Libro ***\n");
                        // Mostramos por pantalla los libros enumerados
                        for (int i = 0; i < biblioteca.getLibros().size(); i++){
                            System.out.println((i+1) + ") " + biblioteca.getLibros().get(i).toString());
                        }
                        
                        System.out.print("\nIngrese el numero del Libro: "); 
                        numero = teclado.nextInt();
                        // Verificamos que el numero sea un entero y que no supere el tama??o de la coleccion de libros. 
                        // Si pasa entonces proseguimos a eliminar el libro.
                        // Caso contrario mostramos la leyenda el numero ingresado no existe
                         if (numero > 0 && numero <= biblioteca.getLibros().size()){
                             System.out.println("\nEl Libro " + biblioteca.getLibros().get( numero - 1).toString() +" Ha sido eliminado correctamente");
                             biblioteca.removeLibro(biblioteca.getLibros().get( numero - 1));                             
                        }else{
                            System.out.println("\nEl numero ingresado no existe!");
                        }
                        break;
                    
                    case 11:
                        System.out.println("\t*** Modificar Dias de Docente ***\n");
                        // Mostramos la lista de docentes responsables a los cuales se les puede adicionar dias.
                        System.out.println(biblioteca.listaDeDocentesResponsables());
    
                        System.out.print("\nIngrese el numero de DNI del Docente: "); 
                        dni = teclado.nextInt();
                        System.out.print("Ingrese la Cantidad de Dias a Agregar: "); 
                        int nroDias = teclado.nextInt();
                        // Si el socio es un docente y sus numeros de dias es mayor a 0, entonces instanciamos un docente
                        // le asignamos los valores del socio docente encontrado por su dni. Y modificamos sus dias.
                        if (biblioteca.buscarSocio(dni).soyDeLaClase().equals("Docente") && nroDias > 0){
                            Docente Undocente = (Docente)biblioteca.buscarSocio(dni);
                            Undocente.agregarDiasDePrestamo(nroDias);
                            System.out.println("Se agregaron los dias ingresados");
                        }else{
                            System.out.println("No existe el dni ingresado!");
                        }
                        break;
                    
                    case 12:
                        System.out.println("\t*** Buscar Libro ***\n");
                        // Mostramos por pantalla los libros enumerados.
                        for (int i = 0; i < biblioteca.getLibros().size(); i++){
                            System.out.println((i+1) + ") " + biblioteca.getLibros().get(i).toString());
                        }
                        
                        System.out.print("\nIngrese el numero del Libro: "); 
                        numero = teclado.nextInt();
                        // Si el numero es entero y no supera el tama??o de la coleccion de libros, entonces enviamos un mensaje de quienTieneElLibro
                        // a Biblioteca y luego lo imprimimos por pantalla.
                        // Caso contrario mostrara que el numero ingresado no existe
                        if (numero > 0 && numero <= biblioteca.getLibros().size()){
                            System.out.println(biblioteca.quienTieneElLibro(biblioteca.getLibros().get(numero - 1)));
                        }else{
                            System.out.println("El numero ingresado no existe!");
                        }
                        break;
                        
                     case 13:
                            System.out.println("Se ha cerrado el programa con exito!");
                            System.exit(0);
                            break;
                            
                     default:
                            System.err.println("Opcion Invalida!");
                            break;
                }
            }while (opcion != 13);
    }
}