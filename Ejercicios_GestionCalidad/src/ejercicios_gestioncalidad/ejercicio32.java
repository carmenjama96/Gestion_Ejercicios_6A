/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_gestioncalidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class ejercicio32 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static Validaciones validaciones = new Validaciones();
    
    public static void inicioEjercicio32() throws IOException {
        String verificador;
        int limite;
        System.out.println("Multiplos de 5 comprendidos entre 1 y N");
        do{
            System.out.println("ingrese el límite a calcular en enteros positivos");
            verificador = entrada.readLine();
          }while(!validaciones.validar_numeros_enteros_positivos(verificador)||verificador.matches("0"));
            
        limite=Integer.parseInt(verificador.toString());
        
        for (int i = 0; i < limite; i++) {
            if ((i+1)%5 == 0) {
                System.out.println((i+1)+" es multiplo de 5");
            }else{System.out.println("");}
        }
        validaciones.regresar_inicio();
    }
}
