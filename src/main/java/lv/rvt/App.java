package lv.rvt;
import java.util.*;

public class App{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        int size = Integer.valueOf(scanner.nextLine());

        Stars.christmasTree(size);
        
    }
}