import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdueix un numero:");
        int num = input.nextInt();
        par(num);
    }

    public static void par(int num) {
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es parell");
        } else {
            System.out.println("El numero " + num + " es senar");
        }
    }
}