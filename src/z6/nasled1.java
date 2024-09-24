package z6;

public class nasled1 {
    private double width;
    private double height;
    private double third;

    nasled1(double[] arr){
        width = arr[0];
    }



    nasled1(){
        width = height = 0.0;
    }

    nasled1(double x){
        width = height = third = x;
    }

    nasled1(double w, double h){
        width = w;
        height = h;
    }

    nasled1(double w, double h, double t){
        width = w;
        height = h;
        third = t;
    }


    double getWidth() {return width;}
    double getHeight() {return height;}
    double getThird() {return third;}
    void setWidth(double w) {width = w;}
    void setHeight(double h) {height = h;}
    void setThird(double t) {third = t;}

    void show1(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }


}
