package example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Exampleservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Exampleservelet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x=request.getParameter("num1");
		String y=request.getParameter("op");
		String z=request.getParameter("num2");
      
       
      String ans="";
      switch(y.charAt(0))
      {
      case '+':
     ans= Integer.toString(Integer.parseInt(x)+Integer.parseInt(z));
    	 
    	  break;
      case '-':
    	  ans= Integer.toString(Integer.parseInt(x)-Integer.parseInt(z));
    	  break;
      case '*':
    	  ans= Integer.toString(Integer.parseInt(x)*Integer.parseInt(z));
    	  break;
      case '%':
    	  ans= Integer.toString(Integer.parseInt(x)%Integer.parseInt(z));
    	  break;
      case '/':
    	  ans= Integer.toString(Integer.parseInt(x)/Integer.parseInt(z));
    	  break;
       default:
    	ans="enter a valid operator";
      }

		response.getWriter().write(ans);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
