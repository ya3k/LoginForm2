/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servletpage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.StudentServices;

/**
 *
 * @author dvan2301
 */
public class HomeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void HomeButton(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            StudentServices sv = new StudentServices();
             String search = (String)request.getParameter("searching");
        String add = request.getParameter("add");
        String delete = request.getParameter("del");
        String logout = request.getParameter("logout");
      
        
        
        if(search != null){
            sv.SearchStudent(search);
            response.sendRedirect("home.jsp");
        }
        
        //add button
         if (add != null){
             

            response.sendRedirect("addstudent.jsp");
        }
         
         //delete button
        if (delete != null){
            //1 array gom  id duoc tich vao`
            String[] selectedValues = request.getParameterValues("selected_st");
            for (String s : selectedValues){
                if (s != null && s.length() > 0){
                    sv.DeleteStudent(s);   
                }
            } 
            response.sendRedirect("home.jsp");
                   
        }
        
        //logout button
        if (logout != null){
            
             // xao thong tin dang nhap khoi session
            request.getSession().invalidate();
            
            
            response.sendRedirect("login.html");
        }
        
       
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       HomeButton(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       HomeButton(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
