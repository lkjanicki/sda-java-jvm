import org.apache.commons.lang3.text.WordUtils;

public class WordUtilsModification {

    /**
     * Capitalize all first letters in a string
     *
     * @param value string to be transformed
     * @return input string with all first letters capitalized
     */
    public String modify( String value ) {
        return WordUtils.capitalizeFully( value );
    }

}
