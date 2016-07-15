package ejercicios_gestioncalidad;
import java.util.Scanner;

public class A_AreaPerimetroTriganguloRectangulo {
    //Declaramos las variables a utilizar
    double base=0, altura=0, area=0, hipotenusa=0, perimetro=0;
    Scanner entrada = new Scanner (System.in); //Creación de un objeto Scanner
    Validaciones validaciones = new Validaciones();
    
    //Ingreso de datos
    public void entrada_datos (){
        System.out.println ("--------------------------------------------------------\n"
                           +"--------------------------------------------------------\n"
                           +"--Area y perimetro de un triangulo rectangulo\n");
        System.out.print ("  Ingrese valor de altura: ");
        String valor_entrada=entrada.next();
        if(validaciones.validar_solo_numeros(valor_entrada)==true){
        
        }else{
        
        }
        
        //System.out.print ("\n  Ingrese valor de la base: ");
        //base=Double.parseDouble(entrada.nextLine());
    }
}
