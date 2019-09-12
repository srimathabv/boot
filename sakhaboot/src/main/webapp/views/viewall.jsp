<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3 class="center-align">All Employees</h3><br><br><br>


<head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>

  <table>   
          <tr>
              <th>Employee ID</th>
              <th>Employee Name</th>
              <th>Employee age</th>
          </tr>
       
  <c:forEach items="${empList}" var="empl">
    <tr>
      <td>${empl.empId}</td>
      <td>${empl.empName}</td>
      <td>${empl.age}</td>
   
      </tr>
  </c:forEach>
</table>

</div>
