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
public class ejercicio44 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static Validaciones validaciones = new Validaciones();
    public static void inicioEjercicio44() throws IOException {
        String verificador;
        int limite, sumaFactorial = 0, factorial;
        System.out.println("Solucion a: S= 1! +2! + 3! +...+ N!");
        do{
            System.out.println("ingrese el límite a calcular en entero positivo");
            verificador = entrada.readLine();
          }while(!validaciones.validar_numeros_enteros_positivos(verificador));
        
        limite = Integer.parseInt(verificador.toString());
        
        for (int i = 0; i < limite; i++) {
            int iteracion =i+1;
            factorial = 1;
                for (int j = 1; j<= iteracion; j++) 
                {
                    factorial*=j;
                }
            sumaFactorial = sumaFactorial+factorial;
        }
        System.out.println("la suma factorial es "+sumaFactorial);
        
        validaciones.regresar_inicio();
    }
}
