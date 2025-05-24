package exceptions;

public class RoomUnavailableException extends Exception{
	String s;
	public RoomUnavailableException(String s) {
		this.s=s;
	}
	public String toString() {
		return s;
	}
}
