
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
public class tabla {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int stado;
        do {
            System.out.println("Ingrese Un numero");

            String valor = sc.nextLine();
            stado = validar(valor);
            if (stado == 0) {
                int num = Integer.parseInt(valor);

                System.out.println("**************************************************");

                for (int i = 0; i <= num; i++) {
                    System.out.println("*    \t" + i + "        \t" + Math.pow(i, 2) + "     \t" + Math.pow(i, 3) + "  \t *");

                }

                System.out.println("**************************************************");

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
