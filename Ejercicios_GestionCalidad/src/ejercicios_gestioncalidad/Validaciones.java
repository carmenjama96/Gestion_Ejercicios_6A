
package ejercicios_gestioncalidad;

import java.util.Scanner;

public class Validaciones {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    
    public boolean validar_solo_numeros(String datos){
        if(datos.length()==0){
            return false;
        }else{
            if(datos.matches("^(\\d|-)?(\\d)*\\.?\\d*$")){
               return true;
            }else{
                return false;
            }
        }
    }
    
    public void regresar_inicio(){
        System.out.print("\n¿Desea revisar otro ejercicio (SI/NO): ");
        valor_entrada =entrada.next();
        if(valor_entrada.equals("SI")||valor_entrada.equals("si")||valor_entrada.equals("Si")){
            System.out.print("\n");
            Ejecucion ejecucion = new Ejecucion();
            ejecucion.entrada_opcion();
        }else{
            System.exit(0);
        }
    }
    
    public boolean validar_solo_numeros_positivos(String datos){
        if(datos.length()==0){
            return false;
        }else{
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
    }
    
    public boolean validar_modena(String datos){
        if(datos.matches("^[0-9]{1,3}([0-9]{3})*[\\\\.][0-9]{1,2}$")){
            return validar_solo_numeros_positivos(datos);
        }else{
            return false;
        }
    }
    
    public boolean validar_numeros_enteros_positivos(String datos){
        if(datos.length()==0){
            return false;
        }else{
            if(datos.matches("[0-9]*")){
                return true;
            }else{
                return false;
            }
        }
    }
    
    public boolean validar_primo(long valor){
        if (valor==0 || valor==1 || valor==-1){
            return false;
        }else{
            if(valor==2 || valor==-2){
                return true;
            }else{
                if((valor % 2)==0){
                    return false;
                }else{
                    return true;
                }
            }
        }
    }
    public boolean validar_numero_perfecto(long valor){
        int suma=0;
        if((valor % 2)==0){
            for (int i= 1; i<valor; i++) {
                if (valor%i==0){suma=suma+i;}
            }
            if (valor== suma) {return true;}
            else{return false;}
        }else{
            return false;
        }
    }
    
    public boolean longitud_string(String valor){
        if(valor.length()>9){
            return true;
        }else{
            return false;
        }
    }
}