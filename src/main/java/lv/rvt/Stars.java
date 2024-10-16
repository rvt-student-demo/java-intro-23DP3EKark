package lv.rvt;

public class Stars {
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStars(int size) {
        for (int zvaigznes = 0; zvaigznes < size; zvaigznes++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int size) {
        for (int spaces = 1; spaces > size; spaces++){
            System.out.print("");
        }
    }

    public static void reverseTriangle(int size){
            for (int i = 1; i <= size; i++){
                printSpaces(size-1);
                printStars(i);
            }
    }
    
}