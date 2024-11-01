package lv.rvt;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        String garakais = "";

        while (true){
            String ievade = scanner.nextLine();
            if (ievade.isEmpty()){
                double average = 1.0 * sum / count;
                System.out.println("Longest name: " + garakais);
                System.out.println("Average of the birth years: " + average);
                break;
            }
            else{
                String[] parts = ievade.split(",");
                sum = sum + Integer.valueOf(parts[1]);
                count = count + 1;
                if (parts[0].length() > garakais.length()){
                    garakais = parts[0];
                }
            }
        }

        scanner.close();
    }
}