package check;

import com.opensymphony.xwork2.ActionSupport;
import conn.Stu;

public class CheckLoginByStu extends ActionSupport {
	private Stu stu;

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}
	//数据校验，该方法在execute()前执行。如果不符合条件，自动返回到INPUT视图。
	@Override
	public void validate() {
		if(stu.getUsername().isEmpty()){
			addFieldError("stu.username","用户名不能为空");
		}
		if(stu.getPass().isEmpty()){
			addFieldError("stu.pass","密码不能为空");
		}
	}

	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
	
}
