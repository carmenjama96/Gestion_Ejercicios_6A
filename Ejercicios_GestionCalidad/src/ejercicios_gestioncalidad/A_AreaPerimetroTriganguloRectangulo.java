package ejercicios_gestioncalidad;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/*Ejercicio: Diseñar un programa que calcule el área y el perímetro de un triángulo rectángulo dada la base y la altura.*/

public class A_AreaPerimetroTriganguloRectangulo {
    //Declaramos las variables a utilizar
    double base=0, altura=0, area=0, hipotenusa=0, perimetro=0;
    
    String valor_entrada;
    Scanner entrada = new Scanner (System.in); //Creación de un objeto Scanner
    DecimalFormat decimales = new DecimalFormat("0.00"); //Nos permite mostrar por pantalla numeros con el formato dado
    Validaciones validaciones = new Validaciones();
    
    //Ingreso de datos
    public void entrada_datos () throws IOException{
        System.out.println ("\n--------------------------------------------------------------------------------\n"
                           +"--------------------------------------------------------------------------------\n\n"
                           +"                 Area y perimetro de un triangulo rectangulo");
        System.out.print("Ingrese valor de altura: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_datos(valor_entrada, "altura"); //Este metodo valida que los datos ingresados esten correctos (tipo numerico)
        System.out.print ("Ingrese valor de base: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_datos(valor_entrada, "base");
        calcular_area_perimetro();
    }
    
    public void validar_datos(String valor, String tipo){
        //Si el valor es correcto lo guarda en altura o base, segun corresponda
        if(validaciones.validar_solo_numeros_positivos(valor)==true){
            asignacion_valores(valor, tipo);
        //Si por el contrario el dato ingresado no cumple con los parametros requeridos,
        //debera de ingresarse de nuevo el valor y se vuelve a llamar el metodo para validar.
        }else{
            System.out.print ("--Error en dato, vuelva a intentarlo");
            System.out.print ("\nIngrese valor de "+tipo+": ");
            valor_entrada=entrada.nextLine().replaceAll("\\s", "");
            validar_datos(valor_entrada, tipo);
        }
    }
    
    public void asignacion_valores(String valor, String tipo){
        if(tipo.equals("altura")){
                altura=Double.parseDouble(valor);
            }else{
                base=Double.parseDouble(valor);
        }
    }
    
    public void calcular_area_perimetro() throws IOException{
        //Procedemos a calcular la hipotenusa, y luego los otros datos solicitados: area y perimetro
        hipotenusa=Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
        area=(altura*base)/2;
        perimetro=altura+base+hipotenusa;
        //Se muestra la respuesta y su rexpectiva explicacion.
        System.out.print ("Respuesta:\n"
                + "   El area del rectangulo es "+decimales.format(area)+"; el perimetro del triangulo es "+decimales.format(perimetro)+"."
                +"\n   Para los valores de altura "+decimales.format(altura)+"; base "+decimales.format(base)+"\n"
                +"--------------------------------------------------------------------------------\n");
        //Llamamos a un metodo externo que nos permitira segun lo que responda el usuario volver o no al menu de inicio.
        validaciones.regresar_inicio();
    }
}
