import org.apache.commons.lang3.StringUtils;

public class StringUtilsModification {

    /**
     * Reverses order of characters in the input string
     *
     * @param value a text that will be transformed
     * @return input text with letters in reversed order
     */
    public String modify( String value ) {
        return StringUtils.reverse( value );
    }

}


