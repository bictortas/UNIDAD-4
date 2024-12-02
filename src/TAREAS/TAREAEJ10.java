/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaej10;
import java.util.Scanner;
import java.util.Random;
public class TAREAEJ10 {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        Random r = new Random();
        
        //VARIABLES
        System.out.println("Ingresa la cantidad de filas");
        int filas = sc.nextInt();
        System.out.println("Ingresa la cantidad de columnas");
        int columnas = sc.nextInt();
        
        int arr[][] = new int[filas][columnas];

        //CICLO
        System.out.println("Arreglo original: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + " ");
  
                }
                System.out.println("");
            }
        
        System.out.println("Arreglo transpuesto: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                System.out.print(arr[j][i] + " ");
                }
                System.out.println("");
            }
                
        
        
        
        
        
        
        
        
        
        
        
    }
}
