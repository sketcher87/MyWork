package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DisplayAll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<?\n");
      out.write("$user = 'root';\n");
      out.write("$password = 'tuis2018'; \n");
      out.write("  \n");
      out.write("\n");
      out.write("$database = 'deerhold'; \n");
      out.write("  \n");
      out.write("$servername='localhost:3306';\n");
      out.write("$mysqli = new mysqli($servername, $user, \n");
      out.write("                $password, $database);\n");
      out.write("  \n");
      out.write("// Checking for connections\n");
      out.write("if ($mysqli->connect_error) {\n");
      out.write("    die('Connect Error (' . \n");
      out.write("    $mysqli->connect_errno . ') '. \n");
      out.write("    $mysqli->connect_error);\n");
      out.write("}\n");
      out.write("  \n");
      out.write("// SQL query to select data from database\n");
      out.write("$sql = \"SELECT * FROM user \";\n");
      out.write("$result = $mysqli->query($sql);\n");
      out.write("$mysqli->close(); \n");
      out.write("?>\n");
      out.write("        \n");
      out.write("// HTML code to display data in tabular format\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  \n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>GFG User Details</title>\n");
      out.write("    <!-- CSS FOR STYLING THE PAGE -->\n");
      out.write("    <style>\n");
      out.write("        table {\n");
      out.write("            margin: 0 auto;\n");
      out.write("            font-size: large;\n");
      out.write("            border: 1px solid black;\n");
      out.write("        }\n");
      out.write("  \n");
      out.write("        h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #006600;\n");
      out.write("            font-size: xx-large;\n");
      out.write("            font-family: 'Gill Sans', 'Gill Sans MT', \n");
      out.write("            ' Calibri', 'Trebuchet MS', 'sans-serif';\n");
      out.write("        }\n");
      out.write("  \n");
      out.write("        td {\n");
      out.write("            background-color: #E4F5D4;\n");
      out.write("            border: 1px solid black;\n");
      out.write("        }\n");
      out.write("  \n");
      out.write("        th,\n");
      out.write("        td {\n");
      out.write("            font-weight: bold;\n");
      out.write("            border: 1px solid black;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("  \n");
      out.write("        td {\n");
      out.write("            font-weight: lighter;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("  \n");
      out.write("<body>\n");
      out.write("    <section>\n");
      out.write("        <h1>First Project</h1>\n");
      out.write("        <!-- TABLE CONSTRUCTION-->\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>PersonId</th>\n");
      out.write("                <th>LastName</th>\n");
      out.write("                <th>FirstName</th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <!-- PHP CODE TO FETCH DATA FROM ROWS-->\n");
      out.write("            <?php   // LOOP TILL END OF DATA \n");
      out.write("                while($rows=$result->fetch_assoc())\n");
      out.write("                {\n");
      out.write("             ?>\n");
      out.write("            <tr>\n");
      out.write("                <!--FETCHING DATA FROM EACH \n");
      out.write("                    ROW OF EVERY COLUMN-->\n");
      out.write("                <td><?php echo $rows['PersonId'];?></td>\n");
      out.write("                <td><?php echo $rows['LastName'];?></td>\n");
      out.write("                <td><?php echo $rows['FirstName'];?></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <?php\n");
      out.write("                }\n");
      out.write("             ?>\n");
      out.write("        </table>\n");
      out.write("    </section>\n");
      out.write("</body>\n");
      out.write("  \n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
