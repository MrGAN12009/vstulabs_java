package z4;

public class Nasled2 extends nasled1{
    private String style;

    public Nasled2(String s, double w, double h){
        setWidth(w);
        setHeight(h);
        style = s;
    }

    double area() {
        return getWidth()*getHeight()/2;
    }
    void show2(){
        System.out.println("Треугольник - " + style);
    }
}
