import java.util.function.Function;

public class test1 {

    public static void main(String[] args) {
        int b [] = {10,290,29,9,22};
        Function<Integer,Integer> g = x ->b[x];
        for(int i = 0;i<b.length;i++) {
           System.out.println(g.apply(i));
        }

    }




    public static void applyArrays(int[]a , Function<Integer,Integer> f) {

    }
}
