import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int arr[][] = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(10);
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Media del arreglo: " + media(arr));



    }
    public static double media (int arr[][]){
        int suma = 0;
        int media = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                suma += arr[i][j];
                media = suma / 16;
            }
        }

        return media;
    }

}