/*
2)O mesmo que o anterior pero tera que decir cantas veces se repite en cada columna.
 */
package boletin.repaso;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int[] contador = new int [10];
        
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
                    contador[continuarRellenando]++;
                }
            }
        }
        System.out.print("\n"+Arrays.toString(contador));
        
        for ( int contadorColumnas = 0; contadorColumnas < contador.length; contadorColumnas++ ) {
            System.out.print("\nColumna "+(contadorColumnas+1)+": " + contador[contadorColumnas]);
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
    }
    
}
