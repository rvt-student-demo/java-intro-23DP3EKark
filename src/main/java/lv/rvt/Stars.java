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
        for (int spaces = 0; spaces < size; spaces++){
            System.out.print(" ");
        }
    }

    public static void reverseTriangle(int size){
            for (int x = 0; x <= size; x++){
                printSpaces(size-x);
                printStars(x);
            }
    }

    public static void printChristmasTreeStump(int size){
        for (int i = 0; i < 2; i++){
            for(int j = 0; j < 1; j++){
                printSpaces(size-1);
                System.out.print("***");
            }
        System.out.println("");
        }
    }
    
    public static void christmasTree(int size){
        for (int y = 0; y <= size-1; y++){
            printSpaces(size-y);
            printStars(y*2+1);
        }
        printChristmasTreeStump(size);
        
    }
}