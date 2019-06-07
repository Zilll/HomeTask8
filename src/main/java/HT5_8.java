import java.util.HashMap;
public class HT5_8 {
        public static void main ( String[]args){
            HashMap <String, String> eda = new HashMap< String, String >(  );
            eda.put( "watermelon", "berry" );
            eda.put( "banana", "fruit" );
            eda.put( "cherry", "berry" );
            eda.put( "pineapple", "fruit" );
            eda.put( "melon", "vegetable" );
            eda.put( "cranberry", "berry" );
            eda.put( "apple", "fruit" );
            eda.put( "iris", "flower" );
            eda.put( "potato", "vegetable" );
            eda.put( "carrot", "vegetable" );
            for (String i : eda.keySet()) {
                System.out.println( i + ": "+eda.get(i));
            }
        }
    }



