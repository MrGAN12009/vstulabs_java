package z1;

public class Main {
    public static void main(String[] args){

        Nasled2 tr1 = new Nasled2();
        Nasled2 tr2 = new Nasled2();
        nasledCircle tr4 = new nasledCircle();
        nasled4 tr3 = new nasled4();


        tr1.width = 4.0;
        tr1.height = 4.0;
        tr1.style = "Равнобедренный";

        tr2.width = 8.0;
        tr2.height = 12.0;
        tr2.style = "Прямоугольный";

        tr3.width = 8.0;
        tr3.height = 9.0;

        tr4.width = 5.0;


        System.out.println("Описание треульника №1: ");
        tr1.show1();
        tr1.show2();
        System.out.println("Площадь треугольника: " + tr1.area());


        System.out.println("Описание треульника №2: ");
        tr2.show1();
        tr2.show2();
        System.out.println("Площадь треугольника: " + tr2.area());


        System.out.println("Описание прямоугольника: ");
        tr3.show1();
        tr3.show2();
        System.out.println("Площадь прямоугольника: " + tr3.area());

        System.out.println("Описание круга: ");
        tr4.show2();
        System.out.println("Площадь круга: " + tr4.area());
    }







//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите текст:");
//        String text = scanner.nextLine();
//
//        String[] strArr = new String[100];
//        for(int i = 0; i < 100; i++){
//            strArr[i] = "";
//        }
//        int[] count = new int[100];
//        int i = 0;
//
//
//        for(char c : text.toCharArray()){
//            if (c == ' ') {
//                count[i] += 1;
//                strArr[i] += c;
//            }
//            if (c != '.'){
//                strArr[i] += c;
//            } else {
//                strArr[i] += c;
//                i++;
//            }
//        }
//
//        for(int j = 0; j < i; j++){
//            int k = 0;
//            for(int l = 0; l < i; l++){
//                if (count[k] < count[l]){
//                    k = l;
//                }
//            }
//            if (count[k] == 0){
//                return;
//            }
//            count[k] = 0;
//            System.out.print(strArr[k]);
//        }
//
//    }
}


