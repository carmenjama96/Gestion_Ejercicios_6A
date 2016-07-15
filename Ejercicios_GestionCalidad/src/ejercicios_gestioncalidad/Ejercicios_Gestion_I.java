package ejercicios_gestioncalidad;
import java.util.Scanner;

public class Ejercicios_Gestion_I {
    Scanner entrada = new Scanner (System.in);
    String valor_entrada;
    
    public void entrada_opcion(){
    System.out.println ("--------------------------------------------------------\n"
                          +"  Autores: Guerrero Ketter, Jama Carmen, Lazaro Johanna.\n"
                          + "            BIENVENIDO ESCOJA UNA OPCION \n"
                          + "--------------------------------------------------------\n"
                + "1. Calcular el area y perimetro de un triangulo rectangulo\n");
        System.out.print("Opcion: ");
        valor_entrada =entrada.next();
        evaluar_opcion(valor_entrada);
    }
    
    public void evaluar_opcion(String opcion){
        switch (opcion) {
            case "1":
                A_AreaPerimetroTriganguloRectangulo ejercicio_1= new A_AreaPerimetroTriganguloRectangulo();
                ejercicio_1.entrada_datos();
                break;
            default:
                System.out.print("Opcion no valida, ¿Desea intentarlo de nuevo? (SI/NO): ");
                valor_entrada =entrada.next();
                if(valor_entrada.equals("SI")||valor_entrada.equals("si")||valor_entrada.equals("Si")){
                    System.out.print("\n\n\n\n\n\n");
                    entrada_opcion();
                }else{
                    System.exit(0);
                }
        }
    }
    public static void main(String[] args) {
        Ejercicios_Gestion_I ejecucion = new Ejercicios_Gestion_I();
        ejecucion.entrada_opcion();
        A_AreaPerimetroTriganguloRectangulo ejercicio_1= new A_AreaPerimetroTriganguloRectangulo();
        ejercicio_1.entrada_datos();
    }
}
