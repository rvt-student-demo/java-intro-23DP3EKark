package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<Integer> pages = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();

        int count = 0;

        while(true) {
            System.out.print("Title: ");
            String title = Scanner.nextLine();

            titles.add(title);

            if (title.isEmpty()) {
                System.out.print("What information will be printed? ");
                String ievade = Scanner.nextLine();

                if (ievade.equals("everything")) {
                    for (int i = 0; i < count; i++) {
                        System.out.println(titles.get(i) + ", " + pages.get(i) + ", " + years.get(i));
                    }
                }

                else if (ievade.equals("name")) {
                    for (int i = 0; i < count; i++) {
                        System.out.println(titles.get(i));
                    }
                }

                break;
            }
            
            System.out.print("Pages: ");
            Integer pagecnt = Integer.valueOf(Scanner.nextLine());

            pages.add(pagecnt);

            System.out.print("Publication year: ");
            Integer year = Integer.valueOf(Scanner.nextLine());

            years.add(year);

            count++;

        }
        Scanner.close();
    }
}