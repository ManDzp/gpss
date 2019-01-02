<%@ page import="com.lyyzoo.gpss.util.StringUtil" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page language="java" import="java.util.*" errorPage="/ErrorPage/error.jsp" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/login" method="post">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit" value="login">
</form>

<% String message = StringUtil.valueOf(request.getAttribute("error")); %>
<%=message %>

<%
    session.setAttribute("name", "session对象");//使用session对象,设置session对象的属性
    out.print(session.getAttribute("name")+"<br/>");//获取session对象的属性
    pageContext.setAttribute("name", "pageContext对象");//使用pageContext对象,设置pageContext对象的属性
    out.print(pageContext.getAttribute("name")+"<br/>");//获取pageContext对象的属性
    application.setAttribute("name", "application对象");//使用application对象,设置application对象的属性
    out.print(application.getAttribute("name")+"<br/>");//获取application对象的属性
    out.print("Hello Jsp"+"<br/>");//使用out对象
    out.print("服务器调用index.jsp页面时翻译成的类的名字是："+page.getClass()+"<br/>");//使用page对象
    out.print("处理请求的Servlet的名字是："+config.getServletName()+"<br/>");//使用config对象
    out.print(response.getContentType()+"<br/>");//使用response对象
    out.print(request.getContextPath()+"<br/>");//使用request对象
%>

<%
    int sum = 0;
    for(int k=0;k<5;k++){
        sum+=k;
    }
    out.print(sum);
%>

<%
    for (int i=1; i<5; i++)
    {
%>
<H1>dd</H1>
<%
    }
%>
<h1>jsp声明</h1>
<！--HTML注释-->
<%--jsp注释--%>
<%!
    /**
     *
     */
    static {
        System.out.println("loading Servlet!");
        System.out.println();
    }

    private int globalVar = 0;

    public void jspInit(){
        System.out.println("initializing jsp!");
    }
%>

<%!
    public void jspDestroy(){
        System.out.println("destroying jsp!");
    }
%>

</body>
</html>