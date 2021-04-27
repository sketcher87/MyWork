/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.io.FileDescriptor.out;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static sun.misc.MessageUtils.out;

/**
 *
 * @author user
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
             String Ans;
            int originalPosition1=3;
            int originalPosition2=4;
            int newPosition1=5;
            int newPosition2=6;
            int [] myArray ={1,3,10,0,0,2,6};
            int temp1= myArray[originalPosition1];
            int temp2= myArray[originalPosition2];
            myArray[originalPosition1] = myArray[newPosition1];
            myArray[originalPosition2] = myArray[newPosition2];
            myArray[newPosition1]=temp1;
            myArray[newPosition2]=temp2;
            out.println( Arrays.toString(myArray));
     }
    
}
}
