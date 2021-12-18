import java.util.*;
import java.util.ArrayList;

/**
 * Clase AplicacionFacultad es una clase ejecutable
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class AplicacionFacultad
{
    public static void main(String[] args){
        String nombreFacultad, titulo, nombreProfesor, apellidoProfesor, nombreCargo;
        ArrayList<Profesor>profesores = new ArrayList();
        Cargo[] cargos;
        int dni, anioNacimiento, anioIngreso, horasDeDocencia, horasDeInvestigacion, horasDeExtension, opcion, contador;
        double sueldoBasico;
        char continuar = 's';
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese nombre de Facultad: ");
        nombreFacultad = teclado.next();
        while(continuar != 'n' && continuar != 'N'){
            contador = 0;
            cargos = new Cargo[3];
            System.out.println("Ingresar datos del profesor: ");
            System.out.println("\nIngresar DNI: ");
            dni = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingresar nombre: ");
            nombreProfesor = teclado.nextLine();
            System.out.println("Ingresar apellido: ");
            apellidoProfesor = teclado.nextLine();
            System.out.println("Ingresar año de nacimiento: ");
            anioNacimiento = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingresar titulo: ");
            titulo = teclado.nextLine();
            while(continuar != 'n' && continuar != 'N'){
                if(cargos[2] == null){
                    System.out.println("Ingrese los datos del cargo (1- Simple, 2- Semi exclusivo, 3-Exclusivo): ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    if(opcion == 1){
                        System.out.println("\nIngrese el nombre del cargo: ");
                        nombreCargo = teclado.nextLine();
                        System.out.println("Ingrese el sueldo basico: ");
                        sueldoBasico = teclado.nextDouble();
                        System.out.println("Ingrese el año de ingreso: ");
                        anioIngreso = teclado.nextInt();
                        horasDeDocencia = 10;
                        cargos[contador]= new Cargo(nombreCargo, sueldoBasico, anioIngreso, horasDeDocencia);
                        contador++;
                        System.out.println("Desea seguir ingresando datos de cargos? (S/N): ");
                        continuar = (teclado.next()).charAt(0);
                    }else if(opcion == 2){
                        System.out.println("\nIngrese el nombre del cargo: ");
                        nombreCargo = teclado.nextLine();
                        System.out.println("Ingrese el sueldo basico: ");
                        sueldoBasico = teclado.nextDouble();
                        System.out.println("Ingrese el año de ingreso: ");
                        anioIngreso = teclado.nextInt();
                        System.out.println("Ingrese las horas de docencia (10 hrs minimo y 20 maximo): ");
                        horasDeDocencia = teclado.nextInt();
                        if(horasDeDocencia != 20){
                            horasDeInvestigacion = 10;
                        }else{
                            horasDeInvestigacion = 0;
                        }
                        cargos[contador]= new SemiExclusivo(nombreCargo, sueldoBasico, anioIngreso, horasDeDocencia, horasDeInvestigacion);
                        contador++;
                        System.out.println("Desea seguir ingresando datos de cargos? (S/N): ");
                        continuar = (teclado.next()).charAt(0);
                    }else if(opcion == 3){
                        System.out.println("\nIngrese el nombre del cargo: ");
                        nombreCargo = teclado.nextLine();
                        System.out.println("Ingrese el sueldo basico: ");
                        sueldoBasico = teclado.nextDouble();
                        System.out.println("Ingrese el año de ingreso: ");
                        anioIngreso = teclado.nextInt();
                        System.out.println("Ingrese las horas de docencia: ");
                        horasDeDocencia = teclado.nextInt();
                        System.out.println("Ingrese las horas de investigacion: ");
                        horasDeInvestigacion = teclado.nextInt();
                        System.out.println("Ingrese las horas de extension: ");
                        horasDeExtension = teclado.nextInt();
                        cargos[contador]= new Exclusivo(nombreCargo, sueldoBasico, anioIngreso, horasDeDocencia, horasDeInvestigacion, horasDeExtension);
                        contador++;
                        System.out.println("Desea seguir ingresando datos de cargos? (S/N): ");
                        continuar = (teclado.next()).charAt(0);
                    }else{
                        System.out.println("Usted no ha seleccionado una de las opciones, vuelva a intentar!");
                    }
                }else{
                        System.out.println("Lo lamento, un profesor solo puede tener 3 cargos");
                        break;
                    }   
            }
            Profesor unProfesor = new Profesor(dni, nombreProfesor, apellidoProfesor, anioNacimiento, titulo, cargos);
            profesores.add(unProfesor);
            System.out.println("Desea seguir ingresando datos de profesores? (S/N): ");
            continuar = (teclado.next()).charAt(0);
        }
        Facultad unaFacultad = new Facultad(nombreFacultad, profesores);
        continuar = 's';
        while(continuar != 'n' && continuar != 'N'){
            System.out.println("¿Que desea hacer?");
            System.out.println("**** 1- Agregar profesor, 2- Quitar profesor, 3- Mostrar nomina de profesores, 4- Mostrar total a pagar, 5- Listar profesores con sus cargos, 6- Salir ****");
            opcion = teclado.nextInt();
            if(opcion == 1){
                contador = 0;
                cargos = new Cargo[3];
                System.out.println("Ingresar datos del profesor: ");
                System.out.println("\nIngresar DNI: ");
                dni = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingresar nombre: ");
                nombreProfesor = teclado.nextLine();
                System.out.println("Ingresar apellido: ");
                apellidoProfesor = teclado.nextLine();
                System.out.println("Ingresar año de nacimiento: ");
                anioNacimiento = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingresar titulo: ");
                titulo = teclado.nextLine();
                while(continuar != 'n' && continuar != 'N'){
                    if(cargos[2] == null){
                        System.out.println("Ingrese los datos del cargo (1- Simple, 2- Semi exclusivo, 3-Exclusivo): ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        if(opcion == 1){
                            System.out.println("\nIngrese el nombre del cargo: ");
                            nombreCargo = teclado.nextLine();
                            System.out.println("Ingrese el sueldo basico: ");
                            sueldoBasico = teclado.nextDouble();
                            System.out.println("Ingrese el año de ingreso: ");
                            anioIngreso = teclado.nextInt();
                            horasDeDocencia = 10;
                            cargos[contador]= new Cargo(nombreCargo, sueldoBasico, anioIngreso, horasDeDocencia);
                            contador++;
                            System.out.println("Desea seguir ingresando datos de cargos? (S/N): ");
                            continuar = (teclado.next()).charAt(0);
                        }else if(opcion == 2){
                            System.out.println("\nIngrese el nombre del cargo: ");
                            nombreCargo = teclado.nextLine();
                            System.out.println("Ingrese el sueldo basico: ");
                            sueldoBasico = teclado.nextDouble();
                            System.out.println("Ingrese el año de ingreso: ");
                            anioIngreso = teclado.nextInt();
                            System.out.println("Ingrese las horas de docencia (10 hrs minimo y 20 maximo): ");
                            horasDeDocencia = teclado.nextInt();
                            if(horasDeDocencia != 20){
                                horasDeInvestigacion = 10;
                            }else{
                                horasDeInvestigacion = 0;
                            }
                            cargos[contador]= new SemiExclusivo(nombreCargo, sueldoBasico, anioIngreso, horasDeDocencia, horasDeInvestigacion);
                            contador++;
                            System.out.println("Desea seguir ingresando datos de cargos? (S/N): ");
                            continuar = (teclado.next()).charAt(0);
                        }else if(opcion == 3){
                            System.out.println("\nIngrese el nombre del cargo: ");
                            nombreCargo = teclado.nextLine();
                            System.out.println("Ingrese el sueldo basico: ");
                            sueldoBasico = teclado.nextDouble();
                            System.out.println("Ingrese el año de ingreso: ");
                            anioIngreso = teclado.nextInt();
                            System.out.println("Ingrese las horas de docencia: ");
                            horasDeDocencia = teclado.nextInt();
                            System.out.println("Ingrese las horas de investigacion: ");
                            horasDeInvestigacion = teclado.nextInt();
                            System.out.println("Ingrese las horas de extension: ");
                            horasDeExtension = teclado.nextInt();
                            cargos[contador]= new Exclusivo(nombreCargo, sueldoBasico, anioIngreso, horasDeDocencia, horasDeInvestigacion, horasDeExtension);
                            contador++;
                            System.out.println("Desea seguir ingresando datos de cargos? (S/N): ");
                            continuar = (teclado.next()).charAt(0);
                        }else{
                            System.out.println("Usted no ha seleccionado una de las opciones, vuelva a intentar!");
                        }
                    }else{
                        System.out.println("Lo lamento, un profesor solo puede tener 3 cargos");
                        break;
                    }
                }
                Profesor unProfesor = new Profesor(dni, nombreProfesor, apellidoProfesor, anioNacimiento, titulo, cargos);
                unaFacultad.agregarProfesor(unProfesor);
                System.out.println("Desea seguir realizando operaciones? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 2){
                if(unaFacultad.getProfesores().size() == 1){
                    System.out.println("Lo lamento, no podemos realizar esta accion cuando posee un 1 profesor");
                }else{
                    ArrayList<Profesor> qProfesor = unaFacultad.getProfesores();
                    System.out.println("Ingrese DNI del profesor a eliminar: ");
                    dni = teclado.nextInt();
                    for(int i = 0; i < qProfesor.size(); i++){
                        Profesor p = qProfesor.get(i);
                        if(p.getDNI() == dni){
                            unaFacultad.quitarProfesor(p);
                            System.out.println("Se ha eliminado con exito!");
                        }
                    }
                }
            System.out.println("Desea seguir realizando operaciones? (S/N): ");
            continuar = (teclado.next()).charAt(0);
            }else if(opcion == 3){
                unaFacultad.nominaProfesores();
                System.out.println("Desea seguir realizando operaciones? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 4){
                System.out.println("El total a pagar es: " + unaFacultad.totalAPagar());
                System.out.println("Desea seguir realizando operaciones? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 5){
                unaFacultad.listarProfesorCargos();
                System.out.println("Desea seguir realizando operaciones? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 6){
                continuar = 'n';
            }else{
                System.out.println("Lo lamento, no se ha encontrado esa opcion. Intentalo de nuevo!");
            }
        }
        System.out.println("Se ha finalizado el programa!!");
    }
}
