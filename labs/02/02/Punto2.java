
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

public static void main(String[] args) {
        int[] tamaños = {100, 500, 1000, 5000, 10000};
        double[][] arreglos = new double[tamaños.length][];
        for (int i = 0; i < tamaños.length; i++) {
            arreglos[i] = generarArregloAleatorio(tamaños[i]);
        }
        
        System.out.println("Método\t\t100\t\t500\t\t1000\t\t5000\t\t10000");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Burbuja\t\t");
        for (int i = 0; i < tamaños.length; i++) {
            double[] arreglo = arreglos[i];
            long tiempoInicio = System.currentTimeMillis();
            burbuja(arreglo);
            long tiempoFin = System.currentTimeMillis();
            long tiempoTotal = tiempoFin - tiempoInicio;
            System.out.print(tiempoTotal + " ms\t");
        }
        System.out.println();
        
        System.out.print("Inserción\t");
        for (int i = 0; i < tamaños.length; i++) {
            double[] arreglo = arreglos[i];
            long tiempoInicio = System.currentTimeMillis();
            insercion(arreglo);
            long tiempoFin = System.currentTimeMillis();
            long tiempoTotal = tiempoFin - tiempoInicio;
            System.out.print(tiempoTotal + " ms\t");
        }
        System.out.println();
        
        System.out.print("Selección\t");
        for (int i = 0; i < tamaños.length; i++) {
            double[] arreglo = arreglos[i];
            long tiempoInicio = System.currentTimeMillis();
            seleccion(arreglo);
            long tiempoFin = System.currentTimeMillis();
            long tiempoTotal = tiempoFin - tiempoInicio;
            System.out.print(tiempoTotal + " ms\t");
        }
        System.out.println();
        
        System.out.print("Mergesort\t");
        for (int i = 0; i < tamaños.length; i++) {
            double[] arreglo = arreglos[i];
            long tiempoInicio = System.currentTimeMillis();
            mergesort(arreglo);
            long tiempoFin = System.currentTimeMillis();
            long tiempoTotal = tiempoFin - tiempoInicio;
            System.out.print(tiempoTotal + " ms\t");
        }
        System.out.println();
    }
    
    public static void burbuja(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    double temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    
    public static void insercion(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            double actual = arreglo[i];
            int j = i - 1;
            while (j >= 0 ){
                arreglo[j + 1] = arreglo[j];
                j--;
        }
        arreglo[j + 1] = actual;
    }
}

public static void seleccion(double[] arreglo) {
    int n = arreglo.length;
    for (int i = 0; i < n - 1; i++) {
        int minimoIndice = i;
        for (int j = i + 1; j < n; j++) {
            if (arreglo[j] < arreglo[minimoIndice]) {
                minimoIndice = j;
            }
        }
        double temp = arreglo[minimoIndice];
        arreglo[minimoIndice] = arreglo[i];
        arreglo[i] = temp;
    }
}
}