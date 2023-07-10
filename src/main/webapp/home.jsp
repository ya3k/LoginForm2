<%-- 
    Document   : showstu
    Created on : Jul 9, 2023, 8:34:38 PM
    Author     : dvan2301
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="services.StudentServices"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style>
            table, th ,td{
                border: 1px solid;
                margin-bottom: 20px;
            }
        </style>

    </head>
    <body>

        <%
            String un = (String) session.getAttribute("username");
        %>
        <%if (un != null) {


        %>
        <h1>Welcome <%= un%></h1>

        <form class="search"  method="get">
            <input  type="text" name="searching" > 
            <button formaction="home" > Search</button>
        </form> 
        <h2>Student List</h2>

        <form action="home" method="POST">
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>PassWord</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Gender</th>
                    <th>Address</th>
                    <th>Delelte</th>
                    <th>CreateAT</th>

                </tr>
                <% StudentServices as = new StudentServices();

                    as.loadFromFileStudent();
                    List<Student> stList = as.ShowStudentList(); %>
                <% for (Student st : stList) {%>
                <tr>

                    <td><%= st.getStuId()%></td>
                    <td><%= st.getStuName()%></td>
                    <td><%= st.getStuPass()%></td>
                    <td><%= st.getStuEmail()%></td>
                    <td><%= st.getStuPhone()%></td>
                    <td><%= st.getStuGender()%></td>
                    <td><%= st.getStuAddress()%></td>
              
                    <td><input type="checkbox"  name="selected_st" value="<%= st.getStuId()%>"/></td>
      <td> </td>
                    <%     }%>



                </tr>




            </table>
             
        
            <div>
                <button  type='submit' name="add" > Add Student </button>
                <button  type='submit' name="del"> Delete </button>
                <button  type='submit' name="logout"> Logout </button>  
            </div>

        </form>


        <%}%>
    </body>
</html>
