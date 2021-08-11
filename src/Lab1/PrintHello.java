package Lab1;

import java.util.Scanner;

public class PrintHello {

    public static void main(String[] args) {
        System.out.println("Введите имя");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);
        scan.close();
    }

}
