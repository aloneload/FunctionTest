package studyJava8;

//阶乘计算
public class Factorial {
    public static void main(String[] args) {
        System.out.println("迭代：" + factorialIterative(10));
        System.out.println("递归：" + factorialRecursive(10));
        System.out.println("尾递归" + factorialHelper(1, 10));
    }

    //迭代式
    static int factorialIterative(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r *= i;
        }
        return r;
    }

    //递归式
    static long factorialRecursive(long n) {
        return n == 1 ? 1 : n * factorialRecursive(n - 1);
    }

    //尾递归
    static long factorialHelper(long acc, long n) {
        return n == 1 ? acc : factorialHelper(acc * n, n - 1);
    }
}
