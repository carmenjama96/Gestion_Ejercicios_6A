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
public class ejercicio20 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static Validaciones validaciones = new Validaciones();
    
    public static void inicioEjercicio20() throws IOException {
        int billetes1, billetes5, billetes10, billetes20, billetes100, precioArticulo, vuelto =0, dineroFalta=0,sumaBilletes;
        String verificador;
        
        System.out.println("Cálculo de una venta");
        
        System.out.println("Ingrese cuantos billetes de $1 tiene");
        verificador = entrada.readLine();
        while (!validaciones.validar_numeros_enteros_positivos(verificador))
            {
            System.out.println("Ingrese cuantos billetes de $1 tiene (ultice enteros positivos)");
            verificador = entrada.readLine();
            };
        billetes1 =Integer.parseInt(verificador.toString()); 
        
        System.out.println("Ingrese cuantos billetes de $5 tiene ");        
        verificador = entrada.readLine();
        while (!validaciones.validar_numeros_enteros_positivos(verificador))
            {
            System.out.println("Ingrese cuantos billetes de $5 tiene (ultice enteros positivos)");
            verificador = entrada.readLine();
            };
        billetes5 =5 * Integer.parseInt(verificador.toString());
        
        System.out.println("Ingrese cuantos billetes de $10 tiene");        
        verificador = entrada.readLine();
        while (!validaciones.validar_numeros_enteros_positivos(verificador))
            {
            System.out.println("Ingrese cuantos billetes de $10 tiene (ultice enteros positivos)");
            verificador = entrada.readLine();
            };
        billetes10 =10 * Integer.parseInt(verificador.toString());
        
        System.out.println("Ingrese cuantos billetes de $20 tiene");        
        verificador = entrada.readLine();
        while (!validaciones.validar_numeros_enteros_positivos(verificador))
            {
            System.out.println("Ingrese cuantos billetes de $20 tiene (ultice enteros positivos)");
            verificador = entrada.readLine();
            };
        billetes20 =20 * Integer.parseInt(verificador.toString());
        
        System.out.println("Ingrese cuantos billetes de $100 tiene");        
        verificador = entrada.readLine();
        while (!validaciones.validar_numeros_enteros_positivos(verificador))
            {
            System.out.println("Ingrese cuantos billetes de $100 tiene (ultice enteros positivos)");
            verificador = entrada.readLine();
            };
        billetes100 =100 * Integer.parseInt(verificador.toString());
        
        System.out.println("Ingrese precio del artículo a comprar");
        verificador = entrada.readLine();
        while (!validaciones.validar_numeros_enteros_positivos(verificador))
            {
            System.out.println("Ingrese precio del artículo a comprar (ultice enteros positivos)");
            verificador = entrada.readLine();
            };
        precioArticulo = Integer.parseInt(verificador.toString());
         
        sumaBilletes= billetes1 + billetes5 + billetes10 + billetes20 + billetes100;
        
        if (precioArticulo == sumaBilletes) {
            
        } else
            { 
                if (precioArticulo< sumaBilletes) {
                    vuelto = sumaBilletes-precioArticulo;
                    
                    }else{
                           dineroFalta = precioArticulo-sumaBilletes;
                            
                         }
            }
 
        if (precioArticulo == sumaBilletes) {
            System.out.println("tiene el dinero justo para comprar el artículo, no tiene vuelto");
        }else
            {
                if (vuelto!=0) {
                    System.out.println("tiene el dinero suficiente para comprarlo y su vuelto es: $"+vuelto);
                } else{
                        System.out.println("te falta dinero: $"+dineroFalta);
                    }
            }
    
        validaciones.regresar_inicio();
    }
}
