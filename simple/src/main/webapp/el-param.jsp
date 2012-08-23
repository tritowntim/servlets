<!doctype html>
<html>
	<head>
		<title>Expression Language Parameters</title>
	</head>
	<body>
	<p>
			Name = ${param.name}<br/>
			ID# = ${param.empID}<br/>
			First food = ${paramValues.food[0]}<br/>
			Second food = ${paramValues.food[1]}<br/>
	</p>
	<p>Host is <strong>${header.host}</strong></p>
	</body>
</html>