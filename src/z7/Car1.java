package z7;

public class Car1 {
    private int pass;
    private int obem;
    private int rasxod;

    Car1(int p, int o, int r){
        pass = p;
        obem = o;
        rasxod = r;
    }

    int getPass(){return pass;}
    int getObem(){return obem;}
    int getRasxod(){return rasxod;}
    void setPass(int p){pass = p;}
    void setObem(int o){obem = o;}
    void setRasxod(int r){rasxod = r;}



    int range(){
        return rasxod*obem;
    }

    double rasxod1(int km){
        return (double) (km*rasxod)/100;
    }
}
