package check;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class Check extends ActionSupport {
		String username;
		
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		@Override
		public String execute() throws Exception {
			if(username.equals("admin")){
				//ȡ��session
				Map session=ActionContext.getContext().getSession();
				//��ֵ����session��
				session.put("username", getUsername());
				return "suc";
			}
			else{
				return "error";
			}
		}
		
}


