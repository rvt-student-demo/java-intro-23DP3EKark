package lv.rvt;
// import java.util.Random;
// import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        
        int sumOdd = 0;
        int sumEven = 0;

        while (true) {
            int ievade = Integer.valueOf(scanner.nextLine());
            
            if (ievade == -1) {
                break;
            }
            
            statistics.addNumber(ievade);
            if (ievade % 2 == 0) {
                sumEven = sumEven + ievade;
            }

            else {
                sumOdd = sumOdd + ievade;
            }
        }
        
        // System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        // System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: "+ sumEven);
        System.out.println("Sum or odd numbers: "+ sumOdd);
    }
}