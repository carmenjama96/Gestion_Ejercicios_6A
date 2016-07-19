package ejercicios_gestioncalidad;
import java.io.IOException;
import java.util.Scanner;

public class J_Ejecucion {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    
    public void entrada_opcion() throws IOException{
    System.out.println ("--------------------------------------------------------------------------------\n"
            +"            Autores: Guerrero Keter, Jama Carmen, Lazaro Johanna.\n"
            +"                              MENU PRINCIPAL\n"
            + " ------------------------------------------------------------------------------\n"
            + "¦    1. Conversion de distancias                                               ¦\n"
            + "¦    2. Calcular el area y perimetro de un triangulo rectangulo                ¦\n"//
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
    
    public void evaluar_opcion(String opcion) throws IOException{
        switch (opcion) {
            case "1":
                ejercicio2.inicioEjercicio2();
            case "2":
                A_AreaPerimetroTriganguloRectangulo ejercicio_2= new A_AreaPerimetroTriganguloRectangulo();
                ejercicio_2.entrada_datos();
            case "3":
                J_Minutos ejercicio_3= new J_Minutos();
                ejercicio_3.minutos();
                break;
            case "3":
                J_Minutos ejercicio_3= new J_Minutos();
                ejercicio_3.minutos();
                break;            
            case "4":
                A_Calculo_Datos_Viaje ejercicio_4= new A_Calculo_Datos_Viaje();
                ejercicio_4.ingreso_datos();
                break;
            case "5":
                A_PagoCirculacionVehiculo ejercicio_5= new A_PagoCirculacionVehiculo();
                ejercicio_5.ingreso_datos();
                break;
            case "6":
                J_Descuentos ejercicio_6= new J_Descuentos();
                ejercicio_6.descuentos();
                break;
            case "7":
                ejercicio14.inicioEejercicio14();
                break;
            case "8":
                A_TipoNumero ejercicio_8= new A_TipoNumero();
                ejercicio_8.ingreso_datos();
                break;
            case "9":
                J_centigrados ejercicio_9= new J_centigrados();
                ejercicio_9.centigrados();
                break; 
            case "10":
                ejercicio20.inicioEjercicio20();
                break;    
            case "11":
                A_DepreciacionVehiculo ejercicio_11= new A_DepreciacionVehiculo();
                ejercicio_11.ingreso_datos();
                break;
            case "12":
                J_tabla ejercicio_12= new J_tabla();
                ejercicio_12.tablita();
                break;
            case "13":
                ejercicio26.inicioEjercicio26();
            case "14":
                A_TrianguloNFilas ejercicio_14= new A_TrianguloNFilas();
                ejercicio_14.ingreso_datos();
                break;
            case "15":
                J_SumarPares ejercicio_15= new J_SumarPares();
                ejercicio_15.sumapar();
                break;
            case "16":
                ejercicio32.inicioEjercicio32();    
            case "17":
                A_NumeroPrimo_NoPrimo ejercicio_17= new A_NumeroPrimo_NoPrimo();
                ejercicio_17.ingreso_datos();
                break;
            case "18":
                J_horasTrabajadas ejercicio_18= new J_horasTrabajadas();
                ejercicio_18.horastra();
                break;
            case "19":
                ejercicio38.inicioEjercicio38();     
            case "20":
                A_Formula_1 ejercicio_20= new A_Formula_1();
                ejercicio_20.ingreso_datos();
                break;
            case "21":
                J_Formula ejercicio_21= new J_Formula();
                ejercicio_21.formula();
                break;
            case "22":
                ejercicio44.inicioEjercicio44();
            case "23":
                A_NumeroPerfecto_oNo ejercicio_23= new A_NumeroPerfecto_oNo();
                ejercicio_23.ingreso_datos();
                break;
            case "24":
                A_5Primeros_Numeros_Perfectos ejercicio_24= new A_5Primeros_Numeros_Perfectos();
                ejercicio_24.ingreso_datos();
                break;
            case "25":
                ejercicio50.inicioEjercicio50();    
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
    public static void main(String[] args) throws IOException {
        J_Ejecucion ejecucion = new J_Ejecucion();
        ejecucion.entrada_opcion();
    }
}
