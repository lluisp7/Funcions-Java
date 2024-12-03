import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce dos números");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int seleccio = input.nextInt();
        System.out.println("selecciona una opcion:1-suma, 2-resta, 3-producto, 4-division, 5-exponencial");
        switch (seleccio) {
            case 1:
                suma(num1, num2);
                break;
            case 2:
                resta(num1, num2);
                break;
            case 3:
                producto(num1, num2);
                break;
            case 4:
                division(num1, num2);
                break;
            case 5:
                exponencial(num1, num2);
                break;
        }
    }

    public static void suma(int num1, int num2) {
        System.out.println("Suma: " + (num1 + num2));
    }

    public static void resta(int num1, int num2) {
        System.out.println("Resta: " + (num1 - num2));
    }

    public static void producto(int num1, int num2) {
        System.out.println("Producto: " + (num1 * num2));
    }

    public static void division(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("División: " + (num1 / num2));
        }
    }

    public static void exponencial(int num1, int num2) {
        System.out.println("Exponencial: " + Math.pow(num1, num2));
    }
}