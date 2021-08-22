package main;

import java.util.Scanner;

public class Main {
    public static int menu = 0;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(
                    "PAGO DE SERVICIOS PUBLICOS\nSeleccione el servicio publico:\n1. Energia\n2. Acueducto\n3. Gas Natural\n4. Salir\nOpcion: ");
            menu = Integer.parseInt(input.nextLine());
            switch (menu) {
                case 1:
                    Factura.Costo();
                    break;
                case 2:
                    Factura.Costo();
                    break;
                case 3:
                    Factura.Costo();
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    break;
            }
        } while (menu != 4);
    }
}
