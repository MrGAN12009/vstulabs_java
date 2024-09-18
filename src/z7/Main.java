package z7;

public class Main {
    public static void main(String[] args){
        Car1 minivan = new Car1(7, 50, 8);
        Car1 sportcar = new Car1(2, 30, 15);
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        bus bus = new bus(14, 60, 80, 40);


        double litr;
        int dist = 500;

        litr = minivan.rasxod1(dist);
        System.out.println("Чтобы проехать " + dist + " километров, minivan необходимо " + litr + " литров топлива.");
        litr = sportcar.rasxod1(dist);
        System.out.println("Чтобы проехать " + dist + " километров, sportcar необходимо " + litr + " литров топлива.");
        litr = semi.rasxod1(dist);
        System.out.println("Чтобы проехать " + dist + " километров, semi необходимо " + litr + " литров топлива.");
        System.out.println("Semi может поднять " + semi.getCargo() + " килграмм.");


        litr = pickup.rasxod1(dist);
        System.out.println("Чтобы проехать " + dist + " километров, pickup необходимо " + litr + " литров топлива.");
        System.out.println("Semi может поднять " + pickup.getCargo() + " килграмм.");

        System.out.println("ПОедет ли автобус? - " + bus.rdyToStart());
        System.out.println("В данный момент в автобусе " + bus.getPass() + " пассажиров.");
        System.out.println("Максимм пассажиров - " + bus.getMaxPass());
    }
}
