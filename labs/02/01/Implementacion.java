package Punto1;

import static Punto1.Operacion.*;
import java.util.Scanner;

public class Implementacion {   // se recomienda guardarlo en un archivo .java separado

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de las matrices (filas columnas): ");
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la primera matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la segunda matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("La suma de las matrices es: ");
        imprimirMatriz(sumaMatrices(matriz1, matriz2));

        System.out.println("El producto de las matrices es: ");
        imprimirMatriz(productoMatrices(matriz1, matriz2));

        System.out.println("Ingrese el escalar para multiplicar con la primera matriz: ");
        int escalar = scanner.nextInt();

        System.out.println("El producto del escalar con la primera matriz es: ");
        imprimirMatriz(productoEscalarMatriz(escalar, matriz1));

        System.out.println("La traspuesta de la primera matriz es: ");
        imprimirMatriz(traspuestaMatriz(matriz1));
    }
}