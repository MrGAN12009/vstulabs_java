package z7;

public class bus extends Car1{
    private int maxPass;


    bus(int p, int o, int r, int m){
        super(p, o, r);
        maxPass = m;
    }

    int getMaxPass(){return maxPass;}
    void setMaxPass(int m) {maxPass = m;}

    boolean rdyToStart(){
        if (getPass() <= maxPass){
            return true;
        }
        return false;
    }
}
