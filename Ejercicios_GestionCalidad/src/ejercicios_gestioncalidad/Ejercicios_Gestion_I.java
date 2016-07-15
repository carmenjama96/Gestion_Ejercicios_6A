package ejericios_gestion_i;
import java.util.Scanner;

public class Ejercicios_Gestion_I {
    Scanner entrada = new Scanner (System.in);
    
    public void entrada_opcion(){
    System.out.println ("--------------------------------------------------------\n"
                          +"  Autores: Guerrero Ketter, Jama Carmen, Lazaro Johanna.\n"
                          + "            BIENVENIDO ESCOJA UNA OPCION \n"
                          + "--------------------------------------------------------\n"
                + "1. Calcular el area y perimetro de un triangulo rectangulo\n");
        System.out.print("Opcion: ");
        String opcion =entrada.next();
        evaluar_opcion(opcion);
    }
    
    public void evaluar_opcion(String valor){
        switch (valor) {
            case "1":
                A_AreaPerimetroTriganguloRectangulo ejercicio_1= new A_AreaPerimetroTriganguloRectangulo();
                ejercicio_1.entrada_datos();
                break;
            default:
                System.out.print("Opcion no valida, ¿Desea intentarlo de nuevo? (SI/NO): ");
                String opcion =entrada.next();
                if(opcion.equalsIgnoreCase("SI")){
                    System.out.print("\n\n\n\n\n\n");
                    entrada_opcion();
                }else{
                    break;
                }
        }
    }
    public static void main(String[] args) {
        Ejercicios_Gestion_I ejecucion = new Ejercicios_Gestion_I();
        ejecucion.entrada_opcion();
    }
}
