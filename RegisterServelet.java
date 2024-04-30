package paymentsapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationServelet
 */
@WebServlet("/RegistrationServelet")
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

	
	

			User u=new User();
			u.setDateOfBirth(Dob);
			u.setEmail(email);
			u.setFirstName(Firstame);
			u.setLastName(Lastname);
			u.setPassword(pass);
			u.setPhoneNumber(phno);
			HttpSession hs=request.getSession();
			hs.setAttribute("ph", phno);
			hs.setAttribute("fn", Firstame);
			PaymentsAppDao dao = new PaymentsAppDao();
			dao.insertUser(u);
			
		
	
	}
//	 response.getWriter().write(Dob);
	

}
