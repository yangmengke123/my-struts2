package conn;

import java.util.*;

public interface StuDAO {
	
	public boolean check(String username);
	public List<String[]> getAllStus() throws ClassNotFoundException, Exception;
	public List<Stu> getAllStusByObj() throws ClassNotFoundException, Exception;
}
