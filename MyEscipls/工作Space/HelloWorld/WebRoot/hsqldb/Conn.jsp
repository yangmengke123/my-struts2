<%@ page language="java" import="java.sql.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
<%
	//从上个页面提取值
	String username=request.getParameter("username");
	//四个参数
	String url="jdbc:hsqldb:hsql://localhost";
	String user="sa";
	String password="";
	String driver="org.hsqldb.jdbcDriver";
	//连接数据库
	Class.forName(driver);
	Connection con=DriverManager.getConnection(url, user, password);
	//定义sql语句
	String sql="select * from stu where username=?";
	//初始化sql语句
	PreparedStatement pstmt=con.prepareStatement(sql);
	//为？设定值
	pstmt.setString(1,username);
	//用结果集查询数据
	ResultSet rs=pstmt.executeQuery();
	//提取查询结果
	boolean isHave=rs.next();
	//关闭数据库
	rs.close();pstmt.close();con.close();
	if(isHave){
		response.sendRedirect("hsqldb/show.jsp");
	}
 %>	
  <body>
  
  
失败
  </body>
</html>
