/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaej4;

public class TAREAEJ4 {

    public static void main(String[] args) {
        
        //REVERSA
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        
        //ARREGLO ORIGINAL
        System.out.print("Arreglo original: ");
        for(int i = 0; i<10; i++){
            System.out.print(arr[i]+ ",");
        }
        System.out.println("\n");
        
        //ARREGLO INVERTIDO
        System.out.print("Arreglo invertido: ");
        for(int i = arr.length-1; i >= 0 ; i--){
            System.out.print(arr[i]+ ",");
        } 
      
        
        
        
        
        
        
        
        
    }
}
