package kadai7;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Inputoutput1 extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and 
     * <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, java.io.IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>First project</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<ul>");
        java.util.Enumeration en = request.getParameterNames();
        while (en.hasMoreElements()) {
            String name = (String)en.nextElement();
            String values[] = request.getParameterValues(name);
            for (int i = 0; i < values.length; i++) {
                out.println("<li>" + name + "=" + values[i]);
            }
            out.println("<hr>");
        }
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, 
        HttpServletResponse response)
    throws ServletException, java.io.IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, 
        HttpServletResponse response)
    throws ServletException, java.io.IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    
}