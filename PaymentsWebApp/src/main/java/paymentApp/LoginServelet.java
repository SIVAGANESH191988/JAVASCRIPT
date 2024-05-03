package paymentsApp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import paymentApp.PaymentsAppDao;
import paymentApp.User;

import java.io.IOException;

/**
 * Servlet implementation class LoginServelet
 */
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
		String Firstname=request.getParameter("fname");

		request.setAttribute("name",Firstname);
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
