<html>
    <head>
        <title>
         HomePage 
        </title>

<style>
    body{
        font-family: 'Times New Roman', Times, serif ;
        background-color: aliceblue;
    }
#Header{
display: flex;
flex-direction: column;
align-items: center;
}

.details{
    width: 300px;
    padding: 20px;
    background-color: white;
    margin: 0 auto;
    margin-top: 100px;
    border: 1px solid black;
    border-radius: 4px;
}

input[type=text], input[type=password], input[type=tel] {
    width: 100%;
    padding: 20px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
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
        <div id="Header">
            <h1>Welcome To Payments WebApp</h1>
        </div>
       
        <form action="http://localhost:8080/PaymentsWebApp//Loginservelet"method="post">
            <div class="details">
                <label for="Phone"><b>Phone Number</b></label>
                <input type="tel"placeholder="Phone Number"name="phno"/>
    
                <label for"username"><b>Username</b></label>
                <input type="text"placeholder="username"/>
    
                <label for="password"><b>Password</b></label>
                <input type="text"placeholder="password"name="pass"/>
                <div style="text-align: center;">
                    <button class = "btn ">
                        <type="submit>Login</button>
                </div>
               
             
              
            </div>

        </form>
        <div style="text-align: center;">
            <a href="Registration.jsp">
            <button id= "reg">
                <type="submit>Register</button>
                </a>
        </div>
       
       
    </body>
</html>