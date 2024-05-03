<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.details{
 width: 300px;
align-items: center;
padding:50px;
  margin: 0 auto;
    margin-top: 100px;
    border: 1px solid black;
    border-radius: 4px;
}
input[type=text] {
    width: 100%;
    padding: 20px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background:peach;
}
.btn {
    background-color:white;
    color:black;
 
   text-align: center;
    width: 50%;
    
}
</style>
</head>
<body>
<form action="http://localhost:8080/PaymentsWebApp//BankRegistrationServelet"method="post" >
            <div class="details">
              <label for="BankName"><b>BankName</b></label>
                <input type="text"placeholder="BankName"name="BName"/>
                <label for="AccountNumber"><b>Account Number</b></label>
                <input type="text"placeholder="Account Number"name="Acno"/>
                <label for="AccountNumber"><b>Account Number</b></label>
                <input type="text"placeholder="Confirm Account Number"name="Acno"/>
                <label for="IFSC"><b>IFSC</b></label>
                <input type="text"placeholder="IFSC"name="IFSC"/>
                <label for="Branch"><b>Branch</b></label>
                <input type="text"placeholder="Branch"name="Branch"/>
             
                
                <div style="text-align: center;">
                    <button class = "btn ">
                        <type="submit>register</button>
                </div>
               
             
              
            </div>

        </form>
       
</body>
</html>