package lv.rvt;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();
        
        ArrayList<Integer> skaitli = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < 10; i++){
            int randomvalue = random.nextInt(10);
            skaitli.add(randomvalue);
            sum = sum + randomvalue;
        }
        System.out.println(skaitli);

        int maz = skaitli.get(0);
        int liel = skaitli.get(0);

        for (int sk = 0; sk < 10; sk++){
            if (skaitli.get(sk) < maz){
                maz = skaitli.get(sk);
            }
        }
        System.out.println(maz);

        for (int sk = 0; sk < 10; sk++){
            if (skaitli.get(sk) > liel){
                liel = skaitli.get(sk);
            }
        }
        System.out.println(liel);

        double avg = 1.0 * sum / 10;
        System.out.println(avg);

        scanner.close();
    }
}