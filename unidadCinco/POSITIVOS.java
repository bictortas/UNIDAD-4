import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int arr[][] = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(-10,10);
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Arreglo de solo numeros poitivos: ");
        positivos(arr);

    }
    public static void positivos(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > 0){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}