import java.util.*;

/**
 * Clase Comercio es una clase ejecutable
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Comercio
{
    // Realizar un menu
    public static void main(String[] args){
        int cuotas, stock, calorias, hornallas, pies, puertas, programas, opcion;
        String marca, dimensiones;
        float interes, precio, kilos;
        boolean compresor, automatico;
        char continuar = 's';
        
        Scanner teclado = new Scanner(System.in);
        
        while(continuar != 'n' && continuar != 'N'){
            System.out.println("Ingresar tipo de artefacto");
            System.out.println("1- Cocina, 2- Heladera, 3- Lavarropas:");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if(opcion == 1){
                System.out.println("\nIngresar marca: ");
                marca = teclado.nextLine();
                System.out.println("Ingresar stock: ");
                stock = teclado.nextInt();
                System.out.println("Ingresar precio: ");
                precio = teclado.nextFloat();
                System.out.println("Ingresar hornallas: ");
                hornallas = teclado.nextInt();
                System.out.println("Ingresar calorias: ");
                calorias = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingresar dimensiones: ");
                dimensiones = teclado.nextLine();
                System.out.println("Ingresar cuotas: ");
                cuotas = teclado.nextInt();
                System.out.println("Ingresar interes: ");
                interes = teclado.nextFloat();
                ArtefactoHogar unaCocina = new Cocina(marca, precio, stock, hornallas, calorias, dimensiones);
                System.out.println("Detalles del artefacto");
                unaCocina.imprimir();
                System.out.println("Valor cuota: " + unaCocina.cuotaCredito(cuotas, interes));
                System.out.println("Valor cuota con adicionales: " + unaCocina.creditoConAdicional(cuotas, interes));
                System.out.println("Desea seguir ingresando artefactos? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 2){
                System.out.println("\nIngresar marca: ");
                marca = teclado.nextLine();
                System.out.println("Ingresar stock: ");
                stock = teclado.nextInt();
                System.out.println("Ingresar precio: ");
                precio = teclado.nextFloat();
                System.out.println("Ingresar cantidad de pies: ");
                pies = teclado.nextInt();
                System.out.println("Ingresar cantidad de puertas: ");
                puertas = teclado.nextInt();
                System.out.println("Contiene compresor? (1 - Si, 2- No): ");
                opcion = teclado.nextInt();
                if(opcion == 1){
                    compresor = true;
                }else{
                    compresor = false;
                }
                System.out.println("Ingresar cuotas: ");
                cuotas = teclado.nextInt();
                System.out.println("Ingresar interes: ");
                interes = teclado.nextFloat();
                ArtefactoHogar unaHeladera = new Heladera(marca, precio, stock, pies, puertas, compresor);
                System.out.println("Detalles del artefacto");
                unaHeladera.imprimir();
                System.out.println("Valor cuota: " + unaHeladera.cuotaCredito(cuotas, interes));
                System.out.println("Valor cuota con adicionales: " + unaHeladera.creditoConAdicional(cuotas, interes));
                System.out.println("Desea seguir ingresando artefactos? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 3){
                System.out.println("\nIngresar marca: ");
                marca = teclado.nextLine();
                System.out.println("Ingresar stock: ");
                stock = teclado.nextInt();
                System.out.println("Ingresar precio: ");
                precio = teclado.nextFloat();
                System.out.println("Ingresar cantidad de programas: ");
                programas = teclado.nextInt();
                System.out.println("Ingresar kilos: ");
                kilos = teclado.nextFloat();
                System.out.println("Es automatico? (1 - Si, 2- No): ");
                opcion = teclado.nextInt();
                if(opcion == 1){
                    automatico = true;
                }else{
                    automatico = false;
                }
                System.out.println("Ingresar cuotas: ");
                cuotas = teclado.nextInt();
                System.out.println("Ingresar interes: ");
                interes = teclado.nextFloat();
                ArtefactoHogar unLavarropas = new Lavarropas(marca, precio, stock, programas, kilos, automatico);
                System.out.println("Detalles del artefacto");
                unLavarropas.imprimir();
                System.out.println("Valor cuota: " + unLavarropas.cuotaCredito(cuotas, interes));
                System.out.println("Valor cuota con adicionales: " + unLavarropas.creditoConAdicional(cuotas, interes));
                System.out.println("Desea seguir ingresando artefactos? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else{
                System.out.println("No se ha encontrado esa opcion, intentalo de nuevo!");
            }
        }
        System.out.println("Se ha finalizado el programa!!");
    }
}
