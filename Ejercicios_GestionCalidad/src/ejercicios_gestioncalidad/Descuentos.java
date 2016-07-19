
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
 * @author Johanna Lazaro
 */
public class Descuentos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stado, cantidad;
        double total, descuento;

        do {
            System.out.println("Ingrese valor de su compra");
            String valor = sc.nextLine();
            stado = validar(valor);
            if (stado == 0) {
                cantidad = Integer.parseInt(valor);
                if (cantidad >= 100 && cantidad < 500) {
//                    System.out.println("menos el 5% de descuento");
                    descuento = (cantidad * 0.05);
                    total = cantidad - descuento;
                    System.out.println("su subtotal: " + cantidad + "\nDescuento del 5%: " + descuento + "\nValor a pagar: " + total);

                } else if (cantidad >= 500 && cantidad < 800) {
                    descuento = (cantidad * 0.10);
                    total = cantidad - descuento;
                    System.out.println("su subtotal: " + cantidad + "\nDescuento del 10%: " + descuento + "\nValor a pagar: " + total);

                } else if (cantidad >= 800) {
                    descuento = (cantidad * 0.12);
                    total = cantidad - descuento;
                    System.out.println("su subtotal: " + cantidad + "\nDescuento del 12%: " + descuento + "\nValor a pagar: " + total);

                } else {
                    System.out.println(cantidad+"\nNo hay descuento compra mas");
                }

            }
        } while (stado != 0);

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
