/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_gestioncalidad;

import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class ejercicio50 {
    static Validaciones validaciones = new Validaciones();
      public static void inicioEjercicio50() throws IOException {
        System.out.println("mostrar los terminos para la siguiente serie 2; 5; 7; 10; 12; 15; 17; : : : ; 1800");
        int serie =0, limite = 1800, inicio = 2;
        do{
            serie=serie+inicio;
            if (inicio % 2 == 0) {
                inicio =3;
            }else{
                inicio = 2;
            }
            System.out.println(" "+serie+" ;");
        }while(serie<=(limite-2));
        
        validaciones.regresar_inicio();
    }
}
