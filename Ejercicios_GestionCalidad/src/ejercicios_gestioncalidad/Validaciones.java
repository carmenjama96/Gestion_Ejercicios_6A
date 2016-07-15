
package ejercicios_gestioncalidad;

import java.util.Scanner;

public class Validaciones {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    
    public boolean validar_solo_numeros(String datos){
        if(datos.matches("-+[0-9]+.[0-9]*")){
            return true;
        }else{
            return false;
        }
    }
    public void regresar_inicio(){
        System.out.print("\n¿Desea revisar otro ejercicio (SI/NO): ");
        valor_entrada =entrada.next();
        if(valor_entrada.equals("SI")||valor_entrada.equals("si")||valor_entrada.equals("Si")){
            System.out.print("\n\n\n\n\n\n");
            Ejecucion ejecucion = new Ejecucion();
            ejecucion.entrada_opcion();
        }else{
            System.exit(0);
        }
    }
}