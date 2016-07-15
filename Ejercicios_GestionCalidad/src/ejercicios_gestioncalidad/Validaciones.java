
package ejercicios_gestioncalidad;

public class Validaciones {
    public boolean validar_solo_numeros(String datos){
        char[] aCaracteres= datos.toCharArray();
        String error = "NO";
        for (int x=0;x<aCaracteres.length;x++){
            if(Character.isLetter(aCaracteres[x])){
                error="SI";
            }
        }
        if(error.equals("SI")){
            return true;
        }else{
            return false;
        }
    }
}