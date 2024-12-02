/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaej8;

import java.util.Random;
import java.util.Scanner;

public class TAREAEJ8 {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        Random r = new Random();
        
        //Arreglo
        
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        //CICLO
        System.out.println("Arreglo: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("--Selecciona las dos filas que deseas intercambiar: --");
        System.out.println("Primera fila: ");
        int filaUno =sc.nextInt();
        System.out.println("Segunda fila: ");
        int filaDos =sc.nextInt();
        
        
        if(filaUno<0 || filaUno> arr.length || filaDos<0 || filaDos>arr.length){
            System.out.println("Ingresa valores dentro del rango: " + (arr.length -1));
        }else{
            
        int[] temporal = arr[filaUno];
        arr[filaUno] = arr[filaDos];
        arr[filaDos] = temporal;
        
        }
        
        System.out.println("Arreglo arreglado: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                System.out.print(arr[i][j] + " ");  
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
