<html>
<head>
<title>useBean Example</title>
</head>
<body>

<jsp:useBean id="date" class="java.util.Date" /> 
<p>The date/time is <%= date %>
<jsp:useBean id="mem" class="com.srspencer.Monitoring.FreeMem" />
<jsp:useBean id="cpu" class="com.srspencer.Monitoring.CPULoad" />
<jsp:useBean id="java" class="com.srspencer.Monitoring.JavaVersion" />
<p>Free Heap Space: <jsp:getProperty name="mem" property="free" />
<p>Max Heap Space: <jsp:getProperty name="mem" property="max" />
<p>Total System Memory: <jsp:getProperty name="mem" property="total" />
<p>CPU Load: <jsp:getProperty name="cpu" property="load" />
<p>Java Version: <jsp:getProperty name="java" property="javaVersion" />
</body>
</html>
