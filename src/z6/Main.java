package z6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        while ( true ) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите стороны треугольника.");
            String text = scanner.nextLine();
            String[] words = text.split(" ");
            double[] params = new double[words.length];
            if ( words[0].equals("")){
                System.out.println("Такого треугольника не существует!");
                continue;
            }
            for (int i = 0; i < Math.min(words.length, 3); i++){
                params[i] = Double.valueOf(words[i]);
            }
            Nasled2 tr;
            switch (params.length){
                case 0:
                    tr = new Nasled2();
                    break;
                case 1:
                    tr = new Nasled2(params[0]);
                    break;
                case 2:
                    tr = new Nasled2(params[0], params[1]);
                    break;
                case 3:
                    tr = new Nasled2(params[0], params[1], params[2]);
                    break;

                default:
                    tr = new Nasled2(params[0], params[1], params[2]);
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
}
