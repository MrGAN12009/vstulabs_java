package z6;

public class Nasled2 extends nasled1{
    private String style;


    Nasled2(){
        super ();
        style = "null";
    }

    Nasled2(double x){
        super(x);
        style = "Равносторонний";
    }

    Nasled2(double w, double h){
        super(w, h);
        style = "Равнобедренный";
        if ( (2 * w*w) == h*h ){
            setThird(w);
            style = style + "и прямоугольный";
        } else if ( (2 * h*h) == w*w ) {
            setThird(h);
            style = style + "и прямоугольный";
        } else {
            setThird(w);
        }
    }


    Nasled2(double w, double h, double t){
        super(w, h, t);
        if (( (Math.pow(t, 2) + Math.pow(h, 2)) == Math.pow(w, 2) ) || ( (Math.pow(t, 2) + Math.pow(w, 2)) == Math.pow(h, 2) ) || ( (Math.pow(h, 2) + Math.pow(w, 2)) == Math.pow(t, 2) )){
            style = "Прямоугольный";
        }else{
            style = "Разностронний";
        }
    }



    double area(){
        double p = (getHeight() + getWidth() + getThird())/2;
        return Math.sqrt( p * (p - getHeight()) * (p - getWidth()) * (p - getThird()) );
    }


    double perimetr(){
        return getWidth() + getHeight() + getThird();
    }


    double midLane() {
        return getWidth()/2;
    }


    double gipoten(){
        return Math.sqrt( Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2) );
    }


    void show2() {
        System.out.println("Треугольник - " + style);
    }

}
