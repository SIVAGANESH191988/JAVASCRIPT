<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	#btn{
		
		display:flex;
		flex-direction: row;
	    padding:350px;
	    justify-content:center;
	  
	    
	}
	.a{
		height: 50px;
		width:100px;
		margin-right: 16px;
		
		
	}
	
</style>
</head>
<body>
	<h2 style="text-align: center;">Welcome to paymentsCLI</h2>
	<div id="btn">
	 <a href="BankAccount.jsp">
          <button class="a">Add bank account</button>
          </a>
           <button class="a">Transaction</button>
            <button class="a">Wallet</button>
             <button class="a">Check Balance</button>
              <button class="a">Bank Account List</button>
              <a href="http://localhost:8080/PaymentsWebApp/LogoutServelet">
          <button class="a">logout</button>
          </a>
    
</body>
</html>