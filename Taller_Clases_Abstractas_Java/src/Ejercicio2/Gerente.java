package Ejercicio2;


public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcular_Salario() {
        return salarioBase + bono;
    }
    
    
}