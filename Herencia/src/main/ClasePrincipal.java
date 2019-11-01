package main;
import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;

public class ClasePrincipal {
    public static void main(String [] args){
        //crear instancias para comunicarnos con otra clase- crear objetos
           ClaseHija_Suma mensajeroSuma= new ClaseHija_Suma();
           mensajeroSuma.PedirDatos();
           mensajeroSuma.Sumar();
           System.out.println("El resultado de la suma es:");
           mensajeroSuma.MostrarResultado();
           
           ClaseHija_Resta mensajeroResta= new ClaseHija_Resta();
           mensajeroResta.PedirDatos();
           mensajeroResta.Restar();
           System.out.println("El resultado de tu resta es:");
           mensajeroResta.MostrarResultado();
    }
}
