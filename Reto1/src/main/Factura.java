package main;

import java.util.Scanner;

public class Factura {
    public Factura() {

    }

    public static void Costo() {
        int valor = 0;
        float costo = 0;
        float desc = 0;
        float inf = 0;
        float parcial = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Estrato del inmueble:");
        int estrato = Integer.parseInt(input.nextLine());
        System.out.println("Consumo del inmueble:");
        int consumo = Integer.parseInt(input.nextLine());
        switch (Main.menu) {
            case 1:
                valor = 6200;
                costo = consumo * valor;
                parcial = costo;
                if (estrato == 1 || estrato == 2) {
                    desc = (costo * 50) / 100;
                    costo = costo - desc;
                } else if (estrato == 3 || estrato == 4) {
                    desc = (costo * 10) / 100;
                    costo = costo - desc;
                } else if (estrato == 5 || estrato == 6) {
                    desc = (costo * 25) / 100;
                    costo = costo + desc;
                }
                inf = (parcial * 1) / 100;
                costo = costo + inf;
                System.out
                        .println("El consumo fue: " + consumo + "\nValor unidad: " + valor + "\nEstrato del inmueble: "
                                + estrato + "\nCosto total: " + parcial + "´\nDescuento o sobrecosto: -" + desc
                                + "\nImpuesto por infraestructura: " + inf + "\nTOTAL A PAGAR: " + costo);

                break;
            case 2:
                valor = 9256;
                costo = consumo * valor;
                costo = consumo * valor;
                parcial = costo;
                if (estrato == 1 || estrato == 2) {
                    desc = (costo * 50) / 100;
                    costo = costo - desc;
                } else if (estrato == 3 || estrato == 4) {
                    desc = (costo * 10) / 100;
                    costo = costo - desc;
                } else if (estrato == 5 || estrato == 6) {
                    desc = (costo * 25) / 100;
                    costo = costo + desc;
                }
                inf = (parcial * 1) / 100;
                costo = costo + inf;
                System.out
                        .println("El consumo fue: " + consumo + "\nValor unidad: " + valor + "\nEstrato del inmueble: "
                                + estrato + "\nCosto total: " + parcial + "\nDescuento o sobrecosto: -" + desc
                                + "\nImpuesto por infraestructura: " + inf + "\nTOTAL A PAGAR: " + costo);
                break;
            case 3:
                valor = 5234;
                costo = consumo * valor;
                costo = consumo * valor;
                parcial = costo;
                if (estrato == 1 || estrato == 2) {
                    desc = (costo * 50) / 100;
                    costo = costo - desc;
                } else if (estrato == 3 || estrato == 4) {
                    desc = (costo * 10) / 100;
                    costo = costo - desc;
                } else if (estrato == 5 || estrato == 6) {
                    desc = (costo * 25) / 100;
                    costo = costo + desc;
                }
                inf = (parcial * 1) / 100;
                costo = costo + inf;
                System.out
                        .println("El consumo fue: " + consumo + "\nValor unidad: " + valor + "\nEstrato del inmueble: "
                                + estrato + "\nCosto total: " + parcial + "\nDescuento o sobrecosto: -" + desc
                                + "\nImpuesto por infraestructura: " + inf + "\nTOTAL A PAGAR: " + costo);
                break;
            default:
                break;
        }
    }

}
