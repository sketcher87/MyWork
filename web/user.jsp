<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%!
// サーブレットのinitメソッドに相当
public void jspInit() {
    try {
        // JDBCドライバをロード
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
<title>user Table Data(JSP版)</title>
</head>

<body>
<P>Access to DataBase throug JSP</P>
<table border='1'><tr><th>PersonId</th><th>LastNAME</th><th>FirstName</th></tr>

<%
        // データベースへのアクセス開始
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // データベースに接続するConnectionオブジェクトの取得
            con = DriverManager.getConnection("jdbc:mysql://localhost/deerhold", "root", "");
            // データベース操作を行うためのStatementオブジェクトの取得
            stmt = con.createStatement();
            // SQL()を実行して、結果を得る
            rs = stmt.executeQuery("select PersonId, LastName, FirstName from user");

            // 得られた結果をレコードごとに表示
            while (rs.next()) {
%>
                <tr>
                <%-- レコードのPERSONIDフィールドを表示 --%>
                <td><%= rs.getInt("PersonId")%></td>
                <%-- レコードのLASTNAMEフィールドを表示 --%>
                <td><%= rs.getString("LastName")%></td>
                <%-- レコードのFIRSTNAMEフィールドを表示 --%>
                <td><%= rs.getString("FirstName")%></td>
                </tr>
<%
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // データベースとの接続をクローズ
            try { rs.close(); } catch (Exception e) {}
            try { stmt.close(); } catch (Exception e) {}
            try { con.close(); } catch (Exception e) {}
        }
%>

        </table>
</body>
</html>