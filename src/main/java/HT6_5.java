//"5. Throw a NullPointerException from the method iCanThrowException();
//Handle it in the main method.
//public class Main {
//
//    public static void main(String[] args) {
//        iCanThrowException();
//    }
//
//    public static void iCanThrowException() {
//
//    }
//
//}"
public class HT6_5 {
    public static void main(String[] args) {
        iCanThrowException();
    }

    public static void iCanThrowException() {
        throw new NullPointerException();

    }

}

