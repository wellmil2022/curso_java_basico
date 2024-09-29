package section14_exceptions.reservation.model.exceptions;

public class DomainException extends Exception{
	// Excepton is serializable, then it need a version number
	private static final long serialVersionUID = 1L;

	public DomainException(String message) {
		super(message);
	}
	
	
}
