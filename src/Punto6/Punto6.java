package Punto6;

import java.util.Scanner;

public class Punto6 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese hasta que numero quiere mostrar");
        int numero = teclado.nextInt();
        int i;
        for(i=1; i<=numero; i++) {
            System.out.println(i);
        }
    }
}

