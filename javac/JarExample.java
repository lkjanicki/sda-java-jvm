import java.util.Scanner;

public class JarExample {

    public static void main( String[] args ) {

        Scanner in = new Scanner( System.in );
        System.out.print( "Wpisz wartosc: " );
        String valueFromUser = in.nextLine();

        String changedValue = swapCase( valueFromUser );

        System.out.println( "Wartosc zmieniona: " + changedValue );

    }

    private static String swapCase( String initialValue ) {
        return new StringUtilsModification().modify( new WordUtilsModification().modify( initialValue ) );
    }

}

