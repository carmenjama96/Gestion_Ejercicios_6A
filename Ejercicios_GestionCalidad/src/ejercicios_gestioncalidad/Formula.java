
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
public class Formula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stado, cantidad;
        do {
            System.out.println("Ingrese valor  XD");
            double total = 0;
            String valor = sc.nextLine();
            stado = validar(valor);
            if (stado == 0) {
                String cade = "S=(";
                int num = Integer.parseInt(valor);
                for (int i = 1; i < num; i++) {
                    cade = cade + i + "/" + i * 2 + "+";
                    total = total + (i / i * 2);
                }
                cade = cade + ")";

                System.out.println(cade);
                System.out.println(total);
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
