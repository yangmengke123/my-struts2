package check;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import conn.*;

public class checkInLogin extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String username;
	boolean isHave=false;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	StuDAO dao=new StuDAOImp();

	@Override
	public String execute() throws Exception {
		boolean isHave=dao.check(username);
		if(isHave){
			Map session=ActionContext.getContext().getSession();
			session.put("username", getUsername());
			return "success";
		}
		else{
			return "error";
		}
	}
	
	
}
