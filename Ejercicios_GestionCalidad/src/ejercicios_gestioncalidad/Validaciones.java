
package ejercicios_gestioncalidad;

import java.util.Scanner;

public class Validaciones {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    
    public boolean validar_solo_numeros(String datos){
        if(datos.matches("^(\\d|-)?(\\d)*\\.?\\d*$")){
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
    
    public boolean validar_solo_numeros_positivos(String datos){
        if(validar_solo_numeros(datos)==true){
            Double numero =Double.parseDouble(datos);
            if(numero>0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public boolean validar_modena(String datos){
        if(datos.matches("^[0-9]{1,3}([0-9]{3})*[\\\\.][0-9]{1,2}$")){
            return validar_solo_numeros_positivos(datos);
        }else{
            return false;
        }
    }
}