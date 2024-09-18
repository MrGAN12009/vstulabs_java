package z1;

public class nasled4 extends nasled1{
    double area(){
        return width*height;
    }

    void show2(){
        if (width == height){
            System.out.println("Введённый четырёхугольник - квардрат. Все стороны равны - " + width);
        } else {
            System.out.println("Четырёхугольник - не квадрат.");
        }
    }
}
