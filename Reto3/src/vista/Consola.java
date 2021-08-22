package vista;

import java.util.Scanner;

public class Consola {
    private Scanner sc;

    public Consola() {
        sc = new Scanner(System.in);
    }

    public void mostrarMensaje(String pMen) {
        System.out.println(pMen);
    }

    public int leerEntero(String pStr) {
        int i;
        try {
            System.out.println(pStr);
            i = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("El dato ingresado no es un numero.");
            i = 0;
        }
        return i;
    }

    public String leerString(String pStr) {
        System.out.println(pStr);
        String str = sc.nextLine();
        return str;
    }

    public long leerLong(String pStr) {
        long l;
        try {
            System.out.println(pStr);
            l = sc.nextLong();
            sc.nextLine();
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("El dato ingresado no es un numero.");
            l = 0;
        }
        return l;
    }
}
