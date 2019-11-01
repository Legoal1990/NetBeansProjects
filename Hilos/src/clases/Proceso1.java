/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Propietario
 */
public class Proceso1 extends Thread{
    
    @Override
    public void run(){ //Método de la clase Thread
        for(int i=0; i<=5; i++){
            System.out.println("Proceso 1");
        }
    }    
}
