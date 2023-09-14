

import java.util.Arrays;

public class Carro1 implements Comparable<Parte31> {
    private String marca;
    private String modelo;
    private String color;
    private int kilometraje;

    public Carro1(String marca, String modelo, String color, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    @Override
    public int compareTo(Parte31 otroCarro) {
        return this.modelo.compareTo(otroCarro.getModelo());
    }

    
    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
}

