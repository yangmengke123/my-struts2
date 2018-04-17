<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <table>
  <tr>
  <th>id</th>
  <th>username</th>
  <th>pass</th>
  <th>os</th>
  <th>java</th>
  <th>math</th>
  </tr>
  <s:iterator value="stus" var="stu"> 
  <tr>  
              <th><s:property value="#stu.id"/></th>  
              <th><s:property value="#stu.username"/></th>  
              <th><s:property value="#stu.pass"/></th>  
              <th><s:property value="#stu.os"/></th>  
              <th><s:property value="#stu.java"/></th>  
              <th><s:property value="#stu.math"/></th>  
              </tr> 
              </s:iterator>
  </table>
  </body>
</html>
