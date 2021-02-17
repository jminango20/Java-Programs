package model.exceptions;

//public class DomainException extends Exception{ //tengo que usar throw
public class DomainException extends RuntimeException{  //Otra forma

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //Propio do Java para serializar
	
	public DomainException(String msg) {
		super(msg);
	}

	
	
}
