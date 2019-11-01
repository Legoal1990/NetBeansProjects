package division;

import java.util.Scanner;

public class ClaseDivision {

    public static void main(String[] args) {

        try {
            //Còdigo que queremos que se ejecute de manera inicial
            int valor1, valor2, resultado;
            Scanner entrada = new Scanner(System.in);

            System.out.println("Dame el primer valor:");
            valor1 = entrada.nextInt();

            System.out.println("Dame el segundo valor:");
            valor2 = entrada.nextInt();

            resultado = valor1 / valor2;

            System.out.println("Divisiòn es igual a: " + resultado);
        } catch (Exception e) {//debe contener un objeto de clase exception
            //Contener el comportamiento de nuestro programa cuando se llegue a generar un error que no tenemos previsto
            System.out.println("Error!!! "+e);
        }finally{ //permite ejecutar el bloque de codigo sin importar el resultado DEL PROGRAMA, si se ejcuto correctamente o caputor un error siempre se va a ejecutar
            System.out.println("Operación concluida!!");
        }
    }
}
