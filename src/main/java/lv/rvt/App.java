package lv.rvt;
// import java.util.Random;
// import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        
        while (true) {
            int ievade = Integer.valueOf(scanner.nextLine());
            
            if (ievade == -1) {
                break;
            }
            
            statistics.addNumber(ievade);
        }
        
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}