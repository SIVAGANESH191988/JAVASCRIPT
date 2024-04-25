package paymentApp;

import java.util.Date;

public class User {
String PhoneNumber;
String FirstName;
String LastName;
String email;
String DateOfBirth;
public String getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
String password;
}
