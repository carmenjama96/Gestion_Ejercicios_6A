package ejercicios_gestioncalidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Johanna lazaro
 */
public class J_SegundoMayor {
    static Validaciones validaciones = new Validaciones();
    
  
    public void horastra()throws IOException {        

    Scanner in = new Scanner(System.in);     
    System.out.println("Ingrese cantidad de numeros a introducir");    
              
    int n = in.nextInt(); 
    int[] array = new int[n]; 
    for
            (int i = 0;i < array.length; i++){ 
        System.out.print("Ingrese "+(i+1)+": "); 
        
    array[i] = in.nextInt(); 
    
    } 
    
    System.out.println("El segundo mayor de la lista es: "+array[indiceSegundo(array)]); 
    
    validaciones.regresar_inicio();  
    //mostrar(array); 
    }
    // Funcion para encontrar el Indice del primer mayor 
    private static int indicePrimero(int[] array){ 
    int mayor = -2147483648; 
    int indice = -1; 
    for
            (int i = 0;i < array.length; i++){ 
    if
            ( mayor < array[i] ){ 
        mayor = array[i]; 
        indice = i; 
    } 
    } 
    return indice; 
    } 

        // Funcion para encontrar el Indice del segundo mayor 
        private static int indiceSegundo(int[] array){ 
        int primerMayor = indicePrimero(array); // Buscamos el mayor 
        int temporal=array[primerMayor]; // Almacenamos su valor en "temporal" 
            array[primerMayor] = -2147483648; // Y le asignamos el más pequeño numero posible en programacion 

        int segundoMayor = indicePrimero(array); // Buscamos el mayor, (El primer mayor lo marcamos como el numero pequeño 
            array[primerMayor] = temporal; // Restablecemos el primer mayor. 
            return segundoMayor; // Retornamos el indice del segundo mayor 
        } 
 private static int validar(String valor) {        

        if (validaciones.validar_solo_numeros(valor)==true) {
            return 0;
        } else {
            return 1;

        }
    }


 

} 