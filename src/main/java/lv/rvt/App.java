package lv.rvt;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        printRectangle(17, 3);

    }
    
    public static void printRectangle(int platums, int garums) {
        
        for (int garumsZv = 0; garumsZv < garums; garumsZv++) {
            for (int platumsZv = 0; platumsZv < platums; platumsZv++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}