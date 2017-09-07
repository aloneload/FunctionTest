import java.util.stream.Stream;

/*v筛选十以内的偶数并计算平方和*/
public class FilterMapreduceTest {

//java8 以前
    private static int sumEven() {
        int result = 0;
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                result += i * i;
            }
        }
        return result;
    }
    //要想不这么死，就得换个活法 --《绣春刀2》
    //java8
    private static  int newSumEven(){
        return Stream.iterate(1, i -> i + 1).limit(10)//无限流，惰性求值才有可能产生无限流
              //  .parallel()      //1
                .filter(i -> i % 2 == 0) //filter里面是一个谓词高阶函数，返回满足条件的序列
                .map(i -> i * i).peek(System.out::println) //map里面是一个高阶函数，每个元素做出映射
                .reduce(0, (a, b) -> a + b); //第二个参数是两个参数的高阶函数，归约求和
    }
    //上面两个方法所占代码行数相差无几，但是当业务逻辑比如条件类似sql里where复杂查询时，newSumEven就会体现出代码优势，由于基于流的操作，同时性能也会提高
    public static void main(String[] args) {
        System.out.println("结果：" + newSumEven());
        System.out.println("传统结果：" + sumEven());
    }
}
