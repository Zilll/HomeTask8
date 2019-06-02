import java.util.ArrayList;

public class Lesson1HW {
    public static void main(String[] args) {
        //Task1
        String name = "Andrii";
        String Surename = "Ustiantsev";
        System.out.println(name+" "+Surename);
        System.out.println(name+" "+Surename);
        System.out.println(name+" "+Surename);
        System.out.println(name+" "+Surename);
        System.out.println(name+" "+Surename);
        //Task2
        byte Byte = -8;
        short Short = 67;
        int Integer = 2147483647;
        long Long = 44;
        char Character = 67;
        float Float = 3.24f;
        double Double = 3.141593;
        boolean Day = true;
        String hmm = "not dataType?";
        System.out.println(Byte+" "+Short+" "+Integer+" "+Long+" "+Character+" "+Float+" "+Double+" "+Day+ "" +hmm);
        //Task3
        int Width = 3;
        int Height = 4;
        int Square;
        Square = Width*Height;
        System.out.println("Square is " + Square);
        //Task4
        int a = 5;
        double b = 10;
        double result = a/b;
        System.out.println("result is:" +result);
        //Task5
//        C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2018.2.7/plugins/maven/lib/maven3
        int a2 = 1;
        int b2 = 3;
        int c2 = 9;
        int d2 = 27;
        int result2 = -a2+b2+d2-c2;
        System.out.println(result2);
        //Task6
        //String s = "Java";
        //System.out.println("Happy");
//      System.out.println("Java Learning");
//      System.out.println("programming");
        System.out.print("Happy Java");
//      System.out.println("weekend");
//      System.out.println(s);
//      System.out.print("Python");
        System.out.print(" ");
        System.out.println("Learning");
        //Task7
        int aa = 10;
        int bb = 15;
        double cc = bb + 38;
        //Int d = a + 12;
        //double e = 12.3;
        String ss = "s" + aa;
        String s1 = aa + "b";
        //String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(cc + s4 + ss);
        //Task8
            //First solution
        int text[]={72,101,108,108,111,127,119,111,114,108,100,};
        printList(transformIntToChar(text));
            //Second Solution
        //        int H= 72;
        //        int e =101;
        //        int l=108;
        //        int o =111;
        //        int space =127;
        //        int w=119;
        //        int r=114;
        //        int d=100;
        //        printList(transformIntToChar(H,e,l,o,space,w,o,r,l,d));
    }
    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }
    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }
}


