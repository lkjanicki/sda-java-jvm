import org.apache.commons.lang3.text.WordUtils;

public class WordUtilsModification {

    public String modify( String value ) {
        return WordUtils.capitalizeFully( value );
    }

}
