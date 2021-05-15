package com.example.primerWeb;

import java.io.*;
import java.util.List;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Panita";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");




        PrintWriter out = response.getWriter();
        out.println("<html><head><link rel= 'stylesheet' href='css/estilos.css' /></head>");
        out.println("<h1>Listado de Alumnas: </h1><br>");
        List<Alumna> alumnas = AlumnaDAO.getAlumnas();
        for (AlumnaDAO alumna : alumnas )
            out.println("<p>"+alumna+"</p>");

        out.println("<body>");
       /* out.println("<h1> Alumna: "+ alumna.getNombre()+"</h1> <br>");
        out.println("<h1> Apellido: "+ alumna.getApellido()+"</h1 <br>");
        out.println("<h2> Curso: "+ alumna.getCurso()+"</h2> <br>");*/

        out.println("</body></html>");
    }

    public void destroy() {
    }
}