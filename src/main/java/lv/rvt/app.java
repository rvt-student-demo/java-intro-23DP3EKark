package lv.rvt;
import java.util.Scanner;

public class app
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Give the first number:");
        // int ievade1 = Integer.valueOf(scanner.nextLine());

        // System.out.println("Give the first number:");
        // int ievade2 = Integer.valueOf(scanner.nextLine());

        // System.out.println(ievade1 + " + " + ievade2 + " = " + (ievade1 + ievade2));
        // System.out.println(ievade1 + " - " + ievade2 + " = " + (ievade1 - ievade2));
        // System.out.println(ievade1 + " * " + ievade2 + " = " + (ievade1 * ievade2));
        // System.out.println(ievade1 + " / " + ievade2 + " = " + (1.0 * ievade1 / ievade2));
        
        // System.out.println("Give speed: ");
        // int ievade1 = Integer.valueOf(scanner.nextLine());

        // if (ievade1>120) {
        //     System.out.println("Speeding ticket!");
        // }

            System.out.println("Give points [0-100]: ");
            int ievade1 = Integer.valueOf(scanner.nextLine());

            if (ievade1<0){
                System.out.println("impossible!");
            }

            else if (ievade1 > 0 && ievade1<50){
                System.out.println("failed");
            }

            else if (ievade1>49 && ievade1<60){
                System.out.println("1");
            }

            else if (ievade1>59 && ievade1<70){
                System.out.println("2");
            }

            else if (ievade1>69 && ievade1<80){
                System.out.println("3");
            }

            else if (ievade1>79 && ievade1<90){
                System.out.println("4");
            }

            else if (ievade1>89 && ievade1<=100){
                System.out.println("5");
            }

            else{
                System.out.println("incredible!");
            }
        
    }

}
