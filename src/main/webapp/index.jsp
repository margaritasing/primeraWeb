<%@ page import="com.example.primerWeb.Alumna" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
      Alumna a = new Alumna("Libia", "Freites", "BackEnd");
%>
<!DOCTYPE html>
<html>
<head>
      <title>JSP - Hello World</title>
</head>
<body style="background-color: beige">
<h1 style="font-size:5em"><%= "Hello Pana" %></h1>
<h1 style="font-size:3em"><%= "Nombre: " + a.getNombre() %></h1>
<h1 style="font-size:3em"><%= "Apellido: " + a.getApellido()%></h1>
<h1 style="font-size:3em"><%= "Curso: " + a.getCurso() %></h1>
<br/>
<a href="hello-servlet">Hello Panita</a> <br>
<a href="PruebaServlet">Hola prueba</a>

</body>
</html>