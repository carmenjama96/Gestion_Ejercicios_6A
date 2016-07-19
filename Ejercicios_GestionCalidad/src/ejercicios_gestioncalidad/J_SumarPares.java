package ejercicios_gestioncalidad;

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
public class J_SumarPares {

    public void sumapar() throws IOException{
        Scanner sc = new Scanner(System.in);
        int stado;
        int i, sump = 0, sumi = 0;
        String cad = "", sal = "";

        do {
            System.out.println("Ingrese un numero Mayor a 20");
            String valor = sc.nextLine();

            stado = validar(valor);
            if (stado == 0) {

                int num = Integer.parseInt(valor);
                if (num >= 20) {
                    for (i = 20; i < num; i++) {
                        if (i % 2 == 0) {
                            cad = cad + " " + (i);

                            sump = sump + i;
                        }

                    }
                    System.out.println("Pares\n" + cad);

                    System.out.println("Suma Pares " + sump);
                } else {
                    stado = 1;
                }
            }
        } while (stado != 0);

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
