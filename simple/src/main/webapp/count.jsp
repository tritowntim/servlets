<%@ page import="com.tritowntim.simple.*" %>

<html>
	<head>
		<title>Counter</title>
	</head>
	<body>
		<p><%= Counter.introduce() %> <%= Counter.count() %></p>
		<p><strong>${Counter.introduce}&nbsp;${Counter[count]}</strong></p>
	</body>
</html>