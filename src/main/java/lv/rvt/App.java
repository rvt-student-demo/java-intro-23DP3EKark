package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

        try {
            Thread.sleep(10);
        } 
        
        catch(Exception e) {

        }
}

    }
}