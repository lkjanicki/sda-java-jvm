import org.apache.commons.lang3.StringUtils;

public class StringUtilsModification {

    /**
     *  Metoda zamienia kolejnośc liter w tekście.
     *
     *
     * @param value tekst, który ma zostać zmieniony
     * @return tekst o odwrotnej kolejności liter
     */
    public String modify( String value ) {
        return StringUtils.reverse( value );
    }

}


