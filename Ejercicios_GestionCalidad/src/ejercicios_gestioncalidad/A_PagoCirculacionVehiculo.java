package ejercicios_gestioncalidad;

/** Crear un programa que calcule el valor a pagar por un vehículo al circular por una pista. 
    El vehículo puede ser una bicicleta, una moto, un carro o un camión.
    El valor se calcula según los siguientes datos:
        a) Un valor  fijo de 0.50  centavos para las bicicletas.
        b) Las motos y los carros pagarán 0.30 centavos por km.
        c) Los camiones pagaran 0.50 centavos por km más 0.10 centavos por Tm (toneladas métricas).
    Al final muestre el resultado solicitado.
 */
public class A_PagoCirculacionVehiculo {
    double valor_pagar, fijo_bicicleta=0.50, moto_carro=0.30, fijo_camion_km=0.50, fijo_camion_tonelada=0.10;
    public void ingreso_datos(){
        System.out.println ("--------------------------------------------------------------------------------\n"
                           +"--------------------------------------------------------------------------------\n"
                           +"             Calculo de circulacion de vehiculos. Elija un opcion.\n");
        
    }
}
