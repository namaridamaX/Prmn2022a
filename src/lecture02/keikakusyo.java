package lecture02;

public class keikakusyo {
    String sauce;
    String kome;

    keikakusyo(String sauce,String kome){
        this.sauce = sauce;
        this.kome = kome;
    }

    void make(){
        if(sauce.equals("ケチャップ")) {
            System.out.println("オムライス完成");
        }else{
            System.out.println("オムハヤシ完成");
        }
    }
}
