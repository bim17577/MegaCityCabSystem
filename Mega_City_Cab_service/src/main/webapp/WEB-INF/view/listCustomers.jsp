<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>List Customers</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style>
        .container {
            margin-top: 50px;
        }
        .table {
            margin: auto;
            width: 80%;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="text-center">Customer List</h1>
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <tr class="table-dark">
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Address</th>
                    <th>Phone Number</th>
                    <th>NIC</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="customer" items="${customers}">
                    <tr>
                        <td>${customer.customerId}</td>
                        <td>${customer.name}</td>
                        <td>${customer.email}</td>
                        <td>${customer.address}</td>
                        <td>${customer.phonenumber}</td>
                        <td>${customer.nic}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div class="text-center">
            <a href="customer?action=add" class="btn btn-primary">Add New Customer</a>
        </div>
    </div>
</body>
</html>
