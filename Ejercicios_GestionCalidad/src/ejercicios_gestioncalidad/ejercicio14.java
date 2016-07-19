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
public class ejercicio14 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static Validaciones validaciones = new Validaciones();
   
    public static void inicioEejercicio14() throws IOException {
        
        double primerNumero, segundoNumero,tercerNumero;
        
        String verificador;
        
        System.out.println("Mostrar el número mayor o menor de 3 números");
        
        System.out.println("Ingrese el primer número");
        verificador = entrada.readLine();
        while (!validaciones.validar_solo_numeros(verificador))
            {
            System.out.println("Ingrese el primer número");
            verificador = entrada.readLine();
            };
        primerNumero =Double.parseDouble(verificador.toString());

        
        System.out.println("Ingrese el segundo número");        
        verificador = entrada.readLine();
        while (!validaciones.validar_solo_numeros(verificador))
            {
            System.out.println("Ingrese el segundo número");
            verificador = entrada.readLine();
            };
        segundoNumero =Double.parseDouble(verificador.toString());
            
        
        System.out.println("Ingrese el tercer número");        
        verificador = entrada.readLine();
        while (!validaciones.validar_solo_numeros(verificador))
            {
            System.out.println("Ingrese el tercer número");
            verificador = entrada.readLine();
            };
        tercerNumero =Double.parseDouble(verificador.toString());
                
        
        System.out.println("calcular mayor presione 1, calcular menor presione 2");
        int opcion;
        verificador= entrada.readLine();
       
        while (!(verificador.length() == 1 && (verificador.charAt(0) == '1' || verificador.charAt(0) == '2')))
            {
            System.out.println("calcular mayor presione 1, calcular menor presione 2");
            verificador = entrada.readLine();
            };
        opcion = Integer.parseInt(verificador.toString());
        
        
        
        switch (opcion) {
                  case 1:  if(primerNumero > segundoNumero)
                             {    
                                if(primerNumero>tercerNumero)
                               {
                                  System.out.println("El mayor es: " + primerNumero);
                               }
                                else
                               {
                                  System.out.println("el mayor es: " + tercerNumero);
                               }
                             } 
                              else 
                             {     if(segundoNumero>tercerNumero)
                                  {
                                  System.out.println("el mayor es: " + segundoNumero);
                                  }
                                   else
                                  {
                                  System.out.println("el mayor es: " + tercerNumero);
                                  }
                             };
                     break;
            case 2:  if(primerNumero < segundoNumero)
                             {    
                                if(primerNumero<tercerNumero)
                               {
                                  System.out.println("El menor es: " + primerNumero);
                               }
                                else
                               {
                                  System.out.println("el menor es: " + tercerNumero);
                               }
                             } 
                              else 
                             {     if(segundoNumero<tercerNumero)
                                  {
                                  System.out.println("el menor es: " + segundoNumero);
                                  }
                                   else
                                  {
                                  System.out.println("el menor es: " + tercerNumero);
                                  }
                             };
                     break;
            
        }
        
           
        validaciones.regresar_inicio();
    
        
    }
    
    
}
