package clases;

public class ClasePrincipal { //En el método main se debe llamar a los Método operaciones y método setter  y como la clase padre es 
                              //abstracta no se puede instanciar normal
    public static void main(String []args){
        ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
        mensajero.setSaldo(500);
        mensajero.Operaciones();
        
    }
}
