package lv.rvt;
import java.util.*;

public class App{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> saraksts = new ArrayList<>();

        int sum = 0;

        while (true){

            int ievade = Integer.valueOf(scanner.nextLine());

                if (ievade == 0){
                    System.out.println(sum);
                    break;
                }

                else{
                    saraksts.add(ievade);
                    sum = sum + ievade;
                }
        }
    }
}