import java.sql.*;
public class CreateStudent
{
public static void main(String[] args)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vignan","root","root");

Statement st=con.createStatement();
st.execute("CREATE TABLE Student1(regno varchar(10), name varchar(10), fname varchar(10),mname varchar(10), dob date,gender char(1),ssc int(3), inter int(3)");

System.out.println("TABLE CREATED SUCCESSFULLY");
}
catch (ClassNotFoundException cnfe)
{
System.out.println("PLEASE CHECK JDBC DRIVER PATH");
}
catch(SQLException sqle)
{
System.out.println("PLEASE CHECK QUERY");
}
}
}