package exceptions;



public class UserIdOrPasswordDoesNotMatchException extends Exception{
	String s;
	public UserIdOrPasswordDoesNotMatchException(String s) {
		this.s=s;
	}
	
	public String toString() {
		return s;
	}
}
