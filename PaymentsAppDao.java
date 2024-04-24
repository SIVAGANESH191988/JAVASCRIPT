package paymentApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PaymentsAppDao {
    public void insertUser(User u) {
        try {
        	
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Payments_Web_App", "root", "Siyara@191988");
            Statement stmt = con.createStatement();
            String query = "INSERT INTO User_Details(phoneNumber, email, FirstName, LastName, DOB, Password) " +
                           "VALUES ('" + u.getPhoneNumber() + "','" + u.getEmail() + "','" + u.getFirstName() + "','" + u.getLastName() + "','"+u.getDateOfBirth()+"','"+ u.getPassword() + "')";

       
            stmt.executeUpdate(query);
            
           
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean ValidateLogin(String phno, String passWord) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Payments_Web_App", "root", "Siyara@191988"
					+ "");
			Statement Stm = Con.createStatement();
			String Query = "Select PhoneNumber,Password from User_Details";
			ResultSet res = Stm.executeQuery(Query);
			while(res.next()) {
				
				if(res.getString("PhoneNumber").equals(phno) && res.getString("Password").equals(passWord))
				{
					return true;
				}
			}
			Stm.close();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}
}

