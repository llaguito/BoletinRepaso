/*
5) Fai un programa que lea unha frase e separe as palabras e as meta nun array de cadeas, despois pida por pantalla unha palabra e diga si esta ou non.
 */
package boletin.repaso;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        StringTokenizer token;
        String[] palabras;
        String frase;
        String palabra;
        int contadorTokens = 0;
        int contadorBusqueda = 0;
        
        //Pedimos frase para construir array.
        System.out.print("\nIntroduzca la frase: ");
        frase = leer.nextLine();
        
        //Construimos array
        token = new StringTokenizer(frase);
        palabras = new String[token.countTokens()];
        
        while (token.hasMoreTokens()) {
            palabras [contadorTokens] = token.nextToken();
            contadorTokens++;
        }
        
        
        //Dato a buscar
        System.out.print("Palabra que quiere buscar: ");
        palabra = leer.next();
        
        //Busqueda
        for ( int contador = 0; contador < palabras.length; contador++ ) {
            if (palabra.equalsIgnoreCase(palabras[contador])) {
                contadorBusqueda++;
            }
        }
        
        if ( contadorBusqueda > 0 ) {
            System.out.print("\nLa palabra aparece en el Array.");
        }
        
        System.out.print("\n"+Arrays.toString(palabras));
    }
    
}
