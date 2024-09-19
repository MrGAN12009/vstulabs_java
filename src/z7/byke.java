package z7;

public class byke extends Car1{
    private final int maxPass = 2;

    byke(int p, int o, int r){
        super(p, o, r);
    }


    int getMaxPass() {return maxPass;}

    void rdy() {
        if (maxPass >= getPass()){
            System.out.println("Мотоцикл поедет с " + getPass() + " пассажирами.");
        } else {
            System.out.println("С " + getPass() + " пассажирами мотоцикл не поедет. Максимум - " + getMaxPass());
        }
    }
}
