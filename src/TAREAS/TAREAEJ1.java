/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaej1;
import java.util.Scanner;
public class TAREAEJ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        int a =0;
        int d =0;
        
        int suma =0;
        
        for(int i = 0; i<10 ; i++){
            System.out.println("Ingresa la calificacion: ");
            arr[i] = sc.nextInt(); 
            suma+=arr[i];
    }
        double promedio = (double) suma / arr.length;
        System.out.println("El promedio de las calificaciones es: " + promedio); 
        
        for(int i = 0; i<10; i++){
            if(arr[i] > promedio){
                a++;
            }else if(arr[i] < promedio){
                d++;
            }
        }
        
        System.out.println("El numero de alumnos que estan por encima del promedio: " + a);
        System.out.println("El numero de alumnos que estan por debajo del promedio: " + d);
        
        
        
        
        
        
        
      
       
      
        
        
        
        
        
    }
}
