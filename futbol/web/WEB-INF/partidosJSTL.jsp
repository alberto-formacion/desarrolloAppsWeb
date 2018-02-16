<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="eu.dataaccess.footballpool.TGameInfo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/styles.css" rel="stylesheet">
</head>
<body>
<c:forEach items="${partidos}" var="partido">
	${ partido.team1.SName } ${ partido.SScore } ${ partido.team2.SName }
	<fmt:formatDate pattern="dd/MM/yyyy" value="${ partido.DPlayDate }"/>
	<fmt:formatDate pattern="HH:mm" value="${partido.TPlayTime.getAsCalendar().getTime()}"/>
		<c:forEach items="${partido.goals}" var="goles">
			<br>
			${goles.IMinute }' ${goles.SPlayerName} <img src="${goles.STeamFlag }" />
		</c:forEach>
	<hr>
</c:forEach>
</body>
</html>