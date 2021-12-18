import java.util.*;

/**
 * Clase AdministracionGerencia es una clase ejecutable
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class AdministracionGerencia
{
    public static void main(String[] args){
        ArrayList<Alojamiento>alojamientos = new ArrayList();
        ArrayList<Servicio>servicios = new ArrayList();
        String nombreGerencia, nombreAlojamiento, descripcion, tipoHabitacion;
        double precioBase, precio;
        int diasAlquiler, opcion, nroHabitaciones;
        char continuar = 's';
        Scanner teclado = new Scanner(System.in);
        /*
         * Una habitación de hotel, con una estadía de 1 semana, con servicio de internet y lavandería
           Una cabaña, por 5 días, con servicio de lavandería y alquiler de auto
         */
        System.out.println("Ingresar nombre de gerencia: ");
        nombreGerencia = teclado.nextLine();
        while(continuar != 'n' && continuar != 'N'){
              System.out.println("Ingresar nombre de alojamiento: ");
              nombreAlojamiento = teclado.nextLine();
              System.out.println("Ingresar precio base: ");
              precioBase = teclado.nextDouble();
              System.out.println("Ingresar dias alquiler: ");
              diasAlquiler = teclado.nextInt();
              System.out.println("Indicar tipo de alojamiento");
              System.out.println("1- Cabaña, 2- Hotel");
              opcion = teclado.nextInt();
              teclado.nextLine();
              if(opcion == 1){
                  System.out.println("Ingresar numero de habitaciones: ");
                  nroHabitaciones = teclado.nextInt();
                  servicios.clear();
                  while(continuar != 'n' && continuar != 'N'){
                      System.out.println("Desea ingresar servicios? (1- Si, 2- No)");
                      opcion = teclado.nextInt();
                      teclado.nextLine();
                      if(opcion == 1){
                          System.out.println("Ingresar servicio: ");
                          descripcion = teclado.nextLine();
                          System.out.println("Ingresar precio: ");
                          precio = teclado.nextDouble();
                          Servicio unServicio = new Servicio(descripcion, precio);
                          servicios.add(unServicio);
                      }else if(opcion == 2){
                          continuar = 'n';
                      }else{
                          System.out.println("No se ha encontrado esa opcion, vuelva a intentar");
                      }
                  }
                  Alojamiento unaCabaña = new Cabaña(nombreAlojamiento, precioBase, diasAlquiler, servicios, nroHabitaciones);
                  alojamientos.add(unaCabaña);
                  System.out.println("Se ha registrado con exito el alojamiento!");
                  continuar = 's';
                  while(continuar != 'n' && continuar != 'N'){
                      System.out.println("Opciones disponibles");
                      System.out.println("1- Agregar servicio, 2- Quitar Servicio, 3- Listar servicios, 4- Liquidar, 5- Salir");
                      opcion = teclado.nextInt();
                      teclado.nextLine();
                      if(opcion == 1){
                          System.out.println("Ingresar servicio: ");
                          descripcion = teclado.nextLine();
                          System.out.println("Ingresar precio: ");
                          precio = teclado.nextDouble();
                          teclado.nextLine();
                          Servicio unServicio = new Servicio(descripcion, precio);
                          servicios.add(unServicio);
                      }else if(opcion == 2){
                          if(servicios.size() >= 1){
                             ArrayList<Servicio> servicioQuitar = unaCabaña.getServicios();
                             System.out.println("Ingresar descripcion: ");
                             descripcion = teclado.nextLine();
                             for(int i = 0; i < servicioQuitar.size(); i++){
                                  Servicio s = servicioQuitar.get(i);
                                  if(s.getDescripcion().equals(descripcion)){
                                      unaCabaña.quitarServicio(s);
                                      System.out.println("Se ha eliminado con exito!");
                                  }
                              } 
                          }else{
                              System.out.println("No tiene servicios para eliminar!");
                          }
                      }else if(opcion == 3){
                          unaCabaña.listarServicios();
                      }else if(opcion == 4){
                          unaCabaña.liquidar();
                      }else if(opcion == 5){
                          continuar = 'n';
                      }else{
                          System.out.println("No se ha encontrado esa opcion, intentalo de nuevo!");
                      }
                  }
                  System.out.println("Desea seguir ingresando alojamientos? (S/N): ");
                  continuar = (teclado.next()).charAt(0);
                  teclado.nextLine();
              }else if(opcion == 2){
                  System.out.println("Ingresar tipo de habitacion (Single - Doble): ");
                  tipoHabitacion = teclado.nextLine();
                  servicios.clear();
                  while(continuar != 'n' && continuar != 'N'){
                      System.out.println("Desea ingresar servicios? (1- Si, 2- No)");
                      opcion = teclado.nextInt();
                      teclado.nextLine();
                      if(opcion == 1){
                          System.out.println("Ingresar servicio: ");
                          descripcion = teclado.nextLine();
                          System.out.println("Ingresar precio: ");
                          precio = teclado.nextDouble();
                          Servicio unServicio = new Servicio(descripcion, precio);
                          servicios.add(unServicio);
                      }else if(opcion == 2){
                          continuar = 'n';
                      }else{
                          System.out.println("No se ha encontrado esa opcion, vuelva a intentar");
                      }
                  }
                  Alojamiento unHotel = new Hotel(nombreAlojamiento, precioBase, diasAlquiler, servicios, tipoHabitacion);
                  alojamientos.add(unHotel);
                  System.out.println("Se ha registrado con exito el alojamiento!");
                  continuar = 's';
                  while(continuar != 'n' && continuar != 'N'){
                      System.out.println("Opciones disponibles");
                      System.out.println("1- Agregar servicio, 2- Quitar Servicio, 3- Listar servicios, 4- Liquidar, 5- Salir");
                      opcion = teclado.nextInt();
                      teclado.nextLine();
                      if(opcion == 1){
                          System.out.println("Ingresar servicio: ");
                          descripcion = teclado.nextLine();
                          System.out.println("Ingresar precio: ");
                          precio = teclado.nextDouble();
                          teclado.nextLine();
                          Servicio unServicio = new Servicio(descripcion, precio);
                          servicios.add(unServicio);
                      }else if(opcion == 2){
                          if(servicios.size() >= 1){
                             ArrayList<Servicio> servicioQuitar = unHotel.getServicios();
                             System.out.println("Ingresar descripcion: ");
                             descripcion = teclado.nextLine();
                             for(int i = 0; i < servicioQuitar.size(); i++){
                                  Servicio s = servicioQuitar.get(i);
                                  if(s.getDescripcion().equals(descripcion)){
                                      unHotel.quitarServicio(s);
                                      System.out.println("Se ha eliminado con exito!");
                                  }
                              } 
                          }else{
                              System.out.println("No tiene servicios para eliminar!");
                          }
                      }else if(opcion == 3){
                          unHotel.listarServicios();
                      }else if(opcion == 4){
                          unHotel.liquidar();
                      }else if(opcion == 5){
                          continuar = 'n';
                      }else{
                          System.out.println("No se ha encontrado esa opcion, intentalo de nuevo!");
                      }
                  }
                  System.out.println("Desea seguir ingresando alojamientos? (S/N): ");
                  continuar = (teclado.next()).charAt(0);
              }else{
                  System.out.println("No se ha encontrado esa opcion, vuelva a intentar!");
              }
        }
        System.out.println("Se ha creado la gerencia");
        Gerencia unaGerencia = new Gerencia(nombreGerencia, alojamientos);
        continuar = 's';
        while(continuar != 'n' && continuar != 'N'){
            System.out.println("\nOperaciones disponibles: ");
            System.out.println("1- Agregar Alojamiento, 2- Quitar Alojamiento, 3- Mostrar liquidacion, 4- Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if(opcion == 1){
                System.out.println("Ingresar nombre de alojamiento: ");
              nombreAlojamiento = teclado.nextLine();
              System.out.println("Ingresar precio base: ");
              precioBase = teclado.nextDouble();
              System.out.println("Ingresar dias alquiler: ");
              diasAlquiler = teclado.nextInt();
              System.out.println("Indicar tipo de alojamiento");
              System.out.println("1- Cabaña, 2- Hotel");
              opcion = teclado.nextInt();
              teclado.nextLine();
              if(opcion == 1){
                  System.out.println("Ingresar numero de habitaciones: ");
                  nroHabitaciones = teclado.nextInt();
                  servicios.clear();
                  while(continuar != 'n' && continuar != 'N'){
                      System.out.println("Desea ingresar servicios? (1- Si, 2- No)");
                      opcion = teclado.nextInt();
                      teclado.nextLine();
                      if(opcion == 1){
                          System.out.println("Ingresar servicio: ");
                          descripcion = teclado.nextLine();
                          System.out.println("Ingresar precio: ");
                          precio = teclado.nextDouble();
                          Servicio unServicio = new Servicio(descripcion, precio);
                          servicios.add(unServicio);
                      }else if(opcion == 2){
                          continuar = 'n';
                      }else{
                          System.out.println("No se ha encontrado esa opcion, vuelva a intentar");
                      }
                  }
                  Alojamiento unaCabaña = new Cabaña(nombreAlojamiento, precioBase, diasAlquiler, servicios, nroHabitaciones);
                  alojamientos.add(unaCabaña);
                  unaGerencia.agregarAlojamiento(unaCabaña);
                  System.out.println("Se ha registrado con exito el alojamiento!");
                  continuar = 's';
                  while(continuar != 'n' && continuar != 'N'){
                      System.out.println("Opciones disponibles");
                      System.out.println("1- Agregar servicio, 2- Quitar Servicio, 3- Listar servicios, 4- Liquidar, 5- Salir");
                      opcion = teclado.nextInt();
                      teclado.nextLine();
                      if(opcion == 1){
                          System.out.println("Ingresar servicio: ");
                          descripcion = teclado.nextLine();
                          System.out.println("Ingresar precio: ");
                          precio = teclado.nextDouble();
                          teclado.nextLine();
                          Servicio unServicio = new Servicio(descripcion, precio);
                          servicios.add(unServicio);
                      }else if(opcion == 2){
                          if(servicios.size() >= 1){
                             ArrayList<Servicio> servicioQuitar = unaCabaña.getServicios();
                             System.out.println("Ingresar descripcion: ");
                             descripcion = teclado.nextLine();
                             for(int i = 0; i < servicioQuitar.size(); i++){
                                 Servicio s = servicioQuitar.get(i);
                                 if(s.getDescripcion().equals(descripcion)){
                                    unaCabaña.quitarServicio(s);
                                    System.out.println("Se ha eliminado con exito!");
                                 }
                             }  
                          }else{
                              System.out.println("No tiene servicios para eliminar!");
                          }
                      }else if(opcion == 3){
                          unaCabaña.listarServicios();
                      }else if(opcion == 4){
                          unaCabaña.liquidar();
                      }else if(opcion == 5){
                          continuar = 'n';
                      }else{
                          System.out.println("No se ha encontrado esa opcion, intentalo de nuevo!");
                      }
                  }
                  }else if(opcion == 2){
                      System.out.println("Ingresar tipo de habitacion (Single - Doble): ");
                      tipoHabitacion = teclado.nextLine();
                      servicios.clear();
                      while(continuar != 'n' && continuar != 'N'){
                          System.out.println("Desea ingresar servicios? (1- Si, 2- No)");
                          opcion = teclado.nextInt();
                          teclado.nextLine();
                          if(opcion == 1){
                              System.out.println("Ingresar servicio: ");
                              descripcion = teclado.nextLine();
                              System.out.println("Ingresar precio: ");
                              precio = teclado.nextDouble();
                              Servicio unServicio = new Servicio(descripcion, precio);
                              servicios.add(unServicio);
                          }else if(opcion == 2){
                              continuar = 'n';
                          }else{
                              System.out.println("No se ha encontrado esa opcion, vuelva a intentar");
                          }
                      }
                      Alojamiento unHotel = new Hotel(nombreAlojamiento, precioBase, diasAlquiler, servicios, tipoHabitacion);
                      alojamientos.add(unHotel);
                      unaGerencia.agregarAlojamiento(unHotel);
                      System.out.println("Se ha registrado con exito el alojamiento!");
                      continuar = 's';
                      while(continuar != 'n' && continuar != 'N'){
                          System.out.println("Opciones disponibles");
                          System.out.println("1- Agregar servicio, 2- Quitar Servicio, 3- Listar servicios, 4- Liquidar, 5- Salir");
                          opcion = teclado.nextInt();
                          teclado.nextLine();
                          if(opcion == 1){
                              System.out.println("Ingresar servicio: ");
                              descripcion = teclado.nextLine();
                              System.out.println("Ingresar precio: ");
                              precio = teclado.nextDouble();
                              teclado.nextLine();
                              Servicio unServicio = new Servicio(descripcion, precio);
                              servicios.add(unServicio);
                          }else if(opcion == 2){
                              if(servicios.size() >= 1){
                                 ArrayList<Servicio> servicioQuitar = unHotel.getServicios();
                                 System.out.println("Ingresar descripcion: ");
                                 descripcion = teclado.nextLine();
                                 for(int i = 0; i < servicioQuitar.size(); i++){
                                      Servicio s = servicioQuitar.get(i);
                                      if(s.getDescripcion().equals(descripcion)){
                                          unHotel.quitarServicio(s);
                                          System.out.println("Se ha eliminado con exito!");
                                      }
                                  } 
                              }else{
                                  System.out.println("No tiene servicios para eliminar!");
                              }
                          }else if(opcion == 3){
                              unHotel.listarServicios();
                          }else if(opcion == 4){
                              unHotel.liquidar();
                          }else if(opcion == 5){
                              continuar = 'n';
                          }else{
                              System.out.println("No se ha encontrado esa opcion, intentalo de nuevo!");
                          }
                      }
                   }else{
                      System.out.println("No se ha encontrado esa opcion, vuelva a intentar!");
                   }
            }else if(opcion == 2){
                if(unaGerencia.getAlojamientosAlq().size() >= 1){
                    ArrayList<Alojamiento> qAlojamiento = unaGerencia.getAlojamientosAlq();
                    System.out.println("Ingresar nombre: ");
                    nombreAlojamiento = teclado.nextLine();
                    for(int i = 0; i < qAlojamiento.size(); i++){
                        Alojamiento a = qAlojamiento.get(i);
                        if(a.getNombre().equals(nombreAlojamiento)){
                            unaGerencia.quitarAlojamiento(a);
                            System.out.println("Se ha eliminado el alojamiento con exito!");
                        }
                    }
                }else{
                    System.out.println("No hay alojamientos alquilados!");
                }
            }else if(opcion == 3){
                unaGerencia.mostrarLiquidacion();
            }else if(opcion == 4){
                continuar = 'n';
            }else{
                System.out.println("No se ha encontrado esa opcion, intentalo de nuevo!");
            }
        }
        System.out.println("Se ha finalizado el programa!!");
    }
}
