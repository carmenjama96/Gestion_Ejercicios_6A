package ejercicios_gestioncalidad;
import java.util.Scanner;

public class Ejecucion {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    
    public void entrada_opcion(){
    System.out.println ("--------------------------------------------------------------------------------\n"
            +"            Autores: Guerrero Ketter, Jama Carmen, Lazaro Johanna.\n"
            +"                              MENU PRINCIPAL\n"
            + " ------------------------------------------------------------------------------\n"
            + "¦    1. Conversion de distancias                                               ¦\n"
            + "¦    2. Calcular el area y perimetro de un triangulo rectangulo                ¦\n"
            + "¦    3. Conversion de tiempo                                                   ¦\n"
            + "¦    4. Calcular consumo de gasolina                                           ¦\n"
            + "¦    5. Valor a pagar por circulacion de vehiculo                              ¦\n"
            + "¦    6. Calculo de sueldo, descuento y sueldo neto de un trabajador            ¦\n"
            + "¦    7. Mostrar numero mayor o menor                                           ¦\n"
            + "¦    8. Numero: par, impar, positivo, negativo, entero o decimal               ¦\n"
            + "¦    9. Grados de temperatura                                                  ¦\n"
            + "¦   10. Valor de una venta                                                     ¦\n"
            + "¦   11. Depreciacion de un vehiculo                                            ¦\n"
            + "¦   12. Tabla sumar                                                            ¦\n"
            + "¦   13. Suma y media de un conjunto de numeros ingresados                      ¦\n"
            + "¦   14. Triangulo de N filas                                                   ¦\n"
            + "¦   15. Suma de numeros pares entre 20 y N                                     ¦\n"
            + "¦   16. Multiplos de 5 comprendidos entre 1 y N                                ¦\n"
            + "¦   17. Valor primo o no primo                                                 ¦\n"
            + "¦   18. Segundo valor mayor ingresado                                          ¦\n"
            + "¦   19. Suma N primeros numeros naturales                                      ¦\n"
            + "¦   20. Solucion a: S= (A-1)^1 + (A-2)^2 + (A-3)^3 +...(A-N)^N                 ¦\n"
            + "¦   21. Solucion a: S= 1/2 + 2/4 + 3/6 +...+ N/(N*2)                           ¦\n"
            + "¦   22. Solucion a: S= 1! +2! + 3! +...+ N!                                    ¦\n"
            + "¦   23. Numero perfecto o no                                                   ¦\n"
            + "¦   24. Calculo de los 5 primeros numeros perfectos                            ¦\n"
            + "¦   25. Serie 2;5;7;10;12;15;17;...:...:...;1800                               ¦\n"
            + " -----------------------------------------------------------------------------");
        System.out.print("Opcion: ");
        valor_entrada =entrada.next();
        evaluar_opcion(valor_entrada);
    }
    
    public void evaluar_opcion(String opcion){
        switch (opcion) {
            case "2":
                A_AreaPerimetroTriganguloRectangulo ejercicio_2= new A_AreaPerimetroTriganguloRectangulo();
                ejercicio_2.entrada_datos();
                break;
            case "4":
                A_Calculo_Datos_Viaje ejercicio_4= new A_Calculo_Datos_Viaje();
                ejercicio_4.ingreso_datos();
                break;
            case "5":
                A_PagoCirculacionVehiculo ejercicio_5= new A_PagoCirculacionVehiculo();
                ejercicio_5.ingreso_datos();
                break;
            case "8":
                A_TipoNumero ejercicio_8= new A_TipoNumero();
                ejercicio_8.ingreso_datos();
                break;
            case "11":
                A_DepreciacionVehiculo ejercicio_11= new A_DepreciacionVehiculo();
                ejercicio_11.ingreso_datos();
                break;
            case "14":
                A_TrianguloNFilas ejercicio_14= new A_TrianguloNFilas();
                ejercicio_14.ingreso_datos();
                break;
            default:
                System.out.print("Opcion no valida, ¿Desea intentarlo de nuevo? (SI/NO): ");
                valor_entrada =entrada.next();
                if(valor_entrada.equals("SI")||valor_entrada.equals("si")||valor_entrada.equals("Si")){
                    System.out.print("Opcion: ");
                    valor_entrada =entrada.next();
                    evaluar_opcion(valor_entrada);
                }else{
                    System.exit(0);
                }
        }
    }
    public static void main(String[] args) {
        Ejecucion ejecucion = new Ejecucion();
        ejecucion.entrada_opcion();
        //A_PagoCirculacionVehiculo ejecucion2 = new A_PagoCirculacionVehiculo();
        //ejecucion2.ingreso_datos();
    }
}
