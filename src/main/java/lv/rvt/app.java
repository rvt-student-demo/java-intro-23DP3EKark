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

            // System.out.println("Give points [0-100]: ");
            // int ievade1 = Integer.valueOf(scanner.nextLine());

            // if (ievade1<0){
            //     System.out.println("impossible!");
            // }

            // else if (ievade1 > 0 && ievade1<50){
            //     System.out.println("failed");
            // }

            // else if (ievade1>49 && ievade1<60){
            //     System.out.println("1");
            // }

            // else if (ievade1>59 && ievade1<70){
            //     System.out.println("2");
            // }

            // else if (ievade1>69 && ievade1<80){
            //     System.out.println("3");
            // }

            // else if (ievade1>79 && ievade1<90){
            //     System.out.println("4");
            // }

            // else if (ievade1>89 && ievade1<=100){
            //     System.out.println("5");
            // }

            // else{
            //     System.out.println("incredible!");
            // }

            // System.out.println("Value of the gift?");

            // int nodoklis = Integer.valueOf(scanner.nextLine());

            // if (nodoklis < 5000) {
            //     System.out.println("No tax!");
            // }

            // else if (nodoklis >= 5000 && nodoklis < 25000) {
            //     System.out.println("Tax: " + (100 + (nodoklis-5000) * 0.08));
            // }

            // else if (nodoklis >= 25000 && nodoklis < 55000) {
            //     System.out.println("Tax: " + (1700 + (nodoklis-25000) * 0.1));
            // }

            // else if (nodoklis >= 55000 && nodoklis < 200000) {
            //     System.out.println("Tax: " + (4700 + (nodoklis-55000) * 0.12));
            // }

            // else if (nodoklis >= 200000 && nodoklis < 1000000) {
            //     System.out.println("Tax: " + (22100 + (nodoklis-200000) * 0.15));
            // }

            // else if (nodoklis >= 1000000) {
            //     System.out.println("Tax: " + (142100 + (nodoklis-1000000) * 0.17));
            // }

            // int summa = 0;
            // int daudzums = 0;


            // while (true) {
            //     System.out.println("Give a number: ");
            //      int ievade = Integer.valueOf(scanner.nextLine());

            //      int sum = 0;

            //     if (ievade == 0) {
            //         break;

            //     }
            //     else {
            //         daudzums += 1;
            //         summa = summa + ievade;
            //     }

            // }
            // System.out.println("Ammount of numbers: " + daudzums);
            // System.out.println("Sum of numbers: " + summa);


            // int skaitlis = Integer.valueOf(scanner.nextLine());

            //  for (int i = 0; i <= skaitlis; i++) {
            //     System.out.println(i);
            //  }

            int summa = 0;

            System.out.println("Last number? ");
            int ievade = Integer.valueOf(scanner.nextLine());

            for (int i = 0; i <= ievade; i++) {
                summa += i;
            }

            System.out.println("The sum is " + summa);
        }
}
