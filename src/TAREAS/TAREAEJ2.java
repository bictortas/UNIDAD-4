/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaej2;
import java.util.Random;
public class TAREAEJ2 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        int[] arr = new int[15];
        int cont = 0;
        int contm = 0;
        
        System.out.println("Arreglo: ");
        for(int i = 0; i< arr.length ; i++){
        arr[i]= rand.nextInt(15);
        System.out.print( arr[i] + " ");
    }
        System.out.println("\n");
        
        for(int i = 0; i <arr.length; i++){
          if(cont < arr[i]){
              cont=arr[i];
          }else if(contm > arr[i]){
              contm=arr[i];
          }  
        }
   
        System.out.println("El numero mayor: " + cont);
        System.out.println("El numero menor: " + contm);
        
       
        
    }
}
