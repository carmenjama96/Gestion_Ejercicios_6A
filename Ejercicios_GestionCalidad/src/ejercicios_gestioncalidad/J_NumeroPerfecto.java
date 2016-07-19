
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Johanna lazaro
 */
public class J_NumeroPerfecto {

    public static void main(String[] args) {
        int i,j, suma = 0, n;
        Scanner sc = new Scanner(System.in);
        int stado;

             for (i = 1; i <= 9000; i++) {    // i es el número que vamos a comprobar
                    suma = 0;
                    for (j = 1; j < i; j++) {  // j son los divisores. Se divide desde 1 hasta i-1
                        if (i % j == 0) {
                            suma = suma + j;     // si es divisor se suma
                        }
                    }
                    if (i == suma) {           // si el numero es igual a la suma de sus divisores es perfecto
                        System.out.println(i);
                    }
                }      

    }

    private static int validar(String valor) {
        Pattern path = Pattern.compile("[0-9]{1,10}");
        Matcher mat = path.matcher(valor);
        if (mat.matches()) {
            return 0;
        } else {
            return 1;

        }
    }
}
