/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.aaa_pgr.enumarados.array;

import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
////        int miArray[] = {1, 2, 3, 4, 5};
////
////        for (int i = 0; i <miArray.length; i++) {
////            System.out.println(miArray[i]);
////        }
////        for (int elemento : miArray) {
////            System.out.println(elemento);
////        }

        // declarar e inicializar array 2D
        int arr[][] = {{2, 7, 9}, {3, 6, 1, 5}};
        int indi=2, indj=3;
        
        // imprimir array 2D
        for (int i = 0; i < indi; i++) {
            for (int j = 0; j < indj; j++) {
                System.out.print(arr[i][j]+"-");
            }

            System.out.println();
        }
    }
    
    static void mediaNegativosPositivos(){
        Scanner miScanner = new Scanner(System.in);
        int i;
        int pos = 0, neg = 0; //contadores de los números positivos y negativos
        int[] numeros = new int[10]; //array que contendrá los números leídos por teclado
        double sumaPos = 0, sumaNeg = 0; //acumuladores para las sumas de positivos y negativos                   
        
        //lectura de datos y llenar el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=miScanner.nextInt();
        }

        //recorrer el array para sumar por separado los números positivos 
         // y los negativos 
        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0){ //sumar positivos
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ //sumar negativos
                sumaNeg += numeros[i];
                neg++;
            }
        }

        //Calcular y mostrar las medias
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);                
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
     
    }

}
