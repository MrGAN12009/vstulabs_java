package z7;

public class Truck extends Car1{
    private int cargocap;
    Truck(int p, int o, int r, int c){
        super(p, o, r);
        cargocap = c;
    }

    int getCargo(){return cargocap;}
    void setCargocap(int c){cargocap = c;}
}
