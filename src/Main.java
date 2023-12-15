import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the color :");
        String filled = scanner.nextLine();
        System.out.println("Nhập side1 :");
        double side1 = scanner.nextDouble();
        System.out.println("Nhập side2 :");
        double side2 = scanner.nextDouble();
        System.out.println("Nhập side3 :");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(filled, side1, side2, side3);
        System.out.println(triangle);

    }
}