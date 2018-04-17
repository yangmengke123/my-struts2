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
	//����У�飬�÷�����execute()ǰִ�С�����������������Զ����ص�INPUT��ͼ��
	@Override
	public void validate() {
		if(stu.getUsername().isEmpty()){
			addFieldError("stu.username","�û�������Ϊ��");
		}
		if(stu.getPass().isEmpty()){
			addFieldError("stu.pass","���벻��Ϊ��");
		}
	}

	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
	
}
