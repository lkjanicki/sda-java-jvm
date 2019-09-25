import java.util.Scanner;

/**
 * Application ask user for a string of characters. Next it transform the input given by the user in following fashion:
 * <ol>
 *     <li>capitalize all first letters in the text ({@link WordUtilsModification}),</li>
 *     <li>reverses the order of all letters in the text ({@link StringUtilsModification}).</li>
 * </ol>
 *
 * Finally it prints the text after both transformations to the user.
 *
 * @author lkjanicki
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

