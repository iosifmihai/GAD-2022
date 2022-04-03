package Lab1.ch2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduceti numarul: ");
        Scanner scan = new Scanner(System.in);
        int i;
        i = scan.nextInt();
        scan.close();

        compute.com(i);
        System.out.println(" ");
        compute.com2(i);
    }

}
