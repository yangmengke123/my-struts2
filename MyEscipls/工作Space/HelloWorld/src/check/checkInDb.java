package check;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
import conn.*;

public class checkInDb extends ActionSupport {
	List<Stu> stus;
	
	public List<Stu> getStus() {
		return stus;
	}

	@Override
	public String execute() throws Exception {
		StuDAO dao=new StuDAOImp();
		stus=dao.getAllStusByObj();
		return "all";
	}
	
	
}
