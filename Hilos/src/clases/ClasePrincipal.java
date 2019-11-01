package clases;

public class ClasePrincipal {
    public static void main(String []args){
        Proceso1 hilo1= new Proceso1(); //El que era el mensajero siempre q se use el extens treath
        Proceso1 hilo3= new Proceso1(); 
        
        Thread hilo2 = new Thread(new Proceso2());
        //Como arrancar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
