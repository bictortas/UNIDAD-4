import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa los grados celsius");
        int celsiusUno = sc.nextInt();
        System.out.println("Ingresa los grados celsius");
        int celsiusDos = sc.nextInt();
        System.out.println("Ingresa los grados celsius");
        int celsiusTres = sc.nextInt();

        System.out.println("Conversion Uno: " + celsiusAFarenheit(celsiusUno));
        System.out.println("Conversion Dos: " + celsiusAFarenheit(celsiusDos));
        System.out.println("Conversion Tres: " + celsiusAFarenheit(celsiusTres));

    }
    public static double celsiusAFarenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
}