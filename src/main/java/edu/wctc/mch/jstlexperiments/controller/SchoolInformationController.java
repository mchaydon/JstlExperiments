/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.mch.jstlexperiments.controller;

import edu.wctc.mch.jstlexperiments.model.Course;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mike
 */
@WebServlet(name = "SchoolInformationController", urlPatterns = {"/SchoolInformationController"})
public class SchoolInformationController extends HttpServlet {
    private static final String RESULT_PAGE = "index.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String destination = RESULT_PAGE;
        try 
        {
            String[] classes = new String[4];
            if (!request.getParameter("classOneString").equals("") || request.getParameter("classOneString") != null)
            {
                classes[0] = request.getParameter("classOneString");
            }
            if (!request.getParameter("classTwoString").equals("") || request.getParameter("classTwoString") != null)
            {
                classes[1] = request.getParameter("classTwoString");
            }
            if (!request.getParameter("classThreeString").equals("") || request.getParameter("classThreeString") != null)
            {
                classes[2] = request.getParameter("classThreeString");
            }
            if (!request.getParameter("classFourString").equals("") || request.getParameter("classFourString") != null)
            {
                classes[3] = request.getParameter("classFourString");
            }
            
            Course[] courses = new Course[classes.length];
            for(int i = 0; i < classes.length; i++)
            {
              courses[i] = new Course(classes[i]);
            }

            request.setAttribute("classes", courses);
        } 
        catch (Exception e) 
        {
            destination = RESULT_PAGE;
        }
        
        RequestDispatcher view =
                request.getRequestDispatcher(destination);
        view.forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
