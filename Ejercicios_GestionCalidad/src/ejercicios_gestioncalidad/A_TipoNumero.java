
package ejercicios_gestioncalidad;

import java.util.Scanner;

/*Realice un programa que muestre si un número ingresado es par o impar, positivo o negativo, entero o decimal.*/

public class A_TipoNumero {
    String valor_entrada;
    Scanner entrada = new Scanner (System.in); //Creación de un objeto Scanner
    Validaciones validaciones = new Validaciones();
    
    public void ingreso_datos(){
        System.out.println ("\n--------------------------------------------------------------------------------\n"
                           +"--------------------------------------------------------------------------------\n\n"
                           +"           ¿Numero entero, decimal, par, impar, positivo, negativo?.");
        //Ingreso de dato
        System.out.print("Ingrese numero a validar: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        solo_numeros(valor_entrada);
    }
    public void solo_numeros(String valor){
        //Validamos que se ingrese un numero, si no esta correcto no pedira ingresarlo de nuevo
        if(validaciones.validar_solo_numeros(valor_entrada)==true){
            //Una ves aprobado se pasa a ver el tipo dee numero que es
            tipo_numero(Double.parseDouble(valor));
        }else{
            System.out.print ("--Error en dato, vuelva a intentarlo");
            System.out.print("\nIngrese numero a validar: ");
            valor_entrada=entrada.nextLine().replaceAll("\\s", "");
            solo_numeros(valor_entrada);
        }
    }
    
    public void tipo_numero(double valor){
        //Creamos un String que contendra la respuesta y segunlas validaciones siguientes se mostrara el tipo de numero que es
        String mostrar="El numero ingresado es: ";
        if (valor % 1 == 0){//Si el residuo es 0 entonces es entero
            mostrar=mostrar+"entero";
            if ((valor % 2)==0){//Aqui se comprueba si es par o impar
                mostrar=mostrar+", par";
            }else{
                mostrar=mostrar+", impar";
            }
        }else{//Si el residuo no es decimal y por ende, no es par ni impar
            mostrar=mostrar+"decimal, no es considerado par o impar";
        }
        if(valor>0){//Y por ultimo si es negativo o positivo
            mostrar=mostrar+" y positivo";
        }else{
            mostrar=mostrar+" y negativo";
        }
        
        System.out.print(mostrar
        +"\n--------------------------------------------------------------------------------\n");
        validaciones.regresar_inicio();
    }
}
