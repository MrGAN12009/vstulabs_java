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
        if (w == h){
            style = "Равнобедренный";
        } else {
            style = "Разносторонний";
        }
    }


    Nasled2(String s, double w, double h){
        super(w, h);
        style = s;
    }

    Nasled2(double w, double h, double t){
        super(w, h, t);
        if ((w == h) && (w == t) && (h == t)){
            style = "Равносторонний";
        } else if ( (w == h) || (w == t) || (h == t) ){
            style = "Равнобедренный";
        } else if (( (Math.pow(t, 2) + Math.pow(h, 2)) == Math.pow(w, 2) ) || ( (Math.pow(t, 2) + Math.pow(w, 2)) == Math.pow(h, 2) ) || ( (Math.pow(h, 2) + Math.pow(w, 2)) == Math.pow(t, 2) )){
            style = "Прямоугольный";
        }else{
            style = "Разностронний";
        }
    }



    double area(){
        return getWidth()*getHeight()/2;
    }


    double perimetr(){
        return getHeight() + getWidth() + getThird();
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
