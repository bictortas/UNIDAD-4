/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaej5;
import java.util.Scanner;
public class TAREAEJ5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //PALINDROMA
        System.out.println("Ingresa una frase o palabra: ");
        String frase = sc.nextLine();
        //VARIABLES
        char[] arr = frase.toCharArray();
        String original = "";
        String reversa = "";
        boolean palindroma = false;

        //CICLOS
        System.out.println("Frase original: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            original = String.valueOf(arr[i]);
        }
        System.out.println("\n");
        System.out.println("Frase alreves: ");
        for (int i = frase.length()-1; i >= 0 ; i--) {
            System.out.print(arr[i]);
            reversa = String.valueOf(arr[i]);
        }
        System.out.println("\n");
        //VERIFICACION
        if(original.equalsIgnoreCase(reversa)){
            palindroma = true;
            System.out.println("La frase es palindroma");
        }

        if(!palindroma){
            System.out.println("No Es palindroma");
        }
        
        
   
    }
  
}
