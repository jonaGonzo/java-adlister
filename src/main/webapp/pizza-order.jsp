<%--
  Created by IntelliJ IDEA.
  User: ijona
  Date: 3/10/23
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String toppings = request.getParameter("toppings");
        String address = request.getParameter("address");
    }
  response.sendRedirect("");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <div>
        <%-- Crust Selection --%>
        <label for="crust">Choose Crust: </label>
        <select id="crust" name="crust">
            <option value="thin">Thin</option>
            <option value="hand-tossed">Hand Tossed</option>
            <option value="chicago">Chicago</option>
            <option value="new-york">New York</option>
        </select><br>

        <%-- Sauce Selection --%>
        <label for="sauce">Choose Sauce: </label>
        <select id="sauce" name="sauce">
            <option value="regular">Regular</option>
            <option value="extra">Extra</option>
            <option value="wht-garlic-butter">White Garlic Butter</option>
            <option value="bbq">BBQ</option>
        </select><br>
        <%-- Size Selection --%>
        <label for="size">Choose Size: </label>
        <select id="size" name="size">
            <option value="sm-10">SM - 10"</option>
            <option value="md-12">MD - 12"</option>
            <option value="lg-14">LG - 14"</option>
            <option value="xl-18">XL - 18"</option>
        </select>
    </div>
    <div>
        <p>Toppings:</p>
        <input type="checkbox" id="mushrooms" name="mushrooms" value="vegetable">
        <label for="mushrooms"> Mushrooms</label><br>
        <input type="checkbox" id="blk-olives" name="blk-olives" value="vegetable">
        <label for="blk-olives"> Black Olives</label><br>
        <input type="checkbox" id="salami" name="salami" value="meat">
        <label for="salami"> Salami</label><br>
        <input type="checkbox" id="chicken" name="chicken" value="meat">
        <label for="chicken"> Chicken</label>
    </div>
    <br>
    <div>
        <label for="address">Enter Delivery Address:</label><br>
        <input type="text" id="address" name="address">
    </div>
</form>

</body>
</html>
