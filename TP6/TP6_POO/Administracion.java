import java.util.*;

/**
 * Clase ejecutable para probar la clase Jardin
 * 
 * @author Valenzuela Luciano Juan Ignacio
 */
public class Administracion
{
    // Implementar menu!!
    public static void main(String[] args){
        String nombre;
        double x, y, sEjeMenor, sEjeMayor, radio, base, altura, ancho, alto, lado;
        int opcion;
        ArrayList<FiguraGeometrica> figuras = new ArrayList();
        char continuar = 's';
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar nombre Jardin: ");
        nombre = teclado.nextLine();
        while(continuar != 'n' && continuar != 'N'){
            System.out.println("Ingresar tipo de figura");
            System.out.println("1- Elipse, 2- Circulo, 3- Triangulo, 4- Cuadrado, 5- Rectangulo: ");
            opcion = teclado.nextInt();
            if(opcion == 1){
                System.out.println("Ingresar semieje mayor: ");
                sEjeMayor = teclado.nextDouble();
                System.out.println("Ingresar semieje menor: ");
                sEjeMenor = teclado.nextDouble();
                System.out.println("Ingresar punto x: ");
                x = teclado.nextInt();
                System.out.println("Ingresar punto y: ");
                y = teclado.nextInt();
                FiguraGeometrica unElipse = new Elipse(sEjeMayor, sEjeMenor, new Punto(x, y));
                figuras.add(unElipse);
                System.out.println("Desea seguir ingresando datos de figuras? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 2){
                System.out.println("Ingresar semieje mayor: ");
                sEjeMayor = teclado.nextDouble();
                System.out.println("Ingresar semieje menor: ");
                sEjeMenor = teclado.nextDouble();
                System.out.println("Ingresar radio: ");
                radio = teclado.nextDouble();
                System.out.println("Ingresar punto x: ");
                x = teclado.nextInt();
                System.out.println("Ingresar punto y: ");
                y = teclado.nextInt();
                FiguraGeometrica unCirculo = new Circulo(sEjeMayor, sEjeMenor, radio, new Punto(x, y));
                figuras.add(unCirculo);
                System.out.println("Desea seguir ingresando datos de figuras? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 3){
                System.out.println("Ingresar base: ");
                base = teclado.nextDouble();
                System.out.println("Ingresar altura: ");
                altura = teclado.nextDouble();
                System.out.println("Ingresar punto x: ");
                x = teclado.nextInt();
                System.out.println("Ingresar punto y: ");
                y = teclado.nextInt();
                FiguraGeometrica unTriangulo = new Triangulo(new Punto(x, y), base, altura);
                figuras.add(unTriangulo);
                System.out.println("Desea seguir ingresando datos de figuras? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 4){
                System.out.println("Ingresar ancho: ");
                ancho = teclado.nextDouble();
                System.out.println("Ingresar alto: ");
                alto = teclado.nextDouble();
                System.out.println("Ingresar lado: ");
                lado = teclado.nextDouble();
                System.out.println("Ingresar punto x: ");
                x = teclado.nextInt();
                System.out.println("Ingresar punto y: ");
                y = teclado.nextInt();
                FiguraGeometrica unCuadrado = new Cuadrado(new Punto(x, y), ancho, alto, lado);
                figuras.add(unCuadrado);
                System.out.println("Desea seguir ingresando datos de figuras? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else if(opcion == 5){
                System.out.println("Ingresar ancho: ");
                ancho = teclado.nextDouble();
                System.out.println("Ingresar alto: ");
                alto = teclado.nextDouble();
                System.out.println("Ingresar punto x: ");
                x = teclado.nextInt();
                System.out.println("Ingresar punto y: ");
                y = teclado.nextInt();
                FiguraGeometrica unRectangulo = new Rectangulo(new Punto(x, y), ancho, alto);
                figuras.add(unRectangulo);
                System.out.println("Desea seguir ingresando datos de figuras? (S/N): ");
                continuar = (teclado.next()).charAt(0);
            }else{
                System.out.println("No se encontro esa opcion, intentalo de nuevo!");
            }
        }
        Jardin unJardin = new Jardin(nombre, figuras);
        continuar = 's';
        while(continuar != 'n' && continuar != 'N'){
            System.out.println("Operaciones disponibles: ");
            System.out.println("1- Mostrar detalles de figuras, 2- Agregar Figura, 3- Quitar Figura, 4- Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if(opcion == 1){
                unJardin.detalleFiguras();
            }else if(opcion == 2){
                System.out.println("Ingresar tipo de figura");
                System.out.println("1- Elipse, 2- Circulo, 3- Triangulo, 4- Cuadrado, 5- Rectangulo: ");
                opcion = teclado.nextInt();
                if(opcion == 1){
                    System.out.println("Ingresar semieje mayor: ");
                    sEjeMayor = teclado.nextDouble();
                    System.out.println("Ingresar semieje menor: ");
                    sEjeMenor = teclado.nextDouble();
                    System.out.println("Ingresar punto x: ");
                    x = teclado.nextInt();
                    System.out.println("Ingresar punto y: ");
                    y = teclado.nextInt();
                    FiguraGeometrica unElipse = new Elipse(sEjeMayor, sEjeMenor, new Punto(x, y));
                    unJardin.agregarFigura(unElipse);
                }else if(opcion == 2){
                    System.out.println("Ingresar semieje mayor: ");
                    sEjeMayor = teclado.nextDouble();
                    System.out.println("Ingresar semieje menor: ");
                    sEjeMenor = teclado.nextDouble();
                    System.out.println("Ingresar radio: ");
                    radio = teclado.nextDouble();
                    System.out.println("Ingresar punto x: ");
                    x = teclado.nextInt();
                    System.out.println("Ingresar punto y: ");
                    y = teclado.nextInt();
                    FiguraGeometrica unCirculo = new Circulo(sEjeMayor, sEjeMenor, radio, new Punto(x, y));
                    unJardin.agregarFigura(unCirculo);
                }else if(opcion == 3){
                    System.out.println("Ingresar base: ");
                    base = teclado.nextDouble();
                    System.out.println("Ingresar altura: ");
                    altura = teclado.nextDouble();
                    System.out.println("Ingresar punto x: ");
                    x = teclado.nextInt();
                    System.out.println("Ingresar punto y: ");
                    y = teclado.nextInt();
                    FiguraGeometrica unTriangulo = new Triangulo(new Punto(x, y), base, altura);
                    unJardin.agregarFigura(unTriangulo);
                }else if(opcion == 4){
                    System.out.println("Ingresar ancho: ");
                    ancho = teclado.nextDouble();
                    System.out.println("Ingresar alto: ");
                    alto = teclado.nextDouble();
                    System.out.println("Ingresar lado: ");
                    lado = teclado.nextDouble();
                    System.out.println("Ingresar punto x: ");
                    x = teclado.nextInt();
                    System.out.println("Ingresar punto y: ");
                    y = teclado.nextInt();
                    FiguraGeometrica unCuadrado = new Cuadrado(new Punto(x, y), ancho, alto, lado);
                    unJardin.agregarFigura(unCuadrado);
                }else if(opcion == 5){
                    System.out.println("Ingresar ancho: ");
                    ancho = teclado.nextDouble();
                    System.out.println("Ingresar alto: ");
                    alto = teclado.nextDouble();
                    System.out.println("Ingresar punto x: ");
                    x = teclado.nextInt();
                    System.out.println("Ingresar punto y: ");
                    y = teclado.nextInt();
                    FiguraGeometrica unRectangulo = new Rectangulo(new Punto(x, y), ancho, alto);
                    unJardin.agregarFigura(unRectangulo);
                }else{
                    System.out.println("No sea encontro esa opcion");
                }
            }else if(opcion == 3){
                ArrayList<FiguraGeometrica> qFigura = unJardin.getFiguras();
                System.out.println("Ingresar punto x: ");
                x = teclado.nextInt();
                System.out.println("Ingresar punto y: ");
                y = teclado.nextInt();
                for(int i = 0; i < qFigura.size(); i++){
                    FiguraGeometrica f = qFigura.get(i);
                    if(f.getOrigen().getX() == x && f.getOrigen().getY() == y){
                        unJardin.quitarFigura(f);
                        System.out.println("Se ha eliminado la figura con exito!");
                    }
                }
            }else if(opcion == 4){
                continuar = 'n';
            }else{
                System.out.println("No se encontro esa opcion, intentalo de nuevo!");
            }
        }
        System.out.println("Se ha finalizado el programa!!");
    }
}
