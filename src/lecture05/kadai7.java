package lecture05;

import java.util.ArrayList;
import java.util.List;

public class kadai7 {
    public static void main(String[] args) {
        List<Insect> InsectList = new ArrayList<>();

        InsectList.add(new Insect());
        InsectList.add(new Butterfly());
        InsectList.add(new Locust());
        InsectList.add(new SwallowtailButterfly());

        for (Insect insect:InsectList){
            insect.move();
        }
    }
}
