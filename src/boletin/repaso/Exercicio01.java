/*
1) Fai un programa que cree un array de 10x10 de números enteiros de 1 a 10, de forma aleatoria, despois pida un numero e diga cantas veces se repite.
 */
package boletin.repaso;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        
        //Contruir Array
        Random aleatorio = new Random();
        int[][] array = new int [10][10];
        for ( int rellenarArray = 0; rellenarArray < array.length; rellenarArray++ ) {
            for ( int continuarRellenando = 0; continuarRellenando < array[rellenarArray].length; continuarRellenando++ ) {
                array[rellenarArray][continuarRellenando] = aleatorio.nextInt(10) + 1;
            }
        }
        
        //Buscar un numero y saber cuantas veces se repite.
        System.out.print("\nQue número deseas buscar: ");
        numero = leer.nextInt();
        int contadorNumero = 0;
        
        for ( int rellenarArray = 0; rellenarArray < array.length; rellenarArray++ ) {
            for ( int continuarRellenando = 0; continuarRellenando < array[rellenarArray].length; continuarRellenando++ ) {
                if ( array[rellenarArray][continuarRellenando] == numero ) {
                    contadorNumero++;
                }
            }
        }
        
        System.out.print("\nEl número "+numero+" se repite "+contadorNumero+" veces.\n");
        
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
