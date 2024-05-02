package paymentsapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phno=request.getParameter("phno");
		
		String pass=request.getParameter("pass");

	Cookie ck= new Cookie("phno",phno);
	response.addCookie(ck);
	Cookie ck1= new Cookie("phno",pass);
	response.addCookie(ck1);
			PaymentsAppDao dao = new PaymentsAppDao();
			if(dao.ValidateLogin(phno, pass))
			{
				RequestDispatcher rd=request.getRequestDispatcher("/Dashboard.html");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("/Homepage.html");
				rd.forward(request, response);
			}
	}

}