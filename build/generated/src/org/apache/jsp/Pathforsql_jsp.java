package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Pathforsql_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<?php\n");
      out.write("class database\n");
      out.write("{\n");
      out.write("\n");
      out.write(" public $host = \"localhost\";\n");
      out.write(" public $user = \"root\";\n");
      out.write(" public $pass = \"tuis2018\";\n");
      out.write(" public $db   = \"deerhold\";\n");
      out.write(" public $link;\n");
      out.write("\n");
      out.write(" public function __construct()\n");
      out.write(" {\n");
      out.write("    $this->connect();\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" private function connect()\n");
      out.write(" {\n");
      out.write("   $this->link = new mysqli($this->host, $this->user, $this->pass, $this->db);\n");
      out.write("    return $this->link;\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" public function select($query)\n");
      out.write(" {\n");
      out.write("    $result = $this->link->query($query) or die($this->link->error.__LINE__);\n");
      out.write("\n");
      out.write("    if($result->num_rows>0)\n");
      out.write("    {\n");
      out.write("      return $result;\n");
      out.write("    } \n");
      out.write("    else \n");
      out.write("    {\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("?>\n");
      out.write("\n");
      out.write(" <?php\n");
      out.write("        $db = new database();\n");
      out.write("\n");
      out.write("        $query = \"select * from user\";\n");
      out.write("        $result = $db->select($query);\n");
      out.write("\n");
      out.write("        echo \"<table>\";\n");
      out.write("         echo \"<tr>\";\n");
      out.write("            echo \"<th>PersonId </th>\";\n");
      out.write("            echo \"<th>LastName </th>\";\n");
      out.write("            echo \"<th>FirstName </th>\";\n");
      out.write("         echo \"</tr>\";\n");
      out.write("         while($row = mysqli_fetch_array($result)) \n");
      out.write("         {\n");
      out.write("            echo \"<tr>\";\n");
      out.write("            echo \"<td> $row[name]</td>\";\n");
      out.write("            echo \"<td> $row[roll]</td>\";\n");
      out.write("            echo \"</tr>\";\n");
      out.write("         }\n");
      out.write("       echo \"</table>\";\n");
      out.write(" ?>");
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
