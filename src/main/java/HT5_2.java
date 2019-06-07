import java.util.ArrayList;
public class HT5_2 {
    public static void main( String[] args ) {
        Nosok.Kolir myVar = Nosok.Kolir.green;
        Nosok.Kolir myVar2 = Nosok.Kolir.red;
        System.out.println(myVar+ " "+ myVar2 );
    }
    public static class Nosok {
        enum Kolir {
            green,
            red,
            blue
        }
    }

}