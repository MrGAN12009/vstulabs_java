package z5;

public class nasled1 {
    private double width;
    private double height;

    nasled1(double w, double h){
        width = w;
        height = h;
    }

    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w) {width = w;}
    void setHeight(double h) {height = h;}

    void show1(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
