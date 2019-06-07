import java.util.Random;
public class HT5_4 {
    public static void main( String[] args ) {
        int count = 0;
        Random rd = new Random( );
        int[] arr = new int[ 10 ];
        for ( int i = 0; i < arr.length; i++ ) {
            arr[ i ] = rd.nextInt(6 );
            System.out.print( arr[ i ]+"  " );
        }
        System.out.println("\n" );
        for ( int j = 0;j<arr.length;j++ ){
            if( arr[j] % 2 ==0 ) {
                count++;
                System.out.print(" "+arr[j]+" " );
            }
        }
        System.out.println("\n" );
        System.out.println(count);
        }
    }

