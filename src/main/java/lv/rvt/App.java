package lv.rvt;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        printSquare(4);

    }
    
    public static void printSquare(int size) {
        for (int kolonas = 0; kolonas < size; kolonas++) {
            for (int rindas = 0; rindas < size; rindas++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        
    }
}