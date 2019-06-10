//"3. Finish the program to handle all the possible exceptions:
//public class Main {
//
//    public static void main(String[] args) {
//        int a = args.length;
//        System.out.println(a);
//
//        int b = 10 / a;
//        int[] c = {1};
//        System.out.println(c[1]);
//
//    }
//
//}
//
//    Print the cause of the exception to the console."
public class HT6_3 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println(a);

            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        }
        catch ( Exception e ) {
            e.printStackTrace();
            System.out.println("Sho na noll delishh?  ai jai jai" );
        }


    }

}

