
package ejercicios_gestioncalidad;

import java.util.Scanner;

/**
 * Diseñar un programa que permita el ingreso de un valor, determinar mediante un mensaje si el número ingresado es o no perfecto
 * (un número es perfecto, cuando la suma de sus divisores, sin incluirlo al número es exactamente el mismo número).
 */
    

public class A_NumeroPerfecto_oNo {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    Validaciones validaciones = new Validaciones();
    public void ingreso_datos (){
        System.out.println ("\n--------------------------------------------------------------------------------\n"
                           +"--------------------------------------------------------------------------------\n\n"
                           +"                         ¿Numero perfecto o no?");
        System.out.print("Ingrese numero a validar: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_entrada(valor_entrada);
    }
    
    public void validar_entrada(String valor){
        if(validaciones.validar_numeros_enteros_positivos(valor)==true){
            if(validaciones.longitud_string(valor)==false){
                if(validaciones.validar_numero_perfecto(Long.parseLong(valor))==true){
                    System.out.print ("El numero "+valor+" es perfecto");
                }else{
                    System.out.print ("El numero "+valor+" NO es perfecto");
                }
                System.out.print ("\n--------------------------------------------------------------------------------\n");
                validaciones.regresar_inicio();
            }else{
                error_mensaje("--Error en dato, debe de estar en el rango de [0-999999999]\n");
            }
        }else{
            error_mensaje("--Error en dato, vuelva a intentarlo\n");
        }
    }
    
    public void error_mensaje(String mensaje){
        System.out.print (mensaje);
        System.out.print("Ingrese numero a validar: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_entrada(valor_entrada);
    }
}