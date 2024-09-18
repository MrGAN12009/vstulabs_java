package z3;

public class Nasled2 extends nasled1{
    String style;

    double area() {
        return getWidth()*getHeight()/2;
    }
    void show2(){
        System.out.println("Треугольник - " + style);
    }
}
