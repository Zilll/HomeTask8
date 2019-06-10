import java.util.Scanner;
//"6. Write a program that will enter numbers from the keyboard.
//The code for reading numbers from the keyboard must be in the readData method.
//The code inside the readData is wrapped in a try..catch.
//If the user entered some text, instead of entering a number, the method should catch the exception and display all previously entered numbers as a result.
//Numbers output from a new line preserving the order of input."
public class HT6_6 {
    public static void main(String[] args) throws Exception{
            readData();
    }

    public static void readData() {
            try {
                int in = new Scanner( System.in).nextInt( );
                Integer.parseInt( String.valueOf( in ) );
                System.out.println("ok" );
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("no no" );
            }
    }

    }


