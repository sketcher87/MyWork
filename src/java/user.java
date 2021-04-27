import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletConfig;


public class user extends HttpServlet {

     public static void main( String args[] ) throws Exception {
    String servername     = "localhost"; 
    // // 接続先サーバー名は，第１引数として与える。
    String urlprefix      = "jdbc:mysql://";
    //    String databasename   = "mysql";
    String databasename   = "deerhold";
    String user           = "root";

    //	StringBuffer temp = null;
    //  if(args.length == 2) temp = new StringBuffer( args[1] ); else temp = new StringBuffer( "" );
    //	String password = temp.toString(); 
    String password = "tuis2018"; 
    // String serverencoding = "EUC_JP";
    String serverencoding = "UTF-8";
  
    String url =  urlprefix + servername + "/" + databasename + "?useUnicode=true&characterEncoding=" + serverencoding;
  
    Connection con = null;
    try {
      Class.forName( "com.mysql.jdbc.Driver" );               
      // Loading Driver
      con = DriverManager.getConnection( url, user, password ); 
      // Connecting MySQL server
      System.out.println( "Connected...." );
      Statement st = con.createStatement();
      String sqlStr = "SELECT * FROM user";
      ResultSet result = st.executeQuery( sqlStr );
    
      while( result.next() ) {
        String str1 = result.getString( "PersonId" );
        String str2 = result.getString( "LastName" );
        String str3 = result.getString( "FirstName" );
        System.out.println( str1 + ", " + str2 + ", " + str3);
      }
    
      result.close();
      st.close();
      con.close();
    }
    catch( SQLException e ) {
      System.out.println( "Connection Failed. : " + e.toString() );
      throw new Exception();
    }
    catch( Exception e ) {
      System.out.println( "Exception! :" + e.toString() );
      throw new Exception();
    }
    finally {
      try {
        if ( con != null ) con.close();
      }
      catch(Exception e){
        System.out.println( "Exception! :" + e.toString() );
        throw new Exception();
      }
    }
  }
}
