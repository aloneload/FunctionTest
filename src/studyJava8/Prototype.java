package studyJava8;

import java.util.*;

public class Prototype {
    public static void main(String[] args) {
        List<Integer> sources = Arrays.asList(1, 7, 5, 4, 6);
        System.out.println("函数式更新"+operate2(sources)+"源"+sources);
       System.out.println("破坏式操作结果："+operate(sources)+"源"+sources);
    }

    private static List<Integer> operate(List<Integer> sources) {
         Collections.sort(sources);
         return sources;
    }
    private static List<Integer> operate2(List<Integer> sources) {
        List<Integer> dest=new ArrayList<>();
        dest.addAll(sources);
        Collections.sort(dest);
        return dest;
    }
}
