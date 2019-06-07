import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
public class HT5_9 {
        public static void main ( String[]args){
            ArrayList < Integer  > cifry = new ArrayList <Integer>( );
                Random r = new Random();
                for (int i = 1; i <= 100; i++) {
                    cifry.add(r.nextInt(100));
            }
            System.out.println(cifry + "\n" );
        }
}




