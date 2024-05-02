package paymentApp;

import java.util.Date;

public class User {
long PhoneNumber;
String FirstName;
String LastName;
String email;
Date DateOfBirth;
String Address;
String password;
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public long getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
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
public Date getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
