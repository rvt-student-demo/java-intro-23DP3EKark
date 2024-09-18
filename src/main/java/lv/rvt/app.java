package lv.rvt;
import java.util.Scanner;

public class app
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int ievade1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the first number:");
        int ievade2 = Integer.valueOf(scanner.nextLine());

        System.out.println(ievade1 + " + " + ievade2 + " = " + (ievade1 + ievade2));
        System.out.println(ievade1 + " - " + ievade2 + " = " + (ievade1 - ievade2));
        System.out.println(ievade1 + " * " + ievade2 + " = " + (ievade1 * ievade2));
        System.out.println(ievade1 + " / " + ievade2 + " = " + (1.0 * ievade1 / ievade2));
    }

}
