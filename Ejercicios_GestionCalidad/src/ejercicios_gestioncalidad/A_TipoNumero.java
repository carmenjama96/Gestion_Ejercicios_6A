
package ejercicios_gestioncalidad;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/*Realice un programa que muestre si un número ingresado es par o impar, positivo o negativo, entero o decimal.*/

public class A_TipoNumero {
    String valor_entrada;
    Scanner entrada = new Scanner (System.in); //Creación de un objeto Scanner
    Validaciones validaciones = new Validaciones();
    DecimalFormat decimales = new DecimalFormat("0.00"); //Nos permite mostrar por pantalla numeros con el formato dado
    
    
    public void ingreso_datos(){
        System.out.println ("\n--------------------------------------------------------------------------------\n"
                           +"--------------------------------------------------------------------------------\n\n"
                           +"           ¿Numero entero, decimal, par, impar, positivo, negativo?.");
        //Ingreso de dato
        System.out.print("Ingrese numero a validar: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        solo_numeros(valor_entrada);
        tipo_numero(valor_entrada);
    }
    public void solo_numeros(String valor){
        //Validamos que se ingrese un numero, si no esta correcto no pedira ingresarlo de nuevo
        if(validaciones.validar_solo_numeros(valor_entrada)==false){
            System.out.print ("--Error en dato, vuelva a intentarlo");
            System.out.print("\nIngrese numero a validar: ");
            valor_entrada=entrada.nextLine().replaceAll("\\s", "");
            solo_numeros(valor_entrada);
        }
    }
    
    public void tipo_numero(String valor){
        //Aqui al transformarlos de string a double, lo redondea
        BigDecimal var_valor = new BigDecimal(valor);
        //Creamos un String que contendra la respuesta y segun las validaciones siguientes se mostrara el tipo de numero que es
        /*if(var_valor.){
            System.out.print("ENTERO");
        }else{
            System.out.print("DECIMAL");
        }
        /*if(var_valor%1==0){//Si el residuo del valor dividido para 1 es 0, es entero
            mostrar=mostrar+"entero";
            if ((var_valor % 2)==0){//Aqui se comprueba si es par o impar
                mostrar=mostrar+", par";
            }else{
                mostrar=mostrar+", impar";
            }
        }else{
            mostrar=mostrar+"decimal, no es considerado par o impar";
        }
        
        if(var_valor>0){//Y por ultimo si es negativo o positivo
            mostrar=mostrar+" y positivo";
        }else{
            mostrar=mostrar+" y negativo";
        }
        
        if(valor.equals(var_valor)==false){
            mostrar=mostrar+". Con valor redondeado a ->"+decimales.format(var_valor);
        }
        System.out.print(mostrar
        +"\n--------------------------------------------------------------------------------\n");
        validaciones.regresar_inicio();*/
    }
}
