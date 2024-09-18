package z6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны треугольника.");
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        double[] params = new double[words.length];
        int i = 0;
        System.out.println(words.length);
        for (String s: words){
            params[i] = Double.valueOf(s);
            i++;
        }

        switch (params.length){
            case 0:
                Nasled2 tr = new Nasled2();
                break;
            case 1:
                Nasled2 tr = new Nasled2(params[0]);
                break;
            case 2:
                Nasled2 tr = new Nasled2(params[0], params[1]);
                break;
            case 3:
                Nasled2 tr = new Nasled2(params[0], params[1], params[2]);
                break;

            default:
                Nasled2 tr = new Nasled2(params[0], params[1], params[2]);
                break;
        }











        System.out.println("Описание треульника №1: ");
        tr.show1();
        tr.show2();
        System.out.println("Периметр - " + tr.perimetr());
        System.out.println("Гипотенуза - " + tr.gipoten());
        System.out.println("средняя линия - " + tr.midLane());
        System.out.println("Площадь треугольника: " + tr.area());

    }
}
