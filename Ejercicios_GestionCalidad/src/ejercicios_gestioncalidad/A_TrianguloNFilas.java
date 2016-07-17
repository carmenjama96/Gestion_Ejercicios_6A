
package ejercicios_gestioncalidad;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Realice un programa que dibuje un triangulo de n filas, empleando el carácter asterisco. Por ejemplo para n = 4;
                              * * * * * *
                               * * * * *
                                 * * *
                                   *
 */
public class A_TrianguloNFilas {
    String valor_entrada;
    Scanner entrada = new Scanner (System.in); //Creación de un objeto Scanner
    Validaciones validaciones = new Validaciones();
    
    String [] cadena;
    
    public void ingreso_datos(){
        System.out.println ("\n--------------------------------------------------------------------------------\n"
                           +"--------------------------------------------------------------------------------\n\n"
                           +"                         Piramides N filas --> *");
        System.out.print("Ingrese la base del triangulo: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_entrada(valor_entrada);
    }
    
    public void validar_entrada(String valor){
        if(validaciones.validar_solo_numeros_positivos(valor)){
            generar_triangulo(Integer.parseInt(valor));
        }else{
            System.out.print ("--Error en dato, vuelva a intentarlo");
            System.out.print("Ingrese la base del triangulo: ");
            valor_entrada=entrada.nextLine().replaceAll("\\s", "");
            validar_entrada(valor_entrada);
        }
    }
    
    public void generar_triangulo(int valor){
        crear_arreglo(valor);
        System.out.print ("Respuesta:\n\n");
        for(int i=0; i<valor+1; i++){
            cadena[i]="  ";
            for(int j=i+1; j<(cadena.length-i); j++){
                cadena[j]="* ";
            }
            imprimir_arreglo(valor-i);
        }
        System.out.print ("--------------------------------------------------------------------------------\n");
        validaciones.regresar_inicio();
    }
    
    public void crear_arreglo(int valor){
        cadena= new String[valor+1];
    }
    public void imprimir_arreglo(int espacios){
        String mostrar ="";
        for (int j=0; j<espacios-1; j++){
            mostrar=mostrar+" ";
        }
        for(int i=0; i<cadena.length; i++){
            mostrar=mostrar+cadena[i];
        }
        System.out.print (mostrar+"\n");
    }
    
}
