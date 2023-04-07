/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Russlan
 */
public class Burbuja {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int arreglo[],nElementos,aux,i,j;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese "
                + "la cantidad de elementos del arreglo: "));
        
        arreglo = new int [nElementos];//Asignamos el número de elementos al arreglo
        
        for(i=0;i<nElementos;i++){
        System.out.print("Ingrese el elemento "+(i+1)+": ");
        arreglo [i] = entrada.nextInt();
        }
        //Método burbuja
        for(i=0;i<(nElementos-1);i++){
                    for(j=0;j<(nElementos-1);j++){
                        if (arreglo[j]>arreglo[j+1]){//Se evalúa si el número actual es > número siguiente
                        aux = arreglo[j];
                        arreglo [j] = arreglo[j+1];
                        arreglo[j+1] = aux;
                        
                        }
                    }
        }
        
        //Mostrando el arreglo ordenado de manera creciente
        
        System.out.println("\n Arreglo ordenado de manera creciente");
         for(i=0;i<(nElementos);i++){
             System.out.print(arreglo[i]+" - ");
         }
         
        //Mostrando el arreglo ordenado de manera decreciente
        
        System.out.println("\n Arreglo ordenado de manera decreciente");
         for(i=(nElementos-1);i>=0;i--){
             System.out.print(arreglo[i]+" - ");
         }
         
        }
        
        
    }

