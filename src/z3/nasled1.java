package z3;

public class nasled1 {
    private double width;
    private double height;
    //ошибка была исправлена объявление геттеров и сеттеров
    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w) {width = w;}
    void setHeight(double h) {height = h;}

    void show1(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
