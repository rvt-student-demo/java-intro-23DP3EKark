package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> saraksts = new ArrayList<>();
        
        while (true) {
            System.out.print("Ievadiet skaitli (-1, lai pabeigtu): ");
            int ievade = Integer.parseInt(scanner.nextLine()); // Parsing input to integer

            if (ievade == -1) {
                // User input to determine range
                System.out.print("From where? ");
                int start = Integer.parseInt(scanner.nextLine());

                System.out.print("To where? ");
                int end = Integer.parseInt(scanner.nextLine());

                // Check for valid indices
                if (start < 0 || end < 0 || start >= saraksts.size() || end >= saraksts.size() || start > end) {
                    System.out.println("Jūs ievadījāt nepareizu indeksu!!");
                } else {
                    for (int i = start; i <= end; i++) {
                        System.out.println(saraksts.get(i));
                    }
                }
                break; // Exit the loop after processing the range

            } else {
                saraksts.add(ievade); // Add input number to the list
            }
        }
        scanner.close();
    }
}