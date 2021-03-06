<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="java.net.InetAddress" %>
<%@ page import="java.time.LocalDate" %>


<!doctype html>
<html lang="en">
<head>
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

<div class="dialog"></div>
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLongTitle">Add employee</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form id="sendForm" action="insert" method="post">
                    <div class="form-group ">
                        <label for="tz">TZ (min 4 symbols)</label>
                        <div id="id">
                            <input required min="1000" name="tz" type="number" class="form-control" id="tz"
                                   placeholder="An identification number">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="name" class="col-form-label">Name</label>
                        <div>
                            <input required name="name" type="text" class="form-control" id="name" placeholder="Name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="lastName" class="col-form-label">Surname</label>
                        <div class="">
                            <input required name="lastName" type="text" class="form-control" id="lastName" placeholder="Surname">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="startWork" class=" col-form-label">Date start</label>
                        <div class="">
                            <input required max="<%=LocalDate.now()%>" name="startWork" type="date" class="form-control" id="startWork"
                                   placeholder="date of commencement of work">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="birthday" class=" col-form-label">Birthday (age of employee min 15 years old)</label>
                        <div class="">
                            <input required type="date" max="<%=LocalDate.now().minusYears(15)%>" name="birthday"  class="form-control" id="birthday"
                                   placeholder="Date of Birth">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn-add-employee" data-dismiss="modal">Cancel</button>
                <button type="submit" class="btn-add-employee" form="sendForm" class="btn btn-primary">Save employee</button>
            </div>
        </div>
    </div>
</div>
</div>


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
                        <a class="delete-button" href="delete?tz=<c:out value='${employee.tz}' />">Delete</a>
                    </th>
                    </td>
                </tr>
                </tbody>
            </c:forEach>
        </table>
    </div>
    <button class="btn-add-employee" data-toggle="modal" data-target="#exampleModalCenter"
            style="width: 32% ;margin-left: auto; display: block">Add employee
    </button>
    <div class="card-body">
        <footer id="footer" class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-md"><span
                        class="text-muted ">Ip address of client: <%=InetAddress.getLocalHost().getHostAddress()%>
                    </span></div>
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
<script type="text/javascript" src="j.jsp"></script>
</body>
</html>

