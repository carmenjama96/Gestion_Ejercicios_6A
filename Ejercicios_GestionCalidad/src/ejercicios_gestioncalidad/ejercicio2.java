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
public class ejercicio2 {
        public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static DecimalFormat decimales = new DecimalFormat("0.000");
    static Validaciones validaciones = new Validaciones();
    
    public static void inicioEjercicio2() throws IOException{
        String verificador;
        
        double  distanciaMillaMarina, distanciaMetros, distanciaKilometros;
        
            System.out.println("Conversion de millas marinas a metros y kilómetros");
        do {
                System.out.println("Inserte distancia en millas marinas");
                verificador = entrada.readLine();
            } while (!validaciones.validar_solo_numeros_positivos(verificador));
        
        distanciaMillaMarina= Double.parseDouble(verificador.toString());
        
        distanciaKilometros = distanciaMillaMarina * 1.852;
        
        distanciaMetros= distanciaMillaMarina * 1852;
        
        System.out.println("Distancia expresada en metros: "+decimales.format(distanciaMetros));
        System.out.println("Distancia expresada en kilómetros: "+decimales.format(distanciaKilometros));
        
        validaciones.regresar_inicio();
    }
}
