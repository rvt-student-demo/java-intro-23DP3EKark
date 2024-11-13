package lv.rvt;
// import java.util.Random;
// import java.util.ArrayList;
// import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
    }
}