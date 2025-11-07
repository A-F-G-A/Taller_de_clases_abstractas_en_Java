package Ejercicio3;


public class Mainerror {
 public static void main(String[] args) {
     // No se puede instanciar una clase abstracta
     // Animal miAnimal = new Animal(); // Esto causará un error de compilación

     // En ves de eso, se debe instanciar una subclase concreta de Animal
     // Por ejemplo:
     // Perro miPerro = new Perro();
     // miPerro.hacerSonido();
     // miPerro.dormir();
     // Animal.hacerSonido();//Llamada incorrecta a método estático
 }
    
}