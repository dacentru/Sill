package om.okna.sill;

@SuppressWarnings("serial")
public class InvalidParameterException extends RuntimeException {
	
	public InvalidParameterException() {
		super("Array length mismatch error. Recheck the parametrs");
	}

}