
package ejercicios_gestioncalidad;

import java.util.Scanner;

/*
Diseñar un programa que permita calcular los 5 primeros números perfectos (un numero es perfecto, cuando la suma de sus divisores,
sin incluirlo al número es exactamente el mismo número).
*/
public class A_5Primeros_Numeros_Perfectos {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    Validaciones validaciones = new Validaciones();
    
    public void ingreso_datos (){
        System.out.println ("\n--------------------------------------------------------------------------------\n"
                           +"--------------------------------------------------------------------------------\n\n"
                           +"                        5 primeros numeros perfectos--> *");
        for(int i=1; i<=13; i++){
            if(i!=9 && i!=11 && validaciones.validar_primo(i)==true){
                int parte_2_formula = ((int)Math.pow(2, i))-1;
                if(validaciones.validar_primo(parte_2_formula)==true){
                    int parte_1_formula = ((int)Math.pow(2, (i-1)));
                    int numero_perfecto=parte_1_formula*parte_2_formula;
                    System.out.print("--->: "+numero_perfecto+" \n");
                }
            }
        }
    }
}
