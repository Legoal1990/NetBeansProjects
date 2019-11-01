//Se crean atributos y metodos que se van a heredar
package polimorfismo;

import java.util.Scanner;

public abstract class Operaciones_ClasePadre { //La clase que tiene abstract solo permite declarar el metodo pero no escribir dentro de el la logica o funcion que tendra el metodo y se tiene que heredar a otra clase para que dentro de esa herencia cambiar la parte logica.

    protected int valor1, valor2, resultado;//Usar protected cuando se utiliza herencia
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos() {
        System.out.print("Dame el primer valor:");
        valor1 = entrada.nextInt();

        System.out.print("Dame el segundo valor:");
        valor2 = entrada.nextInt();

    }
    //Cuando se usa polimorfismo hay que agregar abstract
    public abstract void Operaciones(); //Si se coloca abstract la clase tiene que se abstract también
    
    public void MostrarResultado(){
        System.out.print(resultado+"\n");
    }
}
