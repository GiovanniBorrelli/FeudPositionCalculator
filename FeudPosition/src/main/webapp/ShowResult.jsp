<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%  
   int ratio = (int) request.getAttribute("ratio");
   double ratioD = (double) request.getAttribute("ratioD");
   BigDecimal bd = new BigDecimal(ratioD).setScale(2, RoundingMode.HALF_UP);
   double val2 = bd.doubleValue();
   %>
<!DOCTYPE html>
<html>
   <%@ page contentType="text/html; charset=ISO-8859-1" import="java.util.*,Position.*,java.math.BigDecimal,java.math.RoundingMode" %>
   <head>
      <meta charset="ISO-8859-1">
      <link rel="stylesheet" href="style.css">
      <title>Results</title>
   </head>
   <body style = "background-color : #a3d6a1">
      <h1>EVALUATION BAR: <% out.println(val2 + "%");%> </h1>
      <div class="container">
         <div class="skills html"; style="width: ${ratio}%" >
            <div class="text"> ${ratio}%</div>
         </div>
      </div>
      <br> <br>
      <center>
         <% if( ratio < 50) {out.println("White is winning.");} else {out.println("Black is winning.");} 
            if( ratio < 30 && ratio > 70) {out.println("The difference is very low, both players can still win!");} 
            else {out.println("The difference is quite high, It may be difficult to overturn the match!");} 
            %>
      </center>
   </body>
</html>