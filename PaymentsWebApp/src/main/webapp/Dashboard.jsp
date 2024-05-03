<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#details{
display:inline-block;
  width: 95%;
  border: 1px solid black;

  margin-left: 10px;
}
#details2{
display:inline-block;
  width: 95%;
  border: 1px solid black;

  margin-left: 10px;
}
#details3{
display:inline-block;
  width: 95%;
  border: 1px solid black;

  margin-left: 10px;
}
#Acc{
display:inline-block;
  width: 25%;
  border: 1px solid black;

  margin-left: 10px;
}
	.a{
		height: 50px;
		width:100px;
		margin-right: 16px;
		
		
	}
	h2{
	display:inline-block;
	}
	#logout {
    width: 150%%;
    padding: 10px;
    margin-left: 50px ;
    
    display: inline-block;
    border: none;
    background: #f1f1f1;
}
#wallet{
width: 150%%;
    padding: 10px;
    margin-left: 10px ;
    
    display: inline-block;
    border: none;
    background: #f1f1f1;
}
	input[type=text]{
width: 25;
    padding: 20px;
    margin-left: 10px ;
    height:50%
    display: inline-block;
    border: 1px black;
    background: #f1f1f1;
}
	
</style>
</head>
<body>
	
	<div >
	<div id="details">
	<center><h1>welcome to paymentsApp</h1>
	</center>
	<h2>welcome <%=request.getAttribute("name")%></h2>
	<input type="button" id="logout"value="logout"/>
	</div>
	<div id="details2">
	
	<h2>Primary BankAccountNumber</h2>
	<br>
	<h3>AccountBalance</h3>
	<br>
	<h2>wallet Balance</h2>
	<input type="button"id="wallet"value="AddMoney"/>
	</div>
	<div id ="details3">
	<div id="Acc">
	<h3>BankName:</h3>
	<h3>AccountNumber:</h3>
	<h3>IfscCode</h3>
	<h3>Balance</h3>
	<h3>Branch</h3>
	</div>
	
	<input  type="button"id="BankAccount"value="AddBankAccount"/>
	</div>
	</div>
	
</body>
</html>