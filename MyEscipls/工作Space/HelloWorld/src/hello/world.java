package hello;

import com.opensymphony.xwork2.ActionSupport;

public class world extends ActionSupport {
	private String username;
	private String pass;
	private String message;
	private String type;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
