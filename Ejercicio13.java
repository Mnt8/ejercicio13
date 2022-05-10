/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13;
import java.util.Scanner;
/**
 *Pide por teclado un número entero positivo (debemos controlarlo) y
muestra el número de cifras que tiene. Por ejemplo: si introducimos
1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene
una o mas cifras, al mostrar el mensaje.
 * @author LABMOVIL
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int numero ;
     Scanner teclado = new Scanner (System.in);
   
       do { System.out.println("ingresa un numero positivo"); 
         numero = teclado.nextInt(); 
            
        } while (numero < 0);
             
        
       
         
    }
    
}
