package clases;

public class ClaseHija_Consulta extends ClasePadre_Abstracta{ //Herencia de la clase padre
    @Override // Es importante sobreescribir el método
    public void Transacciones(){//Método al que queremos aplicar el polimorfismo
        System.out.println("------------------------------------");
        System.out.println("Tu saldo actual es: "+ getSaldo());
        System.out.println("------------------------------------");
    }
    
}
