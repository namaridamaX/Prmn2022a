package lecture03;

import java.util.ArrayList;

public class Kadai4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> arrayList = new ArrayList<>();

        arrayList.add(new Vegetable("にんじん",117));
        arrayList.add(new Vegetable("玉ねぎ",120));
        arrayList.add(new Vegetable("じゃがいも",154));

        for(int i=0;i<arrayList.size();i++){
            arrayList.get(i).print();
        }
    }
}
