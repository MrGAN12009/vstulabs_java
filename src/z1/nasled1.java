package z1;

//класс родитель
public class nasled1 {
    double width;
    double height;

    void show1(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
//Задание 2 - допущена ошибка - попытка получение privat переменных из класса наследника.
//Задание 3 - были объявлены сеттеры и геттеры для получения и изменения privat переменных.