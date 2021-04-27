<%@page contentType="text/html  pageEncoding=UTF-8"%>
<%@page import="java.sql.*, java.util.*"%>
<%!
// ???????init???????
public void jspInit() {
    try {
        // JDBC????????
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
<title>CUSTOMER_TBL?????Insert(JSP?)</title>
</head>

<body>
<P>JSP??????????Insert</P>

<%
        Connection con = null;
        Statement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/deerhold", "root", "");

            stmt = con.createStatement();

            String PersonId = request.getParameter("PersonId");
            String LastName = request.getParameter("LastName");
            String FirstName = request.getParameter("FirstName");

            StringBuffer buf = new StringBuffer();
            buf.append("insert into user (");
            buf.append("PersonId, LastName, FirstName) ");
            buf.append("values (");
            buf.append(PersonId);
            buf.append(",'");
            buf.append(LastName);
            buf.append("','");
            buf.append(FirstName);
            buf.append("')");
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