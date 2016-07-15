package ejercicios_gestioncalidad;
import java.text.DecimalFormat;
import java.util.Scanner;

public class A_AreaPerimetroTriganguloRectangulo {
    //Declaramos las variables a utilizar
    double base=0, altura=0, area=0, hipotenusa=0, perimetro=0;
    String valor_entrada;
    Scanner entrada = new Scanner (System.in); //Creación de un objeto Scanner
    DecimalFormat decimales = new DecimalFormat("0.00");
    Validaciones validaciones = new Validaciones();
    
    //Ingreso de datos
    public void entrada_datos (){
        System.out.println ("----------------------------------------------------------------------------\n"
                           +"----------------------------------------------------------------------------\n"
                           +"      Area y perimetro de un triangulo rectangulo\n");
        System.out.print("Ingrese valor de altura: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_datos(valor_entrada, "altura"); //Este metodo valida que los datos ingresados esten correctos (tipo numerico)
        System.out.print ("Ingrese valor de base: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_datos(valor_entrada, "base");
        calcular_area_perimetro();
    }
    public void validar_datos(String valor, String tipo){
        if(validaciones.validar_solo_numeros(valor_entrada)==true){
            if(tipo.equals("altura")){
                altura=Double.parseDouble(valor_entrada);
            }else{
                base=Double.parseDouble(valor_entrada);
            }
        }else{
            do{
                    System.out.print ("--Error en dato, intentelo de nuevo\n");
                    System.out.print ("Ingrese valor de "+tipo+": ");
                    valor_entrada=entrada.nextLine().replaceAll("\\s", "");
                }while(validaciones.validar_solo_numeros(valor_entrada)==false);
                if(tipo.equals("altura")){
                altura=Double.parseDouble(valor_entrada);
            }else{
                base=Double.parseDouble(valor_entrada);
            }
        }
    }
    public void calcular_area_perimetro(){
        hipotenusa=Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
        area=(altura*base)/2;
        perimetro=altura+base+hipotenusa;
        System.out.print ("Respuesta:\n"
                + "El area del rectangulo es "+decimales.format(area)+"; el perimetro del triangulo es "+decimales.format(perimetro)+"."
                +"\nPara los valores de altura "+decimales.format(altura)+"; base "+decimales.format(base)+"\n");
        validaciones.regresar_inicio();
    }
}
