import org.apache.commons.lang3.text.WordUtils;
import java.util.Scanner;

public class CommonsExample {

    public static void main( String[] args ) {

        Scanner in = new Scanner( System.in );
        System.out.print( "Wpisz wartosc: " );
        String valueFromUser = in.nextLine();

        String changedValue = swapCase( valueFromUser );

        System.out.println( "Wartosc zmieniona: " + changedValue );

    }

    private static String swapCase( String initialValue ) {
        return WordUtils.swapCase( initialValue );
    }

}

