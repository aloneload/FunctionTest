package studyJava8;

import java.util.Comparator;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class Lambda {
    public static void main(String[] args) {
        IntFunction<Integer> square = x -> x * x;
        Supplier<Integer> out = sum_square(square, 3, 4);
        System.out.println(out.get());//输出25

    }

    private static Supplier<Integer> sum_square(IntFunction square, int a, int b) {
      return () -> {
          return (int) square.apply(a) + (int) square.apply(b);
      };
    }
}
