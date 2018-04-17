package conn;

import java.sql.*;
import java.util.*;

public class StuDAOImp implements StuDAO {
	//四个参数
			String url="jdbc:hsqldb:hsql://localhost";
			String user="sa";
			String password="";
			String driver="org.hsqldb.jdbcDriver";
	
	@Override
	public boolean check(String username)  {
		
		boolean isHave = false;
		//定义sql语句
		String sql="select * from stu where username=?";
		//连接数据库
		try {
			Class.forName(driver);
			try (Connection con = DriverManager.getConnection(url, user, password)) {
				PreparedStatement pstmt = con.prepareStatement(sql);

				// 为？设定值
				pstmt.setString(1, username);
				// 用结果集查询数据
				try (ResultSet rs = pstmt.executeQuery()) {
					// 提取查询结果
					isHave = rs.next();
					return isHave;

				}
			}
		} catch (Exception e1) {
			return isHave;
		}
		
	}
	
	//遍历所有学生信息
	public List<String[]> getAllStus() throws ClassNotFoundException, Exception{
		String sql="select * from stu"; 
		Class.forName(driver);
		try(Connection con=DriverManager.getConnection(url, user, password)){
			PreparedStatement pstmt=con.prepareStatement(sql);
			try(ResultSet rs=pstmt.executeQuery()){
				//用来存储数组的List
				ArrayList<String[]> stus=new ArrayList<String[]>();
				while(rs.next()){
					//用来存储数据的数组
					String[] row=new String[6];
					row[0]=rs.getString("id");
					row[1]=rs.getString("username");
					row[2]=rs.getString("pass");
					row[3]=rs.getString("os");
					row[4]=rs.getString("java");
					row[5]=rs.getString("math");
					stus.add(row);
				}
				return stus;
			}
		}
	
	}
	
	//遍历所有学生信息
		public List<Stu> getAllStusByObj() throws ClassNotFoundException, Exception{
			String sql="select * from stu"; 
			Class.forName(driver);
			try(Connection con=DriverManager.getConnection(url, user, password)){
				PreparedStatement pstmt=con.prepareStatement(sql);
				try(ResultSet rs=pstmt.executeQuery()){
					//用来存储数组的List
					ArrayList<Stu> stus=new ArrayList<Stu>();
					while(rs.next()){
						//用来存储数据的对象
						Stu s = new Stu();
						
						int id=rs.getInt("id");
						String username = rs.getString("username");
						String pass=rs.getString("pass");
						double os=rs.getDouble("os");
						double java=rs.getDouble("java");
						double math=rs.getDouble("math");
						
						s.setId(id);
						s.setUsername(username);
						s.setPass(pass);
						s.setOs(os);
						s.setJava(java);
						s.setMath(math);
						
						stus.add(s);
					}
					return stus;
				}
			}
		
		}
}
