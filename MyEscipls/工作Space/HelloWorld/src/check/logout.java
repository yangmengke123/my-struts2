package check;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
public class logout extends ActionSupport {

	@Override
	public String execute() throws Exception {
		//ȡ��session
		Map session=ActionContext.getContext().getSession();
		//��ֵ�Ƴ�session
		session.remove("username");
		return "logout";
	}
	
}
