<%-- 
    Document   : PaginaDestino
    Created on : 29/09/2022, 09:05:39 AM
    Author     : Sebastian Sanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="paquetico.Paciente"%> 
<%@page import="paquetico.CentroMedico"%> 
<%@page import="paquetico.Doctor"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitud informacion</title>
    </head>
    <body>
        <%
            String seleccion= request.getParameter("informacion");
            int consulta= Integer.parseInt(seleccion);
            if(consulta==1){
            Paciente p1 = new Paciente();
            p1.imprimir();}
            if(consulta==2){
            CentroMedico c1 = new CentroMedico("Famisanar");
            c1.imprimir();}
            if(consulta==3){
            Doctor d1= new Doctor("Carlos","Gusman");
            d1.imprimir();}
        %>
    </body>
</html>
