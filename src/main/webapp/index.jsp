<%-- 
    Document   : index.jsp
    Created on : Feb 5, 2017, 9:32:39 PM
    Author     : Mike
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSTL and EL Examples</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="index.css">
    </head>
    <body>
        <div class="contentContainer">
            <h2>JSTL Example 1 and 2; EL Example 1</h2>
            <p>
                The following form will take four classes, pass them to the controller, and get an object back.
                Using c:foreach we will loop through and display them using c:out along with loading them by using objectname.property.
            </p>

            <div>
                <form id="rectForm" name="rectForm" method="POST" action="SchoolInformationController">
                    <p>
                        <label for="lengthString">Class 1: </label>
                        <input type="text" name="classOneString" id="lengthString">
                    </p>
                    <p>
                    <label for="widthString">Class 2: </label>
                    <input type="text" name="classTwoString" id="widthString">
                    </p>
                    <p>
                    <label for="widthString">Class 3: </label>
                    <input type="text" name="classThreeString" id="widthString">
                    </p>
                    <p>
                    <label for="widthString">Class 4: </label>
                    <input type="text" name="classFourString" id="widthString">
                    </p>
                    <input type="submit" value="Generate">
                </form>
            </div>
            <h4>Classes Entered</h4>
            <ul>
                <c:forEach items="${classes}" var="class">
                    <li style="list-style: none"><c:out value="${class.name}"/></li>
                </c:forEach>
            </ul>
            
            <h2>JSTL Example 3</h2>
            <p>
                The following link will take you to a page using c:import.<br>
                <a href="externalExample.jsp">Click Here</a>
            </p>
            
            <h2>EL Example 2 and 3</h2>
            <p>
                By using an c:if test we can use if logic in our jsp page. For this example
                we will be checking if we be the word Java is in the first class name we entered.
                We are also setting the first class name to a variable using c:set
                <c:set var="className" value="${classes[0].name}"/>
                <c:if test="${fn:contains(className, 'Java')}">
                   <p>Yep! First class is Java!<p>
                </c:if>
            </p>
        </div>
    </body>
</html>
