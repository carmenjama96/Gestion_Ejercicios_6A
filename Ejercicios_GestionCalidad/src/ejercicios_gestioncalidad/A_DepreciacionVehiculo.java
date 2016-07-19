
package ejercicios_gestioncalidad;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
    Un señor adquiere un vehículo en un valor X, dicha persona desea saber la depreciación que sufrirá dicho vehículo en N años.
    Previo análisis desarrolle un diagrama que permita mostrar el año y la depreciación que sufre el vehículo en cada año.
    Para calcular la depreciación usará el método de la “suma de dígitos”.
    Ejemplo: Si el vehículo vale X cantidad en N años, deberá considerar:
	1+2+3+.....+N (Sumatoria)
	Depreciación primer año:   N   / sumatoria * X
	Depreciación segundo año:  N-1 / sumatoria * X
	Depreciación tercer año:   N-2 / sumatoria * X
	Así sucesivamente.
 */
public class A_DepreciacionVehiculo {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    Validaciones validaciones = new Validaciones();
    DecimalFormat decimales = new DecimalFormat("0.00"); //Nos permite mostrar por pantalla numeros con el formato dado
    
    double valor_inicial, depreciacion_anual, sumatoria, depreciacion_calculo;
    int fecha, tiempo;
    
    public void ingreso_datos() throws IOException{
        System.out.println ("--------------------------------------------------------------------------------\n"
                +"--------------------------------------------------------------------------------\n"
                +"                           Depresiacion de vehiculo.");
        //Realizamos el ingreso de datos y la respectiva validacion de los mismos
        System.out.print("Ingrese año de compra: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_ingresos(valor_entrada, "fecha");
        System.out.print("Ingrese valor de vehiculo: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_ingresos(valor_entrada, "valor");
        System.out.print("¿Para cuantos años desea calcular la depreciacion?: ");
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_ingresos(valor_entrada, "tiempo");
        calcular_depreciacion();//Se llama a metodo para calcular valores
    }
    
    public void validar_ingresos(String valor, String tipo){
        switch (tipo) {
            //Dependiendo de la opcion ingresada haremos el proceso
            case "valor": //En este caso como se trata del valor del vehiculo validamos el formato de la moneda
                if(validaciones.validar_modena(valor_entrada)==true){
                    valor_inicial=Double.parseDouble(valor);
                }else{
                    mensaje_error("Ingrese valor de vehiculo: ", tipo);
                }
                break;
            case "fecha"://Validamos que el a;o ingresado sea corecto
                if(validaciones.longitud_string(valor)==false){
                    if(validaciones.validar_numeros_enteros_positivos(valor) && Integer.parseInt(valor)>999){
                       fecha=Integer.parseInt(valor);
                    }else{
                        mensaje_error("Ingrese año de compra: ", tipo);
                    }
                }else{
                    mensaje_error("Ingrese año de compra: ", tipo);
                }
                break;
            case "tiempo": //Validamos que el total de años que se piden calcular la depreciacion sean correctos, mayores a c y enteros
                if(validaciones.longitud_string(valor)==false){
                    if(validaciones.validar_numeros_enteros_positivos(valor) && (Integer.parseInt(valor)>0)){
                        tiempo=Integer.parseInt(valor);
                    }else{
                        mensaje_error("¿Para cuantos años desea calcular la depreciacion?: ", tipo);
                    }
                }else{
                    mensaje_error("¿Para cuantos años desea calcular la depreciacion?: ", tipo);
                }           
                break;
        }
    }
    
    public void mensaje_error(String mensaje, String tipo){
        //Si hubo algun error en la validacion, este metodo pide volver a ingresar el valor
        if(tipo.equals("fecha") || tipo.equals("tiempo")){
            System.out.print ("--Error en dato, vuelva a intentarlo\n");
        }else{//En caso de que se trate de monedas, se muestra el formato a seguir
            System.out.print ("--Error, intentelo de nuevo (Siga este formato -> 00.00)\n");
        }
        System.out.print (mensaje);
        valor_entrada=entrada.nextLine().replaceAll("\\s", "");
        validar_ingresos(valor_entrada, tipo);
    }
    
    public void calcular_depreciacion() throws IOException{
        calculo_sumatoria();
        //Mostramos los datos inciales
        System.out.print ("Respuesta:\n"
                +"   AÑO    ||   DEPRECIACION\n");
        do{
            fecha=fecha+1;//Se va aumentanndo la fecha, para mostrar el año
            depreciacion_calculo=(tiempo/sumatoria)*valor_inicial;//Las cuotas de depreciación de decrecientes para cada periodo serán igual al producto del valor sujeto a las depreciaciones
                                                                  // por cada una de las fracciones formadas, al dividir el numero de depreciaciones a calcular por lla sumatoria de los digitos.
            System.out.print ("   "+fecha+"   ||     "+decimales.format(depreciacion_calculo)+"\n");//Mostramos por pantalla
            tiempo=tiempo-1;//Se disminuye el tiempo, o el numero de veces que se va a calcular la depreciacion
        }while(tiempo<0 || depreciacion_calculo==0); //Este ciclo se repite hasta 
        System.out.print ("--------------------------------------------------------------------------------\n");
        validaciones.regresar_inicio();
    }
    
    public void calculo_sumatoria(){//Este metodo calcula la suma de los digitos sucesivos de vida estimados del vehiculo deprecciado
        sumatoria=(tiempo*(tiempo+1))/2;
    }
}
