<%@ page import = "fonc.*" %>
<%
    String look = request.getParameter("matiere");
    String matiere = request.getParameter("description");
    Fonction fonction = new Fonction();
    try{
        int  i = fonction.insertLook(matiere,look);
        if(i != -1){
               
            response.sendRedirect("insert.jsp");
        }
    } catch(Exception e){

    }
    
%>