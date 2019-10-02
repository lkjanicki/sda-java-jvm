import java.util.Scanner;

/**
 *  Aplikacja pobiera od użytkownika teskt i następnie dokonuje na nim dwóch ({@link StringUtilsModification}, {@link WordUtilsModification}) modyfikacji.
 *
 * @author Lukasz Janicki
 * @version 1.0.0
 */
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

