
package paymentApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
/**
 * Servlet implementation class RegisterServelet
 */
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
	String Firstname=request.getParameter("fname");
	String Lastname=request.getParameter("lname");
	String Dob=request.getParameter("date");
	String address=request.getParameter("Address");
	long phnnum=Long.parseLong(phno);
	request.setAttribute("name", Firstname);
	
		try {

			User u=new User();
			u.setPhoneNumber(phnnum);
			u.setFirstName(Firstname);
			u.setLastName(Lastname);
			u.setEmail(email);
			u.setPassword(pass);
			u.setDateOfBirth(Dob);
			u.setAddress(address);
			u.setWalBal(0);
			PaymentsAppDao dao = new PaymentsAppDao();
			dao.insertUser(u);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	

}
