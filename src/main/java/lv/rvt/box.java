package lv.rvt;

public class box {
    public double width;
    public double height;
    public double lenght;

    public double lenght() {
        return this.lenght;
    }

    public double height() {
        return this.height;
    }

    public double width() {
        return this.width;
    }

    public Box(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    // public Box(double side) {
    //     this(side, side, side);
    // }

    double topArea() {
        return this.width * this.lenght;
    }

    double faceArea() {
        return this.lenght * this.height;
    }

    double sideArea() {
        return this.width * this.height;
    }

    double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;              
    }

    // public box(oldBox){
        
    // }
}
