package Ejercicio1;


public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double Calcular_area() {
        return Math.PI * Math.pow(radio, 2);
    }
}