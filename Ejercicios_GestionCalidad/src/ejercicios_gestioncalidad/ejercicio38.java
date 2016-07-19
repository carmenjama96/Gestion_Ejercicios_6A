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
public class ejercicio38 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static Validaciones validaciones = new Validaciones();
    public static void inicioEjercicio38() throws IOException {
        String verificador;
        int limite, sumaGauss;
        System.out.println("Suma N primeros numeros naturales");
        do{
            System.out.println("ingrese el límite a calcular en entero positivo");
            verificador = entrada.readLine();
          }while(!validaciones.validar_numeros_enteros_positivos(verificador));
        
        limite = Integer.parseInt(verificador.toString());
        sumaGauss = ((limite + 1) * limite/2);
        System.out.println("la suma de los N primeros números naturales es: "+sumaGauss);
        
        validaciones.regresar_inicio();
    }
}
