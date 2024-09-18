package z5;

public class Main {
    public static void main(String[] args){
        Nasled2 tr1 = new Nasled2("Равнобедренный", 4.0, 4.0);
        Nasled2 tr2 = new Nasled2("Прямоугольный", 8.0, 12.0);


        System.out.println("Описание треульника №1: ");
        tr1.show1();
        tr1.show2();
        System.out.println("Площадь треугольника: " + tr1.area());


        System.out.println("Описание треульника №2: ");
        tr2.show1();
        tr2.show2();
        System.out.println("Площадь треугольника: " + tr2.area());

    }
}
