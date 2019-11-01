
package polimorfismo;

public class Suma_ClaseHija extends Operaciones_ClasePadre{
    //Sobreescribir un método 
    //Es porque está declarado en otra clase pero que se va a implementar su lógica en otra clase completamente diferente y no colocar la palabra abstract
    @Override
    public void Operaciones(){
         resultado=valor1+valor2;
    }    
}
