<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h2>Login</h2>
	<form method="post" action="j_spring_security_check">
		Username: <input type="text" name="username" /><br /> 
		Password: <input type="password" name="password" /> <br /> 
		<input type="submit" value="Enviar">
	</form>
</body>
</html>