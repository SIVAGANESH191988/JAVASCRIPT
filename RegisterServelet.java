package paymentsapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PaymentAppdataServelet")
public class RegisterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterServelet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String phno=request.getParameter("phno");
	String email=request.getParameter("email");
	String pass=request.getParameter("pass");
	String Firstame=request.getParameter("fname");
	String Lastname=request.getParameter("lname");
	String Dob=request.getParameter("date");
	response.getWriter().write(pass);
	
	try {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/PaymentsWebApp","root","root");
	 Statement stmt = con.createStatement();
	String query = "insert into User_Info(phone_number,email,first_name,last_name,Date_Of_Birth,PassWord) "
			+ "values('"+phno+"','"+email+"','"+Firstame+"','"+Lastname+"','"+"2002/03/14"+"','"+pass+"')";
	System.out.println(query);
	stmt.executeUpdate(query);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
}
