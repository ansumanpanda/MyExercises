package core.beans;

public class HelloWorld {
	
	private String message;
	
	
	public void sayHello(String name)
	{
		System.out.println( message + " "+name);
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	

}
