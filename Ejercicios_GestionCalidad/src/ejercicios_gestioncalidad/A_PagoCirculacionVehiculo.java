package ejercicios_gestioncalidad;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/** Crear un programa que calcule el valor a pagar por un vehículo al circular por una pista. 
    El vehículo puede ser una bicicleta, una moto, un carro o un camión.
    El valor se calcula según los siguientes datos:
        a) Un valor  fijo de 0.50  centavos para las bicicletas.
        b) Las motos y los carros pagarán 0.30 centavos por km.
        c) Los camiones pagaran 0.50 centavos por km más 0.10 centavos por Tm (toneladas métricas).
    Al final muestre el resultado solicitado.
 */
public class A_PagoCirculacionVehiculo {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    Validaciones validaciones = new Validaciones();
    DecimalFormat decimales = new DecimalFormat("0.00"); //Nos permite mostrar por pantalla numeros con el formato dados
    
    double valor_pagar, fijo_bicicleta=0.50, moto_carro=0.30, fijo_camion_km=0.50, fijo_camion_tonelada=0.10;
    public void ingreso_datos() throws IOException{
        System.out.println ("--------------------------------------------------------------------------------\n"
                +"--------------------------------------------------------------------------------\n"
                +"             Calculo de circulacion de vehiculos. Elija un opcion.\n"
                + "          1-> Bicicleta     2-> Carro     3-> Moto     4-> Camiones");
        System.out.print("Tipo vehiculo: ");
        valor_entrada =entrada.next();
        evaluar_opcion(valor_entrada);
    }
    
    public void evaluar_opcion(String opcion) throws IOException{
        switch (opcion) {
            case "1"://Bicicletas
                valor_pagar=fijo_bicicleta;
                mostrar_resultados(valor_pagar);
                break;
            case "2"://Carros
                calculo_moto_carro();
                break;
            case "3"://Motos
                calculo_moto_carro();
                break;
            case "4"://Camiones
                calculo_camiones();
                break;
            default://Si no se ingresa la opcion correcta nos pregunta si deseamos intentarlo de nuevo y vuelve a validar la opcion
                System.out.print("Opcion no valida, ¿Desea intentarlo de nuevo? (SI/NO): ");
                valor_entrada =entrada.next();
                if(valor_entrada.equals("SI")||valor_entrada.equals("si")||valor_entrada.equals("Si")||valor_entrada.equals("NO")||valor_entrada.equals("no")||valor_entrada.equals("NO")){
                    if(valor_entrada.equals("SI")||valor_entrada.equals("si")||valor_entrada.equals("Si")){
                        System.out.print("Tipo vehiculo: ");
                        valor_entrada =entrada.next(); 
                        evaluar_opcion(valor_entrada);
                    }else{
                        validaciones.regresar_inicio();
                    }
                }else{
                    evaluar_opcion("lll");
                }
        }
    }
    
    public void mostrar_resultados(double valor) throws IOException{
        //Mostramos resultados y preguntamos si se quiere volver al menu inicio
        System.out.print("Respuesta:\nEl valor a pagar es: "+decimales.format(valor)
        +"\n--------------------------------------------------------------------------------\n");
        validaciones.regresar_inicio();
    }
    
    public void calculo_moto_carro() throws IOException{
        //Pedimos los kilometros recorridos y validamos llamando al metodo externo
        System.out.print("Ingrese los kilometros recorridos: ");
        valor_entrada =entrada.next();
        if(validaciones.validar_solo_numeros_positivos(valor_entrada)==true){
            //Si los valores son correctos convertimos de String a double y lo multiplicamos para l respectiva cuota
            valor_pagar=Double.parseDouble(valor_entrada)*moto_carro;
            mostrar_resultados(valor_pagar);
        }else{
            System.out.print ("--Error en dato, intentelo de nuevo\n");
            calculo_moto_carro();
        }
    }
    
    public void calculo_camiones() throws IOException{
        Double kilometros, peso;
        System.out.print("Ingrese los kilometros recorridos: ");
        valor_entrada =entrada.next();
        //Primero validamos que los kilomoetros sean correctos
        while(validaciones.validar_solo_numeros_positivos(valor_entrada)==false){
            System.out.print ("--Error en dato, intentelo de nuevo\n");
            System.out.print("Ingrese los kilometros recorridos: ");
            valor_entrada =entrada.next();
        }
        //Una ves que los datos ingresados sean correctos guardamos y pasamos a ingresar el peso que tambien sera validado
        kilometros=Double.parseDouble(valor_entrada);
        System.out.print("Ingrese el peso/Toneladas metricas:: ");
        valor_entrada =entrada.next();
        while(validaciones.validar_solo_numeros_positivos(valor_entrada)==false){
            System.out.print ("--Error en dato, intentelo de nuevo\n");
            System.out.print("Ingrese el peso/Toneladas metricas: ");
            valor_entrada =entrada.next();
        }
        peso=Double.parseDouble(valor_entrada);
        //Si los valores son correctos sumamos las respectivas cuotas
        valor_pagar=(kilometros*0.50)+(peso*0.10);
        mostrar_resultados(valor_pagar);
    }
}
