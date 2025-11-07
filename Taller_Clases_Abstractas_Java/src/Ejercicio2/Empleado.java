package Ejercicio2;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;


    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public abstract double calcular_Salario();

    public void mostrar_Detalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario Total: " + calcular_Salario());
    }



}