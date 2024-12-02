/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaej7;
import java.util.Scanner;
import java.util.Random;
public class TAREAEJ7 {

    public static void main(String[] args) {
  
        Scanner sc =new Scanner(System.in);
        Random r = new Random();
        
        //VARIABLES
        System.out.println("Ingresa la cantidad de filas");
        int filas = sc.nextInt();
        System.out.println("Ingresa la cantidad de columnas");
        int columnas = sc.nextInt();
        
        int arr[][] = new int[filas][columnas];
        int mayor = 0;
        int posicionFilas = 0;
        int posicionColumnas = 0;
        
        //CICLO
        System.out.println("Arreglo: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + " ");
                
                if(mayor < arr[i][j]){
                    mayor=arr[i][j];
                    posicionFilas = i;
                    posicionColumnas = j;
                     
                }
                
            }
                System.out.println("");
        }
            
            
            System.out.println("La posicion mayor del arreglo es: " + mayor);
            System.out.println("En la fila: " + posicionFilas);
            System.out.println("En la columna: " + posicionColumnas);
            
        }
      
    }

