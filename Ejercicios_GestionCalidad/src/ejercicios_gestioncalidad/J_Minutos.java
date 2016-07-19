package ejercicios_gestioncalidad;

import static ejercicios_gestioncalidad.ejercicio2.validaciones;
import java.io.IOException;
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
public class J_Minutos {

    public void minutos() throws IOException{
        Scanner sc = new Scanner(System.in);
        int stado;
        int num, dias, hor, min;

        do {
            System.out.println("Ingrese los minutos, ¡Sólo números!");
            String valor = sc.nextLine();
            stado = validar(valor);
            if (stado == 0) {
                num = Integer.parseInt(valor);
                dias = num / 1440;
                hor = num / 60;
                min = (num - (60 * hor));
                System.out.println(dias + " dias " + hor + " h " + min + " m");
            }
        } while (stado != 0);
        validaciones.regresar_inicio();

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
