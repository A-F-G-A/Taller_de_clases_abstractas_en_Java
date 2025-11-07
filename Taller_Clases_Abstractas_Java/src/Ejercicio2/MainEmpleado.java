package Ejercicio2;

public class MainEmpleado{
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Carlos Arrieta", 5000, 1500);
        Empleado Vendedor = new Vendedor("Anita Jhons", 3000, 20000);

        System.out.println("Detalles del Gerente:");
        gerente.mostrar_Detalles();
        System.out.println("Detalles del Vendedor:");
        Vendedor.mostrar_Detalles();
    }

}