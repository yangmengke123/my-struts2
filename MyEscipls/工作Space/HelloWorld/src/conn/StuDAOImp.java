package conn;

import java.sql.*;
import java.util.*;

public class StuDAOImp implements StuDAO {
	//�ĸ�����
			String url="jdbc:hsqldb:hsql://localhost";
			String user="sa";
			String password="";
			String driver="org.hsqldb.jdbcDriver";
	
	@Override
	public boolean check(String username)  {
		
		boolean isHave = false;
		//����sql���
		String sql="select * from stu where username=?";
		//�������ݿ�
		try {
			Class.forName(driver);
			try (Connection con = DriverManager.getConnection(url, user, password)) {
				PreparedStatement pstmt = con.prepareStatement(sql);

				// Ϊ���趨ֵ
				pstmt.setString(1, username);
				// �ý������ѯ����
				try (ResultSet rs = pstmt.executeQuery()) {
					// ��ȡ��ѯ���
					isHave = rs.next();
					return isHave;

				}
			}
		} catch (Exception e1) {
			return isHave;
		}
		
	}
	
	//��������ѧ����Ϣ
	public List<String[]> getAllStus() throws ClassNotFoundException, Exception{
		String sql="select * from stu"; 
		Class.forName(driver);
		try(Connection con=DriverManager.getConnection(url, user, password)){
			PreparedStatement pstmt=con.prepareStatement(sql);
			try(ResultSet rs=pstmt.executeQuery()){
				//�����洢�����List
				ArrayList<String[]> stus=new ArrayList<String[]>();
				while(rs.next()){
					//�����洢���ݵ�����
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
	
	//��������ѧ����Ϣ
		public List<Stu> getAllStusByObj() throws ClassNotFoundException, Exception{
			String sql="select * from stu"; 
			Class.forName(driver);
			try(Connection con=DriverManager.getConnection(url, user, password)){
				PreparedStatement pstmt=con.prepareStatement(sql);
				try(ResultSet rs=pstmt.executeQuery()){
					//�����洢�����List
					ArrayList<Stu> stus=new ArrayList<Stu>();
					while(rs.next()){
						//�����洢���ݵĶ���
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
