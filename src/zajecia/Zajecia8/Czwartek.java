package zajecia.Zajecia8;

/**
 * Created by RENT on 2017-02-09.
 */
public class Czwartek {
    public static void main(String[] args) {
//        System.out.println(factorial(-2));
//        System.out.println(factorial(7));
//        System.out.println(factorialRecursion(-2));
//        System.out.println(factorialRecursion(7));
//        System.out.println(fibonacciNumber(5));
        System.out.println(fibonacciNumberRec(0));
        System.out.println(fibonacciNumberRec(48));
    }

    /**
     * returns factorial from number
     * if wrong input (e.g. -5) then return -1
     */
    public static long factorial(int number) {
        long tmp = 1;
        for (int i = 1; i < number; i++) {
            tmp *= i;
        }
        return tmp;
    }

    public static long factorialRecursion(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 1) {
            return 1;
        }
        return number * factorialRecursion(number - 1);
    }

    public static int fibonacciNumberRec(int index) {
        if (index < 0){
            return -1;
        }
        if (index == 0){
            return 0;
        }
        if (index == 1){
            return 1;
        }
        return  fibonacciNumberRec(index - 2) + fibonacciNumberRec(index - 1);
    }

    public static int fibonacciNumber(int index) {
        int left = 0;
        int right = 1;
        int result = 0;

        for (int i = 0; i < index; i++) {
            result = left + right;
            left = right;
            right = result;

        }
        return result;
    }

}
