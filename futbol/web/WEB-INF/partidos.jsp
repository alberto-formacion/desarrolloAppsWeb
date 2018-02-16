<%@page import="eu.dataaccess.footballpool.TGoal"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.TimeZone"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="eu.dataaccess.footballpool.TGameInfo" %>
<% TGameInfo[] partidos = (TGameInfo[]) request.getAttribute("partidos"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(TGameInfo partido : partidos){ %>
	<%= partido.getTeam1().getSName() %> <%= partido.getSScore() %> <%= partido.getTeam2().getSName() %>
	<%for(TGoal gol: partido.getGoals()){ %>
		<%=gol.getIMinute() %>' <%=gol.getSPlayerName() %>
	<%} %>
	<hr>
<% } %>
</body>
</html>