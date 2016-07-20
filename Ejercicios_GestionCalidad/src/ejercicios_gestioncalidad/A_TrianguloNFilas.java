
package ejercicios_gestioncalidad;

import java.io.IOException;
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
    
    public void ingreso_datos() throws IOException{
        System.out.println ("\n--------------------------------------------------------------------------------\n"
                           +"--------------------------------------------------------------------------------\n\n"
                           +"                         Piramides N filas --> *");
        //Se pide el ingreso de la base del triangulo, el numero de * con el que comenzaremos
        System.out.print("Ingrese la base del triangulo: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        ///Se valida que ese vlor sea positivo
        validar_entrada(valor_entrada);
        generar_triangulo(Integer.parseInt(valor_entrada));
    }
    
    public void validar_entrada(String valor){
        if(validaciones.validar_numeros_enteros_positivos(valor)==false || valor.length()>3){
            //Si hay error en el dato ingresado se vuelve a ingresar y se llama de nuevo a este metodo
            System.out.print ("--Error en dato, debe de estar en el rango de [0-999]\n");
            System.out.print("Ingrese la base del triangulo: ");
            valor_entrada=entrada.nextLine().replaceAll("\\s", "");
            validar_entrada(valor_entrada);
        }else{
            if(Integer.parseInt(valor)<2){
                System.out.print ("--Error en dato, debe de tener al menos una base de 2\n");
                System.out.print("Ingrese la base del triangulo: ");
                valor_entrada=entrada.nextLine().replaceAll("\\s", "");
                validar_entrada(valor_entrada);
            }
        }
    }
    
    public void generar_triangulo(int valor) throws IOException{
        crear_arreglo(valor);//Se crea un array con el tamaño ingresado
        System.out.print ("Respuesta:\n\n");
        //El siguiente ciclo repetitivo incia en cero, aumenta de 1 en 1 y termina cuando llegue a el tamaño del array
        for(int i=0; i<valor+1; i++){
            //Se va agregando espacios, cuando inicia en 0 se agrega en cero, luego cuando aumenta a uno se da un espacio a la posicion uno tambien, asi se van eliminando asteeriscos
            cadena[i]="  ";
            for(int j=i+1; j<(cadena.length-i); j++){
                //Se agrega asteristos en una posicion despues del ultimo espacio
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
