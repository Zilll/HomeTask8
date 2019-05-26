import java.util.ArrayList;
public class MainClass {
    public static void main(String[] args) {
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
