/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaej9;
import java.util.Random;
import java.util.Scanner;
public class TAREAEJ9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        //VARIABLES
        System.out.println("Ingresa la longitud de la matriz nxn: ");
        int n = sc.nextInt();
        
        
        int arr[][] = new int[n][n];
        int suma = 0;
        int sumaDos =0;
        
        //CICLO :D
        System.out.println("Arreglo: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                int c= i+j;
                int cDos = n-1;
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + " ");
                
                if(i == j){
                suma+= arr[i][j];
                }
                if(c == cDos){
                sumaDos+= arr[i][j];
                }
            }
            System.out.println("");
        }
        
        System.out.println("Suma de la diagonal principal: " + suma);
        System.out.println("Suma de la diagonal secundaria: " + sumaDos);
        
        
        
        
        
        
    }
}
