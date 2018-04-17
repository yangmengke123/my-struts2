package i18n;

import com.opensymphony.xwork2.ActionSupport;

public class LoginI18N extends ActionSupport {
	private String username, pass;

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

	// ����У�飬�÷�����execute()ǰִ�С�����������������Զ����ص�INPUT��ͼ��
	@Override
	public void validate() {
		if (username.isEmpty()) {
			addFieldError("username", getText("username.empty"));
		}
		if (pass.isEmpty()) {
			addFieldError("pass", getText("pass.empty"));
		}
	}

	@Override
	public String execute() throws Exception {
		if(username.equals("admin")||username.equals("yang")){
			return SUCCESS;
		}
		else{
			addActionError( getText("username.error"));
			return "fail";
		}
	}

}
