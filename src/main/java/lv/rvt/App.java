package lv.rvt;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("no");
        int no = Integer.valueOf(scanner.nextLine());
        System.out.println("lidz");
        int lidz = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(no, lidz);

    }
    
    public static void divisibleByThreeInRange(int no, int lidz) {
        for (int skaitlis = no; skaitlis <= lidz; skaitlis++){
            if (skaitlis % 3 == 0) {
                System.out.println(skaitlis);
            }
        }
    }
}