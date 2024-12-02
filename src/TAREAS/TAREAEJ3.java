/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaej3;

public class TAREAEJ3 {

    public static void main(String[] args) {
        
        int a[] = {1,3,3,3,5,4,4,2};
        boolean[] flag = new boolean[a.length];
        
            for(int i = 0; i < a.length; i++){
                if(!flag[i]){
                 int c = 1;   
                 for(int j = i+1; j <a.length; j++){
                    if(a[i]== a[j]){
                       c++;
                       flag[j] = true;
                    }
                 }
                System.out.println("El numero " + a[i] + "se repite " + c + " veces");   
                }
                
            }
            
        
      
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
