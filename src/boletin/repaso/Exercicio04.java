/*
 4) Fai un programa que cree un array de 10x10 de números enteiros de 1 a 10, de forma aleatoria, e despois pida un numero de columna e un valor e lle de ese valor a todos os números da columna.
 */
package boletin.repaso;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int numeroColumna;
        
        //Contruir Array
        Random aleatorio = new Random();
        int[][] array = new int [10][10];
        for ( int rellenarArray = 0; rellenarArray < array.length; rellenarArray++ ) {
            for ( int continuarRellenando = 0; continuarRellenando < array[rellenarArray].length; continuarRellenando++ ) {
                array[rellenarArray][continuarRellenando] = aleatorio.nextInt(10) + 1;
            }
        }
        
        //Imprimir Array
        for ( int rellenarArray = 0; rellenarArray < array.length; rellenarArray++ ) {
            System.out.print("\n");
            for ( int continuarRellenando = 0; continuarRellenando < array[rellenarArray].length; continuarRellenando++ ) {
                if ( array [rellenarArray][continuarRellenando] < 10 ) {
                    System.out.print(" ");
                }
                System.out.print(array[rellenarArray][continuarRellenando]+" ");
            }
        } 
        
        //Dato a modificar
        System.out.print("\nDato a modificar \nIntroduce numero de columna: ");
        numeroColumna = leer.nextInt() - 1;
        System.out.print("\nIntroduce que valor quieres introducir: ");
        numero = leer.nextInt();

        //Modificamos valor en el Array
        for ( int rellenarArray = 0; rellenarArray < array.length; rellenarArray++ ) {
            array [rellenarArray][numeroColumna] = numero;
            }
        
        System.out.print("\nModificacion exitosa.");
    
        //Imprimir Array
        for ( int rellenarArray = 0; rellenarArray < array.length; rellenarArray++ ) {
            System.out.print("\n");
            for ( int continuarRellenando = 0; continuarRellenando < array[rellenarArray].length; continuarRellenando++ ) {
                if ( array [rellenarArray][continuarRellenando] < 10 ) {
                    System.out.print(" ");
                }
                System.out.print(array[rellenarArray][continuarRellenando]+" ");
            }
        } 
    
    }
    
}