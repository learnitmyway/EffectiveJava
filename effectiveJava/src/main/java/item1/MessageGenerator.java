package item1;

public class MessageGenerator {

	private String message;
	
	private MessageGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	public static MessageGenerator newInstance() {
		return new MessageGenerator();
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}


}
