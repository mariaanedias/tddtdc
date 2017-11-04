package tdd.tdc.domain;

public class MyException extends Exception {
	
	private static final long serialVersionUID = 6194040252649075858L;

	public MyException(String message) {
		super(message);
	}
	
	public MyException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
