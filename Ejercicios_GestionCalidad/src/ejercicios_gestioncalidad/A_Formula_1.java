
package ejercicios_gestioncalidad;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * A través de un Programa desarrolle y muestre el resultado de la siguiente fórmula:
 * S= (A-1)^1 + (A-2)^2 + (A-3)^3 +...(A-N)^N
 */
public class A_Formula_1 {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    Validaciones validaciones = new Validaciones();
    DecimalFormat decimales = new DecimalFormat("0.00"); //Nos permite mostrar por pantalla numeros con el formato dado
    
    long suma;
    int valor_A, valor_N;
    
    public void ingreso_datos() throws IOException{
        System.out.println ("--------------------------------------------------------------------------------\n"
                +"--------------------------------------------------------------------------------\n"
                +"            Solucion a: S= (A-1)^1 + (A-2)^2 + (A-3)^3 +...(A-N)^N.");
        System.out.print("Ingrese valor de A: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_entrada(valor_entrada, "A");
        System.out.print("Ingrese valor de N: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_entrada(valor_entrada, "N");
        calcular_formula();
    }
    public void validar_entrada(String valor, String tipo){
        if(validaciones.longitud_string(valor)==false){
            if(validaciones.validar_numeros_enteros_positivos(valor)==true){
                asignar_valores(Integer.parseInt(valor), tipo);
            }else{
                mensaje_error("--Error en dato, vuelva a intentarlo\n", tipo);
            }        
        }else{
            mensaje_error("--Error en dato, vuelva a intentarlo\n", tipo);
        }
    }
    
    public void mensaje_error(String error, String tipo){
        System.out.print (error);
        System.out.print("Ingrese valor de "+tipo+": ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_entrada(valor_entrada, tipo);
    }
    
    public void asignar_valores(int valor, String tipo){
        if(tipo.equals("A")){
            valor_A=valor;
        }else{
            valor_N=valor;
        }
    }
    
    public void calcular_formula() throws IOException{
        for(long i=1; i<=valor_N; i++){
            valor_A=valor_A-1;
            Double temporal=Math.pow(valor_A,i);
            suma=suma+temporal.longValue();
        }
        System.out.print("Respuesta: \n"
                + "   El total de la suma de la susecion es: "+decimales.format(suma));
        System.out.print ("\n--------------------------------------------------------------------------------\n");
        validaciones.regresar_inicio();
    }
}
