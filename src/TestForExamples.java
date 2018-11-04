import java.util.function.BiFunction;
import java.util.function.Function;

public class TestForExamples {


    public static  void myfunction(Function<Integer,Integer> a,int b) {
       System.out.println(a.apply(b));
    }

    public static  void main(String[] args) {

        Function<String,String> a = x -> "hello class";
        Function<Integer,Integer> b = x -> x*x;
        System.out.println(a.apply("Hello world"));
        myfunction(b,15);
        BiFunction<Integer,Integer,Integer> c = (x,y) ->{return x+y;};
        System.out.println(c.apply(5,10));

        Cat cat = new Cat();
        cat.eat();
        cat.speak();

        Dog dog  = new Dog();
        dog.eat();
        dog.speak();




    }
}
