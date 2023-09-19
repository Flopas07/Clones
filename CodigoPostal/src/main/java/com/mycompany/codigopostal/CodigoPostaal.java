/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codigopostal;

import java.util.Scanner;

/**
 *
 * @author emmanuel
 */
public class CodigoPostaal {
    Scanner principal = new Scanner(System.in);
    static String cp;

    public void Informacion() {
        System.out.println("Introduce un codigo postal");
        cp = principal.nextLine();

        switch (cp.charAt(0)) {
            case '0', '2', '3' -> System.out.println(cp + "está en la Costa Este");
            case '4', '5', '6' -> System.out.println(cp + "está en el área del Plano Central");
            case '7' -> System.out.println(cp + "está en el Sur");
            case '8' -> System.out.println(cp + "está en direccion Oeste");
            case '9' -> System.out.println(cp + "está en el Oeste");
            default -> System.out.println(cp + "Codigo invalido");
        }
    }

    public static void main(String[] args) {
        CodigoPostaal mostrar = new CodigoPostaal();
        mostrar.Informacion();
    }
}
