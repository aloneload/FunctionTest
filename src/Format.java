import java.util.function.Function;

public class Format {
    public static void main(String[] args) {
        Function<Integer,Integer> square=x->x*x;
        Function<Integer,Integer> cube=x->3*x*x*x;
        Integer result1 = square.compose(cube).apply(2);//compose复合器
        Integer result2  = cube.compose(square).apply(2);
        Integer result3 = square.andThen(x -> 4* x).apply(5);//andThen

        System.out.println("先cube再square："+result1);//先cube再square：576
        System.out.println("先square再cube："+result2);//先square再cube：192
        System.out.println("先square再5x："+result3);//先square再5*x：192

    }

}

