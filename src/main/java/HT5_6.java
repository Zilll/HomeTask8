import java.util.ArrayList;
public class HT5_6 {
        public static void main ( String[]args){
            ArrayList< String > sobaka = new ArrayList< String >( );
            sobaka.add( "staf" );
            sobaka.add( "haski" );
            sobaka.add( "doberman" );
            sobaka.add( "dogs" );
            sobaka.add( "stafs" );
            sobaka.add( "haskis" );
            sobaka.add( "dobermans" );
            sobaka.add( "dogs" );
            sobaka.add( "taksa" );
            sobaka.add( "enoD" );
            System.out.println( sobaka );
            for(String type : sobaka) {
                type.length();
                System.out.print(type.length() + " ");
            }
        }
    }



