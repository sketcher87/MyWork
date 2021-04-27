<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%!

public void jspInit() {
    try {

        Class.forName("com.mysql.jdbc.Driver");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>update user table</title>
</head>

<body>
<P>Update DAtabase through JSP</P>


<%
        Connection con = null;
        Statement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/deerhold",  "root", "");

            stmt = con.createStatement();

            String PersonId = request.getParameter("PersonId");
            String LastName = request.getParameter("LastName");
            String FirstName = request.getParameter("FirstName");

            StringBuffer buf = new StringBuffer();
            buf.append("update user set ");
            buf.append("name = '");
            buf.append(LastName);
            buf.append("', LastName = '");
            buf.append(LastName);
            buf.append("' where PersonId = ");
            buf.append(PersonId);
            stmt.executeUpdate(buf.toString());
            
            try { stmt.close(); } catch (Exception e) {}
            try { con.close(); } catch (Exception e) {}

        } catch (Exception e) {
            e.printStackTrace();
        }

%>
<jsp:forward page="user.jsp" />
</body>
</html>