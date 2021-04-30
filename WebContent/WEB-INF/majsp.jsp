<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@page import="java.util.regex.Matcher, java.util.regex.Pattern" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="${pageContext.request.contextPath}/styles/main.css" rel="stylesheet" />
<title>Ma JSP</title>
</head>
<body>

	<form method="post">
		
		<div class="champ">
			<label>Email</label>
			<input type="text" name="email">
		</div>
		
		<div class="champ">
			<label>Password</label>
			<input type="password" name="password">
		</div>
		
		<div class="champ">
			<label>Confirm Password</label>
			<input type="password" name="confirmPassword">
		</div>
		
		<button class="champ" type="submit">Enregistrer</button>
		
	</form>
	
	<%!
	
		public boolean isEmailValid(String email) {
				String EMAIL_REGEX =
						"^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
						"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
						
				Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
				Matcher matcher = EMAIL_PATTERN.matcher(email);
			return matcher.matches();
	}
	
	%>
	
	<%
		String mail = request.getParameter("email");
	
		if (!(isEmailValid(mail))) {
	%>
			<p>Adresse email invalide</p>
	<%	
		}
	
	%>
	
	

</body>
</html>