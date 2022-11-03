package lecture02;

public class cooking {
    public static void main(String[] args) {


        keikakusyo omuraisu_recipe = new keikakusyo("ケチャップ","あきたこまち");
        keikakusyo omuhayasi_recipe = new keikakusyo("ハヤシ","ななつぼし");

        omuraisu_recipe.make();
        omuhayasi_recipe.make();

    }
}
