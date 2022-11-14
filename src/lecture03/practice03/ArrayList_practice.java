package lecture03.practice03;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_practice {
    public static void main(String[] args) {

        //ArrayListクラスをインスタンス化
        ArrayList<String> list = new ArrayList<>();

        //要素を末尾に追加
        list.add("araki");
        list.add("kai");
        list.add("b2200170");

        //index番号の要素を返す
        String name = list.get(0);
        System.out.println(name);

        //要素数を返す
        System.out.println(list.size());

        //指定の要素を削除
        list.remove(0);
        System.out.println(list.get(0));
    }
}
