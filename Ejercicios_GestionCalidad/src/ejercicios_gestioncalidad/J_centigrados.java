package ejercicios_gestioncalidad;




import java.io.IOException;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Johanna lazaro
 */
public class J_centigrados {
    //static Validaciones validaciones = new Validaciones();
    String Letra;
    int valor;
    String ValorC;
    double resultado;
    Scanner entrada = new Scanner(System.in);

   
    public void centigrados()throws IOException {
        System.out.println("\n\n\t Ingrese la unidad a calcular:");
        Letra = entrada.nextLine();
        if (isNumeric(Letra)) {
            System.out.println("Ingrese C o F");
            centigrados();
        } else if ("c".equals(Letra) || "f".equals(Letra) || "C".equals(Letra) || "F".equals(Letra)) {
            ValidarNumero();
        } else {
            System.out.println("No es un caracter Válido");
            centigrados();
        }
        
    }

    public void ValidarNumero() throws IOException{
        System.out.println("\n\n\t Ingrese el valor:");
        valor = entrada.nextInt();
        ValorC = String.valueOf(valor);
        if (isNumeric(ValorC)) {
            proceso();
        } else {
            System.out.println("No es un caracter valido");
        }     

    }

    public void proceso()throws IOException {

        if (Letra.equals("c") || Letra.equals("C")){
            resultado = 32 + (9 * valor / 5);
            System.out.println("El resultado es de: " + resultado + " Grados Fahrenheit");
            
        }
        
        if (Letra.equals("f") || Letra.equals("F")){
            resultado = (valor-32)*5/9;
            System.out.println("El resultado es de: " + resultado + " Grados Centigrados");
        }        
    }
    
    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
}
