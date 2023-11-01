/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1;

import java.util.Scanner;

public class Captura {
    private static Scanner leer = new Scanner(System.in);

    public static double nextDouble(String message) {
        System.out.print(message);
        return leer.nextDouble();
    }

    public static double[][] readMat(int filas, int cols) {
        double[][] matR = new double[filas][cols];

        // ... completar el desarrollo del método
        return matR;
    }
}
