<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Cart System</title>
    </head>
    <body style="background-color: grey">
        <h1 style="background-color:black;color:white;text-align: center;padding: 10px 6px">Welcome to <span style="color: cyan"> E-cart </span> fruit sellers!</h1>
        <form action="page3" method="POST" style="margin-left: 570px; font-size: 1.8rem; color: cyan; margin-top: 120px">
            Name: <input type="text" name="uname" required> <br>
            Age: <input type="number" name="uage" required><!-- comment --><br>
            Contact number: <input type="number" minlength="10" maxlength="10" name="ucontact" required><br>
            Address: <input type="textarea" name="uaddress" required> <br> <!-- comment -->
            Country: <input type="text" name="ucountry" required> <br>
            Your order: <br>
            
            Apple: <input type="number" name="uapple"><!-- comment --> <br>
            Orange: <input type="number" name="uorange"> <br>
            Watermelon: <input type="number" name="uwater"> <br>
            Muskmelon: <input type="number" name="umusk"><!-- comment --> <br>
            <input type="Submit" value="Generate Bill" style="margin-left: 130px; height: 40px; background-color: cyan; margin-top: 30px">
        </form>
        
    </body>
</html>
