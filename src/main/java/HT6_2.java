//"2. Fix the method with try-catch to get the correct result of division:
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println(divideByZero());
//    }
//
//    public static int divideByZero() {
//        int a = 5;
//        int b = 0;
//        return a / b;
//    }
//}"
public class HT6_2 {
        public static void main(String[] args) throws ArithmeticException {
            try {

                divideByZero();
                System.out.println("It is not zero " + divideByZero());
            }
            catch ( ArithmeticException e)
            {
                System.out.println("ArithmeticException occured!");
            }

    }

    public static int divideByZero()throws ArithmeticException {
        int a = 5;
        int b = 1;
        int c = a/b;
        return c;

    }
}
