/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_gestioncalidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class ejercicio26 {
    
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static Validaciones validaciones = new Validaciones();
    static DecimalFormat decimales = new DecimalFormat("0.000");
    
    
    public static void inicioEjercicio26() throws IOException {
    String verificador;
    int opcionUsuario;
    double suma = 0, media=0;
        System.out.println("Suma y media de un conjunto de números ingresados");
        do {
            System.out.println("Cuantos elementos desea ingresar");
            verificador = entrada.readLine();
        } while (!validaciones.validar_solo_numeros_positivosY0(verificador));
          opcionUsuario =Integer.parseInt(verificador.toString());
          
          double numeros []= new double[opcionUsuario];
        
        for (int i = 0; i < opcionUsuario; i++) {
            do {
                System.out.println("ingrese "+ (i+1) +" número");
                verificador = entrada.readLine();
            } while (!validaciones.validar_solo_numeros_positivosY0(verificador));
            
            numeros[i]= Double.parseDouble(verificador.toString());
        }
        
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        media =suma/2;
          
        System.out.println("la suma del conjunto de números es: "+suma);
        System.out.println("la media del conjunto de números es: "+decimales.format(media));
        
        
        validaciones.regresar_inicio();
        
        
    }
}
