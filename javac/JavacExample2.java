import java.lang.StringBuilder;

public class JavacExample2 {
	
	public static void main(String args[]) {
		concatenateStrings();
	}
	
	private static void concatenateStrings() {
		
		String person = "Ala";
		String verb = " ma ";
		String noun = "kota";
		
		String concatenated = new StringBuilder( person ).append( verb ).append( noun ).toString();
		
		System.out.println( concatenated );
		
	}
	
}
