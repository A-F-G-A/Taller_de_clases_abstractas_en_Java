package Ejercicio1;

public abstract class Figura {
    public abstract double Calcular_area();

    public void Mostrar_area() {
        System.out.println("El área es: " + Calcular_area());
    }

}
