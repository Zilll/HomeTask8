
//1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0 throw your own exception
public class HT6_1 {
    public static void main( String[] args ) throws ImageMismatchException {
        int q = 0;
        if ( q > 0 ) {
            System.out.println("q>0" );

        } else if (q < 0){
            System.out.println( "q<0" );
        }
     else if (q == 0){
            throw new ImageMismatchException( " q=0" );
    }
    }
    public static class ImageMismatchException extends Exception {
        ImageMismatchException( String s ) {
            super( s );
        }
    }
}
