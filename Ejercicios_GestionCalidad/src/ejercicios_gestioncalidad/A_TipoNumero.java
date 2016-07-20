
package ejercicios_gestioncalidad;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/*Realice un programa que muestre si un número ingresado es par o impar, positivo o negativo, entero o decimal.*/

public class A_TipoNumero {
    String valor_entrada;
    Scanner entrada = new Scanner (System.in); //Creación de un objeto Scanner
    Validaciones validaciones = new Validaciones();
    DecimalFormat decimales = new DecimalFormat("0.00"); //Nos permite mostrar por pantalla numeros con el formato dado
    BigDecimal numero;
    
    public void ingreso_datos()throws IOException{
        System.out.println ("\n--------------------------------------------------------------------------------\n"
                           +"--------------------------------------------------------------------------------\n\n"
                           +"           ¿Numero entero, decimal, par, impar, positivo, negativo?.");
        //Ingreso de dato
        System.out.print("Ingrese numero a validar: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        solo_numeros(valor_entrada);
        tipo_numero();
    }
    public void solo_numeros(String valor){
        //Validamos que se ingrese un numero, si no esta correcto no pedira ingresarlo de nuevo
        if(validaciones.validar_solo_numeros(valor_entrada)==false){
            System.out.print ("--Error en dato, vuelva a intentarlo");
            System.out.print("\nIngrese numero a validar: ");
            valor_entrada=entrada.nextLine().replaceAll("\\s", "");
            solo_numeros(valor_entrada);
        }else{
            numero= new BigDecimal(valor);
        }
    }
    public void tipo_numero() throws IOException{
        String mostrar = "Respuesta: \n";
        BigDecimal residuo;
        double valor;
        
        residuo = numero.remainder(new BigDecimal(1));
        valor = residuo.doubleValue();
        if(valor>0 || valor<0){
            mostrar=mostrar+"El numero es decimal, no es considerado par o impar ";
        }else{
            mostrar=mostrar+"El numero es entero";
            residuo = numero.remainder(new BigDecimal(2));
            valor = residuo.doubleValue();
            if (valor>0 || valor<0){
                mostrar=mostrar+", impar";
            }else{
                mostrar=mostrar+", par";
            }
        }
        if (numero.compareTo(BigDecimal.ZERO) > 0){
            mostrar=mostrar+" y positivo.";
        }else{
            if(numero.compareTo(BigDecimal.ZERO) < 0){
                mostrar=mostrar+" y negativo.";
            }else{
                mostrar=mostrar+", no es negativo ni positivo";
            }
        }
        
        System.out.print (mostrar);
        System.out.print ("\n--------------------------------------------------------------------------------\n");
        validaciones.regresar_inicio();
    }
}
