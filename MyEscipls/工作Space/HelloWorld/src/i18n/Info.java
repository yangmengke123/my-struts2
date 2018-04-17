package i18n;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import com.opensymphony.xwork2.ActionSupport;
import conn.Stu;

public class Info extends ActionSupport{
	private Stu stu;

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	@Override
	public String execute() throws Exception {
		
		
		
		
		ResourceBundle bundle=ResourceBundle.getBundle("i18n.msg");
		String format1=MessageFormat.format(SUCCESS, stu);
		//String username=bundle.getString("username");
		return SUCCESS;
	}
	
	
	
}
