import org.apache.commons.lang3.text.WordUtils;

public class WordUtilsModification {

    /**
     *  Metoda sprawia, że wszystkie słowa w danym tekście zaczynają się od wielkiej litery.
     *
     *
     * @param value tekst, który ma zostać zmieniony
     * @return tekst, którego każde słowo zaczyna się od wielkiej litery
     */
    public String modify( String value ) {
        return WordUtils.capitalizeFully( value );
    }

}
