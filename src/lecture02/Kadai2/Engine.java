package lecture02.Kadai2;

public class Engine {
    int rpm;
    Engine(int rpm){
        this.rpm = rpm;
    }

    void strat(){
        System.out.println("rpm = "+rpm+" でエンジンを始動させました。");
    }
}
