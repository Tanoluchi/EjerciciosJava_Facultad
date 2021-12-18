import java.util.*;

/**
 * Clase VentaDeEntradas es una clase ejecutable
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class VentaDeEntradas
{
    public static void main(String[] args){
        /*  a) Instanciar un zoológico con el nombre “El Caribú”
        b) Instanciar tres individuos que asistieron al zoológico, uno de ellos en forma independiente y los otros dos 
        formando parte de la delegación “PAMI”, el día 22/09/2016
        c) Crear la delegación “PAMI”, que asistió el día indicado, e inscribir a los dos individuos. 
        d) Listar todos los visitantes que acudieron al zoológico el día 22/09/2016. 
        e) Listar la recaudación del último mes.
        f) Listar las delegaciones que acudieron el día 22/09/2016
         * 
         */
        ArrayList visitantes = new ArrayList();
        ArrayList individuos = new ArrayList();
        String nombreZoo, nombreVisitante, nombrePersona, apellidoPersona;
        int dni, anioNacimiento, opcion, anioVisita, mesVisita, diaVisita;
        Calendar fechaVisita = new GregorianCalendar();
        Calendar otraFecha = new GregorianCalendar(2016, 9, 30);
        char continuar = 's';
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar nombre del Zoologico: ");
        nombreZoo = teclado.nextLine();
        while(continuar != 'n' && continuar != 'N'){
            System.out.println("\nTipo de visitante");
            System.out.println("1- Delegacion, 2- Individuo");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if(opcion == 1){
                individuos.clear();
                System.out.println("Ingresar nombre de la delegacion: ");
                nombreVisitante = teclado.nextLine();
                System.out.println("Ingresar datos de la fecha de visita");
                System.out.println("Ingresar año de visita: ");
                anioVisita = teclado.nextInt();
                System.out.println("Ingresar mes de visita: ");
                mesVisita = teclado.nextInt() - 1;
                System.out.println("Ingresar dia de visita: ");
                diaVisita = teclado.nextInt();
                fechaVisita.set(anioVisita, mesVisita, diaVisita);
                teclado.nextLine();
                while(continuar != 'n' && continuar != 'N'){
                    System.out.println("\nOkay, ingresaremos los datos de los individuos de la delegacion");
                    System.out.println("Ingresar DNI: ");
                    dni = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresar nombre de Individuo: ");
                    nombrePersona = teclado.nextLine();
                    System.out.println("Ingresar apellido de Individuo: ");
                    apellidoPersona = teclado.nextLine();
                    System.out.println("Ingresar año de nacimiento: ");
                    anioNacimiento = teclado.nextInt();
                    Persona unaPersona = new Persona(dni, nombrePersona, apellidoPersona, anioNacimiento);
                    Visitante unIndividuo = new Individuo(nombrePersona, fechaVisita, unaPersona);
                    individuos.add(unIndividuo);
                    System.out.println("Desea seguir ingresando datos de integrantes? (S/N): ");
                    continuar = (teclado.next()).charAt(0);
                }
                Visitante unaDelegacion = new Delegacion(nombreVisitante, fechaVisita, individuos);
                visitantes.add(unaDelegacion);
                System.out.println("Desea seguir ingresando visitantes? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 2){
                System.out.println("Ingresar datos de fecha de visita");
                System.out.println("Ingresar año de visita: ");
                anioVisita = teclado.nextInt();
                System.out.println("Ingresar mes de visita: ");
                mesVisita = teclado.nextInt() - 1;
                System.out.println("Ingresar dia de visita: ");
                diaVisita = teclado.nextInt();
                fechaVisita.set(anioVisita, mesVisita, diaVisita);
                System.out.println("Ingresar DNI: ");
                dni = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingresar nombre de Individuo: ");
                nombrePersona = teclado.nextLine();
                System.out.println("Ingresar apellido de Individuo: ");
                apellidoPersona = teclado.nextLine();
                System.out.println("Ingresar año de nacimiento: ");
                anioNacimiento = teclado.nextInt();
                Persona unaPersona = new Persona(dni, nombrePersona, apellidoPersona, anioNacimiento);
                Visitante unIndividuo = new Individuo(nombrePersona, fechaVisita, unaPersona);
                visitantes.add(unIndividuo);
                System.out.println("Desea seguir ingresando visitantes? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else{
                System.out.println("No se ha encontrado esa opcion, intentalo de nuevo!");
            }
        }
        Zoologico unZoo = new Zoologico(nombreZoo, visitantes);
        System.out.println("Se ha creado el zoologico con los datos ingresados");
        continuar = 's';
        while(continuar != 'n' && continuar != 'N'){
            System.out.println("\nOperaciones disponibles");
            System.out.println("1- Agregar visitante, 2- Quitar visitante, 3- Listar tipo visitante por fecha, 4- Listar Visitante por fecha, 5- Mostrar Recaudacion por fecha, 6- Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if(opcion == 1){
                System.out.println("\nTipo de visitante");
                System.out.println("1- Delegacion, 2- Individuo");
                opcion = teclado.nextInt();
                teclado.nextLine();
                if(opcion == 1){
                    individuos.clear();
                    System.out.println("Ingresar nombre de la delegacion: ");
                    nombreVisitante = teclado.nextLine();
                    System.out.println("Ingresar datos de la fecha de visita");
                    System.out.println("Ingresar año de visita: ");
                    anioVisita = teclado.nextInt();
                    System.out.println("Ingresar mes de visita: ");
                    mesVisita = teclado.nextInt() - 1;
                    System.out.println("Ingresar dia de visita: ");
                    diaVisita = teclado.nextInt();
                    fechaVisita.set(anioVisita, mesVisita, diaVisita);
                    teclado.nextLine();
                    while(continuar != 'n' && continuar != 'N'){
                        System.out.println("\nOkay, ingresaremos los datos de los individuos de la delegacion");
                        System.out.println("Ingresar DNI: ");
                        dni = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingresar nombre de Individuo: ");
                        nombrePersona = teclado.nextLine();
                        System.out.println("Ingresar apellido de Individuo: ");
                        apellidoPersona = teclado.nextLine();
                        System.out.println("Ingresar año de nacimiento: ");
                        anioNacimiento = teclado.nextInt();
                        Persona unaPersona = new Persona(dni, nombrePersona, apellidoPersona, anioNacimiento);
                        Visitante unIndividuo = new Individuo(nombrePersona, fechaVisita, unaPersona);
                        individuos.add(unIndividuo);
                        System.out.println("Desea seguir ingresando datos de integrantes? (S/N): ");
                        continuar = (teclado.next()).charAt(0);
                    }
                    Visitante unaDelegacion = new Delegacion(nombreVisitante, fechaVisita, individuos);
                    unZoo.nuevoVisitante(unaDelegacion);
                    continuar = 's';
                }else if(opcion == 2){
                    System.out.println("Ingresar datos de fecha de visita");
                    System.out.println("Ingresar año de visita: ");
                    anioVisita = teclado.nextInt();
                    System.out.println("Ingresar mes de visita: ");
                    mesVisita = teclado.nextInt() - 1;
                    System.out.println("Ingresar dia de visita: ");
                    diaVisita = teclado.nextInt();
                    fechaVisita.set(anioVisita, mesVisita, diaVisita);
                    System.out.println("Ingresar DNI: ");
                    dni = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresar nombre de Individuo: ");
                    nombrePersona = teclado.nextLine();
                    System.out.println("Ingresar apellido de Individuo: ");
                    apellidoPersona = teclado.nextLine();
                    System.out.println("Ingresar año de nacimiento: ");
                    anioNacimiento = teclado.nextInt();
                    Persona unaPersona = new Persona(dni, nombrePersona, apellidoPersona, anioNacimiento);
                    Visitante unIndividuo = new Individuo(nombrePersona, fechaVisita, unaPersona);
                    unZoo.nuevoVisitante(unIndividuo);
                }else{
                    System.out.println("No se ha encontrado esa opcion, intentalo de nuevo!");
                }
            }else if(opcion == 2){
                if(unZoo.getVisitantes().size() >= 1){
                    ArrayList<Visitante> qVisitante = unZoo.getVisitantes();
                    System.out.println("Ingresar nombre: ");
                    nombreVisitante = teclado.nextLine();
                    for(int i = 0; i < qVisitante.size(); i++){
                        Visitante v = qVisitante.get(i);
                        if(v.getNombre().equals(nombreVisitante)){
                            unZoo.quitarVisitante(v);
                            System.out.println("Se ha eliminado el al visitante con exito!");
                        }
                    }
                }else{
                    System.out.println("No hay visitantes!");
                }
            }else if(opcion == 3){
                System.out.println("Ingresar tipo de visitante (Delegacion - Individuo)");
                String tipoVisitante = teclado.nextLine();
                System.out.println("Ingresar datos de fecha de visita");
                System.out.println("Ingresar año de visita: ");
                anioVisita = teclado.nextInt();
                System.out.println("Ingresar mes de visita: ");
                mesVisita = teclado.nextInt() - 1;
                System.out.println("Ingresar dia de visita: ");
                diaVisita = teclado.nextInt();
                fechaVisita.set(anioVisita, mesVisita, diaVisita);
                unZoo.listaTipoVisitantePorFecha(fechaVisita, tipoVisitante);
            }else if(opcion == 4){
                System.out.println("Ingresar datos de fecha de visita");
                System.out.println("Ingresar año de visita: ");
                anioVisita = teclado.nextInt();
                System.out.println("Ingresar mes de visita: ");
                mesVisita = teclado.nextInt() - 1;
                System.out.println("Ingresar dia de visita: ");
                diaVisita = teclado.nextInt();
                fechaVisita.set(anioVisita, mesVisita, diaVisita);
                unZoo.listaVisitantePorFecha(fechaVisita);
            }else if(opcion == 5){
                    System.out.println("Ingresar datos de fecha de inicio");
                System.out.println("Ingresar año de visita: ");
                anioVisita = teclado.nextInt();
                System.out.println("Ingresar mes de visita: ");
                mesVisita = teclado.nextInt() - 1;
                System.out.println("Ingresar dia de visita: ");
                diaVisita = teclado.nextInt();
                fechaVisita.set(anioVisita, mesVisita, diaVisita);
                
                System.out.println("Ingresar datos de fecha de fin");
                System.out.println("Ingresar año de visita: ");
                anioVisita = teclado.nextInt();
                System.out.println("Ingresar mes de visita: ");
                mesVisita = teclado.nextInt() - 1;
                System.out.println("Ingresar dia de visita: ");
                diaVisita = teclado.nextInt();
                otraFecha.set(anioVisita, mesVisita, diaVisita);
                
                System.out.println("Calculando la recaudacion entre las fechas...");
                System.out.println("La recaudacion total es de: " + unZoo.recaudacion(fechaVisita, otraFecha));
            }else if(opcion == 6){
                    continuar = 'n';
            }else{
                    System.out.println("No se ha encontrado esa opcion, intentalo de nuevo!");
            }
        }
        System.out.println("Se ha finalizado el programa!");
    }
}
