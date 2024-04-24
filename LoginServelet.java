package paymentsApp;

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

		try {

			
						
			//usersList.add(u);
			PaymentsAppDao dao = new PaymentsAppDao();
			dao.ValidateLogin(phno, pass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
