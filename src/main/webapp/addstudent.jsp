<%-- 
    Document   : addstudent
    Created on : Jul 9, 2023, 9:45:46 PM
    Author     : dvan2301
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
<title>ADD STUDENT</title>
 
<style>
    html{
        background-color: rgb(165, 143, 121); 
    }
</style>

</head>
 
<body>
<h3 style="text-align: center;"> ADD STUDENT FORM</h3>
<form action="add" method="POST">
    

 
<table align="center" cellpadding = "10">
    <!----- ID ---------------------------------------------------------->
    <tr>
<td>ID</td>
<td><input type="text" name="id" maxlength="30" required/>

</td>
</tr>
 
<!-----full name ---------------------------------------------------------->
<tr>
<td>FULL NAME</td>
<td><input type="text" name="full_name" maxlength="30" required/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<!-----password ---------------------------------------------------------->
<tr>
<td>Pass Word</td>
<td><input type="text" name="password" maxlength="30" required/>

</td>
</tr>
 
 

<!----- Email ---------------------------------------------------------->
<tr>
<td>EMAIL</td>
<td><input type="email" name="email" maxlength="100" required/></td>
</tr>
 
<!----- Phone Number ---------------------------------------------------------->
<tr>
<td>PHONE NUMBER</td>
<td>
<input type="number" name="phone_number" maxlength="10" required/>
(10 digit number)
</td>
</tr>
 
<!----- Gender ----------------------------------------------------------->
<tr>
<td>GENDER</td>
<td>
Male <input type="radio" name="gender" value="Male" required />
Female <input type="radio" name="gender" value="Female" required/>
</td>
</tr>
 
<!----- Address ---------------------------------------------------------->
<tr>
<td>ADDRESS <br /><br /><br /></td>
<td><textarea name="address" rows="4" cols="30"></textarea></td>
</tr>
 

<!----- Submit and Reset ------------------------------------------------->
<tr>
<td colspan="2" align="center">
<input formaction="add"  type="submit" value="Submit">

<input type="reset" value="Reset">


</td>
</tr>
</table>
 
</form>
 
</body>
</html>