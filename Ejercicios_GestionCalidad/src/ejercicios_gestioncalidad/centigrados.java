
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class centigrados {

    public static void main(String[] args) throws IOException {
        BufferedReader in;
        in = new BufferedReader(new InputStreamReader(System.in));
        double n, f, c;
        int res = 1, valor;
        int stado;

        while (res != 0) {
            do {
                System.out.println("MENU DE OPCIONES ");
                System.out.println("1.Ingresar grados centigrados y convertirlo a fahrenheit ");
                System.out.println("2.Ingresar grados fahrenheit y convertirlo a centigrado ");
                System.out.println("3. SALIR");
                System.out.println("INGRESE LA OPCION");
                res = Integer.parseInt(in.readLine());
                stado = validar(res);

                switch (res) {
                    case 1:
                        System.out.println("Ingres1e la temperatura en grados centigrados");
                        n = (Double.valueOf(in.readLine())).doubleValue();
                        f = (1.8 * n) + 32;
                        System.out.println("La temperatura ingresada en grados fahrenheit es:" + f);
                        break;
                    case 2:
                        System.out.println("Ingrese la temperatura en grados fahrenheit");
                        n = (Double.valueOf(in.readLine())).doubleValue();
                        c = (n - 32) * (0.55);
                        System.out.println("La temperatura ingresada en grados centigrados es:" + c);
                    case 3:
                        System.exit(0);
                        break;
                }
            } while (stado != 0);
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

    private static int validar(int res) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
