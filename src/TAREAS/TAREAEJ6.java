/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaej6;
import java.util.Random;
public class TAREAEJ6 {

    public static void main(String[] args) {
        
        int[][] arr = new int[4][4];
        Random r = new Random();
        
        
        
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j <arr.length; j++){
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + " ");
                
            }
            System.out.println(" ");
        }
        
        for(int i = 0; i< arr.length; i++){
            int sumafil =0;
            for(int j = 0; j <arr.length; j++){
            sumafil+=arr[i][j];   
            } 
            System.out.println("La suma de la fila" + (i+1) +" es: " + sumafil);
        }
            
        for(int j = 0; j< arr.length; j++){
            int sumacol =0;
            for(int i = 0; i <arr.length; i++){
            sumacol+=arr[i][j];
            }
            System.out.println("La suma de la columna" + (j+1) +" es: " + sumacol);
        }
        
        
        
        
        
        
        
        
    }
}
