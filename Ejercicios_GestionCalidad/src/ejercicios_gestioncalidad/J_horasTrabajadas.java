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
public class J_horasTrabajadas {

    public void horastra() throws IOException{
        String horas;
        String tarifa;
        int horasextra;
        double total, total1,total2, tarifa2;
        int stado = 0, stado2 = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese horas trabajadas");
            horas = sc.next();
            stado = validar(horas);
            if (stado == 0) {
                System.out.println("Ingrese tarifa");
                tarifa = sc.next();
                stado2 = validar(tarifa);

                if (stado2 == 0) {
                    if (Integer.parseInt(horas) > 40) {
                        tarifa2 = (Integer.parseInt(tarifa) * 0.50);
                        horasextra = Integer.parseInt(horas) - 40;
                        total = 40 * Integer.parseInt(tarifa);
                        total1 = horasextra * (tarifa2 + Integer.parseInt(tarifa));

                        total2 = total + total1;

                        System.out.println("40 horas   :" + total + " extras:" + horasextra + "="+total1+" Total:" + total2);
                    } else {
                        total = Integer.parseInt(horas) * Integer.parseInt(tarifa);
                        System.out.println(total);

                    }
                }
            }
        } while (stado != 0 | stado2 != 0);
        validaciones.regresar_inicio();
    }

    private static int validar(String valor) {

        Pattern path = Pattern.compile("[0-9]{1,10000000000}");
        Matcher mat = path.matcher(valor);
        if (mat.matches()) {
            return 0;
        } else {
           return 1;

        }

    }
}
