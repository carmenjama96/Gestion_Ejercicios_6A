package ejercicios_gestioncalidad;

import static ejercicios_gestioncalidad.ejercicio2.validaciones;
import java.io.IOException;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Johanna lazaro
 */
public class J_tabla {

    public void tablita() throws IOException{

        Scanner sc = new Scanner(System.in);
        int stado;
            System.out.println("Ingrese un número: ");

            String valor = sc.nextLine();
            stado = validar(valor);
            if (stado == 0) {
                double num = Double.parseDouble(valor);
                System.out.println("**************************************************");

                for (int  i = 0;  i <= 9; i++ ) {                       
                 System.out.println(""+num + " + " +i + " = " + (num+i));
                }               

            }
            else {
                tablita();
            }
        validaciones.regresar_inicio();       

    }

    private static int validar(String valor) {        

        if (validaciones.validar_solo_numeros(valor)==true) {
            return 0;
        } else {
            return 1;

        }
    }
}
