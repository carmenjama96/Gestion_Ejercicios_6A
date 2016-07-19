
package ejercicios_gestioncalidad;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Crear un programa que solicite el ingreso de un valor entero e indique si dicho valor es primo o no.
 */
public class A_NumeroPrimo_NoPrimo {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    Validaciones validaciones = new Validaciones();
    DecimalFormat decimales = new DecimalFormat("0"); //Nos permite mostrar por pantalla numeros con el formato dado
    
    public void ingreso_datos() throws IOException{
        System.out.println ("--------------------------------------------------------------------------------\n"
                +"--------------------------------------------------------------------------------\n"
                +"                         ¿Numero primo o no?.");
        System.out.print("Ingrese un numero a validar: ");
        valor_entrada =entrada.next();
        validar_entrada(valor_entrada);
    }
    
    public void validar_entrada(String valor) throws IOException{
        if(validaciones.validar_numeros_enteros_positivos(valor)==true && valor.length()<=18){
            Long var_valor = Long.parseLong(valor);
            if((var_valor % 1 == 0)){
                mensaje_salida(var_valor);
            }else{
                System.out.print ("--Error en dato, vuelva a intentarlo\n");
                mensaje_error();
            }
        }else{
            System.out.print ("--Error en dato, debe de estar en el rango de [0-999999999999999999]\n");
            mensaje_error();
        }
    }
    
    public void mensaje_error() throws IOException{
        System.out.print("Ingrese un numero a validar: ");
        valor_entrada =entrada.next();
        validar_entrada(valor_entrada);
    }
    
    public void mensaje_salida(long valor) throws IOException{
        if(validaciones.validar_primo(valor)==true){
            System.out.print ("Respuesta: El numero "+decimales.format(valor)+" es primo \n");
        }else{
            System.out.print ("Respuesta: El numero "+decimales.format(valor)+" NO es primo \n");
        }
        System.out.print("   Nota: Un número primo sólo se puede dividir exactamente por sí mismo y por 1."
                + "\n--------------------------------------------------------------------------------\n");
        validaciones.regresar_inicio();
    }
}
