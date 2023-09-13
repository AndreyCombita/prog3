
package Punto2;

import java.util.*;

public class Punto2 {
    

public static void mergesort(double[] arreglo) {
    if (arreglo.length <= 1) {
        return;
    }
    int medio = arreglo.length / 2;
    double[] izquierda = Arrays.copyOfRange(arreglo, 0, medio);
    double[] derecha = Arrays.copyOfRange(arreglo, medio, arreglo.length);
    mergesort(izquierda);
    mergesort(derecha);
    fusionar(arreglo, izquierda, derecha);
}

public static void fusionar(double[] arreglo, double[] izquierda, double[] derecha) {
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < izquierda.length && j < derecha.length) {
        if (izquierda[i] <= derecha[j]) {
            arreglo[k] = izquierda[i];
            i++;
        } else {
            arreglo[k] = derecha[j];
            j++;
        }
        k++;
    }
    while (i < izquierda.length) {
        arreglo[k] = izquierda[i];
        i++;
        k++;
    }
    while (j < derecha.length) {
        arreglo[k] = derecha[j];
        j++;
        k++;
    }
}

public static double[] generarArregloAleatorio(int tamaño) {
    double[] arreglo = new double[tamaño];
    Random random = new Random();
    for (int i = 0; i < tamaño; i++) {
        arreglo[i] = random.nextDouble();
    }
    return arreglo;
    }
}