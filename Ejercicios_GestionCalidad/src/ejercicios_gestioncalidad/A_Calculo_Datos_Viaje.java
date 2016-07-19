package ejercicios_gestioncalidad;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
/*Ejercicio 8: Diseñar un programa que ingrese el total de kilómetros recorridos, el precio de la gasolina (por litro), 
  el dinero de gasolina gastado en el viaje y el tiempo que se ha tardado (en horas y minutos) y que calcule y muestre:
   • Consumo de gasolina (en litros y dólares) por cada 100 km.
   • Consumo de gasolina (en litros y dólares) por cada km.
   • Velocidad media (en km/h y m/s).*/

public class A_Calculo_Datos_Viaje {
    String valor_entrada;
    Scanner entrada = new Scanner (System.in); //Creación de un objeto Scanner
    Validaciones validaciones = new Validaciones();
    DecimalFormat decimales = new DecimalFormat("0.00"); //Nos permite mostrar por pantalla numeros con el formato dado
    DecimalFormat decimales2 = new DecimalFormat("0.00000");
    
    double kilometros_recorridos=0, prec_gasolina=0, gasolina_consumida=0, gasolina_litros_100km=0,
            gasolina_dolares_100km=0, gasolina_litros_km=0, gasolina_dolares_km=0, vel_media_km_h=0, vel_media_m_s=0;
    int horas, minutos;
        
    public void ingreso_datos() throws IOException{
        System.out.println ("\n--------------------------------------------------------------------------------\n"
                           +"--------------------------------------------------------------------------------\n\n"
                           +"Calculo de gasto de gasolina y velocidad media de un viaje. Por favor, responda.");
        //Ingreso de datos
        System.out.print("Kilometros recorridos: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_datos(valor_entrada, "km"); //Se invoca al metodo que compueba si los datos ingresados son correctos
        System.out.print("Precio gasolina por litro: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_datos(valor_entrada, "pre_gas");
        System.out.print("Dinero gastado en gasolina: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_datos(valor_entrada, "dinero");
        //Ingreso del tiempo tardado
        System.out.print("Tiempo tartado/horas: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_tiempo(valor_entrada, "horas"); //Metodo controla que las horas y minutos ingresados sean correctos
        System.out.print("Tiempo tartado/minutos: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_tiempo(valor_entrada, "minutos");
        calcular_datos();
    }
    
    public void validar_datos(String valor, String tipo){
        //Si se ingresan kilometros se valida que el dato sea numerico y positivo
        if(tipo.equals("km")){
            if(validaciones.validar_solo_numeros_positivos(valor_entrada)==true){
                asignacion_valores(valor, tipo);
            }else{
                mensaje_error(tipo, "--Error en dato, intentelo de nuevo\n");
            }
        }else{
            //Si se ingresa dinero se valida que el dato sea numerico, positivo y con el formato correcto
            if(validaciones.validar_modena(valor)==true){
                asignacion_valores(valor, tipo);
            }else{
                //Si el dato no es correcto se ingresa y valida de nuevo, llamando a este mismo metodo
                mensaje_error(tipo, "--Error, intentelo de nuevo (Siga este formato -> 00.00)\n");
            }
        }
    }
    
    public void validar_tiempo(String valor, String tipo){
        //Valida que las horas sean correctas y los minutos esten entre 0 y 60
        //Si las condiciones se cumplen se asigna el valor de entrada a las vaiables
        if(validaciones.longitud_string(valor)==false){
            if(validaciones.validar_numeros_enteros_positivos(valor)==true){
                Double var_tiempo=Double.parseDouble(valor);
                if(tipo.equals("horas")&& (var_tiempo>=0)){
                    horas=Integer.parseInt(valor);
                }else{
                    if((var_tiempo>0) && (var_tiempo<=60)){
                        minutos=Integer.parseInt(valor);
                    }else{
                        mensaje_error(tipo, "--Error en dato, los minutos deben de estar en el rango de [0-60]\n");
                    }
                }
            }else{
                mensaje_error(tipo, "--Error en dato, intentelo de nuevo\n");
            }
        }else{
            mensaje_error(tipo, "--Error en dato, debe de estar en el rango de [0-999999999]\n");
        }
    }
    
    public void mensaje_error(String tipo, String mensaje){
        System.out.print(mensaje);
        switch (tipo) {
            case "km":
                System.out.print("Kilometros recorridos: ");
                valor_entrada=entrada.nextLine().replaceAll("\\s", "");
                validar_datos(valor_entrada, "km");
                break;
            case "pre_gas":
                System.out.print("Precio gasolina por litro: ");
                valor_entrada=entrada.nextLine().replaceAll("\\s", "");
                validar_datos(valor_entrada, "pre_gas");
                break;
            case "dinero":
                System.out.print("Dinero gastado en gasolina: ");
                valor_entrada=entrada.nextLine().replaceAll("\\s", "");
                validar_datos(valor_entrada, "dinero");
                break;
            case "horas":
                System.out.print("Tiempo tartado/horas: ");
                valor_entrada=entrada.nextLine().replaceAll("\\s", "");
                validar_tiempo(valor_entrada, "horas");
                break;
            case "minutos":
                System.out.print("Tiempo tartado/minutos: ");
                valor_entrada=entrada.nextLine().replaceAll("\\s", "");
                validar_tiempo(valor_entrada, "minutos");
                break;
        }
    }
    
    public void asignacion_valores(String valor, String tipo){
        if(tipo.equals("km")){
            kilometros_recorridos= Double.parseDouble(valor);
        }else{
            if(tipo.equals("pre_gas")){
                prec_gasolina= Double.parseDouble(valor);
            }else{
                gasolina_consumida= Double.parseDouble(valor);
            }
        }
    }
    
    public void calcular_datos() throws IOException{
        //Para calcular lo litros por kilometro dividimos la gasolina consumida por el precio de gasolina
        //como el precio representa a 1 litro, esto nos daria el total de litros consumidos.
        //Como lo que nos piden es los litros por kilometro lo dividimos por el total de km recorrridos.
        gasolina_litros_km=(gasolina_consumida/prec_gasolina)/kilometros_recorridos;
        //Para calcular el cosumo de gasolina en dolares por kilometro, dividimos el precio consumido por
        //la distanncia recorrida.
        gasolina_dolares_km=gasolina_consumida/kilometros_recorridos;
        //Para los calculos de 100 kilometros utilizamos los valores anteriores que serian en 1km
        //y los multiplicamos para 100.
        gasolina_litros_100km=gasolina_litros_km*100;
        gasolina_dolares_100km=gasolina_dolares_km*100;
        //La velocidad media es igual a distancia_recorrida/tiempo
        //Expresada en km/h tendriamos que dividir los kilometros recorridos para la suma de las horas y el total
        //de horas que hay en los minutos que se ingresaron
        vel_media_km_h=kilometros_recorridos/(horas+(minutos*0.0166667));
        //Expresada en m/h tenemos que hacer la respectiva transformacion de los datos.
        vel_media_m_s=(vel_media_km_h*1000)/3600;
        
        //Se muestra la respuesta y su rexpectiva explicacion.
        System.out.print ("Respuesta:\n"
                + "   Consumo de gasolina por kilometro: "+decimales2.format(gasolina_litros_km)+" en litros y "+decimales.format(gasolina_dolares_km)+" en dinero."
                + "\n   Consumo de gasolina por 100km: "+decimales2.format(gasolina_litros_100km)+" en litros y "+decimales.format(gasolina_dolares_100km)+" en dinero."
                + "\n   La velocidad media es de: "+decimales2.format(vel_media_km_h)+" en km/h y "+decimales2.format(vel_media_m_s)+" en m/s"
                +"\n--------------------------------------------------------------------------------\n");
        validaciones.regresar_inicio();
    }
}