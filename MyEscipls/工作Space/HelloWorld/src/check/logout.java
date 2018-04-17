package check;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
public class logout extends ActionSupport {

	@Override
	public String execute() throws Exception {
		//取得session
		Map session=ActionContext.getContext().getSession();
		//将值移除session
		session.remove("username");
		return "logout";
	}
	
}
