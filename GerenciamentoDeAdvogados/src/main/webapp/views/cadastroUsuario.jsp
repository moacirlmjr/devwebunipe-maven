<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h2>Cadastro de Usuários</h2>
	<a href="prepararListarUsuario">Voltar</a>
	<br />
	<form:form action="addUsuario" method="POST" modelAttribute="usuario">
		Nome:
		<form:input path="nome" />
		<form:errors path="nome" />
		<br />
		
		Email:
		<form:input path="email" />
		<form:errors path="email" />
		<br />
		Telefone:
		<form:input path="telefone" />
		<form:errors path="telefone" />
		<br />
		Username:
		<form:input path="username" />
		<form:errors path="username" />
		<br />
		Senha:
		<form:password path="password" />
		<form:errors path="password" />
		<br />
		
		Data de Nascimento:
		<form:input path="dataNascimento" />
		<form:errors path="dataNascimento" />
		<br />
		Autorizacao:
		<form:select path="autorizacao.id" items="${autorizacoes}"
			itemValue="id" itemLabel="nome" />
		<br />
		<input type="submit" value="Enviar" />
	</form:form>
</body>
</html>