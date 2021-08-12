<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.sql.Timestamp" %>



<!doctype html>
<html lang="en">
<head>
<%--    <link rel="stylesheet" type="text/css"--%>
<%--          href="${pageContext.request.contextPath}/css/style.css"/>--%>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="//ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/jquery-ui.min.js"></script>
    <link rel="stylesheet" href="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/themes/sunny/jquery-ui.css">
    <style> <%@include file="resources/style.css" %> </style>

    <title>EMPLOYEES</title>
</head>
<body>

<%--${employee}--%>
<div id="dialog" class="dialog" title="Add Employee">
    <form>
        <div class="form-group col-auto row ">
            <label for="tz">TZ</label>
            <div id="id">
                <input type="number" class="form-control" id="tz" placeholder="An identification number">
            </div>
        </div>
        <div class="form-group col-auto row">
            <label for="name" class="col-form-label">Name</label>
            <div>
                <input name="name" type="text" class="form-control" id="name" placeholder="Name">
            </div>
        </div>
        <div class="form-group col-auto row">
            <label for="secondName" class="col-form-label">Surname</label>
            <div class="">
                <input type="text" class="form-control" id="secondName" placeholder="Surname">
            </div>
        </div>
        <div class="form-group col-auto row">
            <label for="startWork" class=" col-form-label">Date start</label>
            <div class="">
                <input type="date" class="form-control" id="startWork" placeholder="date of commencement of work">
            </div>
        </div>
        <div class="form-group col-auto row">
            <label for="birthday" class=" col-form-label">Birthday</label>
            <div class="">
                <input type="date" class="form-control" id="birthday" placeholder="Date of Birth">
            </div>
        </div>
    </form>
</div>

<!--<button style="background-color: grey" id="show">Add user</button>-->


<div class="card">
    <div style="text-align: center" class="card-body"><H2> Employee`s table</H2>
        <table id="employeesTable" class="table table-responsive-sm table-striped table-bordered" width="100%">
            <thead>
            <tr style="align-content: center">
                <%--                <th scope="col" style="display:none">ID</th>--%>
                <th scope="col" style="width: 0%"></th>
                <th scope="col">TZ</th>
                <th scope="col">Name</th>
                <th scope="col">Surname</th>
                <th scope="col">Date of Birth</th>
                <th scope="col">Seniority</th>

                <th scope="col">Action</th>
            </tr>
            </thead>
            <c:forEach items="${employees}" var="employee">
                <tbody>

                <tr>
                    <td>
                    <th scope="col">${employee.tz}</th>
                    <th scope="col">${employee.name}</th>
                    <th scope="col">${employee.lastName}</th>
                    <th scope="col">${employee.birthday}</th>
                    <th scope="col">${employee.workExperience}</th>
                    <th scope="col">
                        <button onclick="deleteEmployee(${employee.tz})" class="delete-button">DELETE</button>
                    </th>
                    </td>
                </tr>
                </tbody>
            </c:forEach>
        </table>
    </div>

    <button class="btn-add-employee" style="width: 32% ;margin-left: auto; display: block" id="show">Add user</button>

    <%--    <%--%>
    <%--        java.text.DateFormat df = new java.text.SimpleDateFormat(--%>
    <%--            "HH:mm:ss:SS z MM/dd/yyyy");--%>
    <%--        LocalDateTime cal = LocalDateTime.now();--%>
    <%--    %>--%>

    <%--    <h1 id="timer" class="timer" >--%>
    <%--&lt;%&ndash;        Timestamp.valueOf(localDateTime)&ndash;%&gt;--%>
    <%--        <%=Timestamp.valueOf(LocalDateTime.now())%>--%>

    <%--        <%=LocalDateTime.now().toString()%>--%>
    <%--    </h1>--%>

    <!-- //end of first card body-->
    <div class="card-body">
        <footer id="footer" class="footer">
            <div class="container">
                <div class="row">
                    <div id="ip" class="col-md"><span class="text-muted ">Ip address of client: </span></div>
                    <div class="col-md text-md-right"><span>
                        Timer:  <span id="timer" class="timer"><%=Timestamp.valueOf(LocalDateTime.now())%></span></span>
                    </div>
                </div>
            </div>
        </footer>

    </div>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
<script type="text/javascript" charset="utf8"
        src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>
<script src="${pageContext.request.contextPath}/js/i.js"></script>
<%--<script type="text/javascript" src="<c:url value="js/i.js"/>"></script>--%>
</body>
</html>
