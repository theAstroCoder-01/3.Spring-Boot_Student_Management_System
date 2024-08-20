<!DOCTYPE html>
<html>

<body>

<h1>Spring-Boot_2.-Student_Management_System</h1>

<p><strong>Student Management System</strong> is a REST API with CRUD operations that allows the user to Create, Read, Update, and Delete any kind of student. This API has an ADD STUDENT function
to save a new student in MySQL database to be shown in the List of Students.
  
<h2>Index</h2>

<ol>
   <li><a href="#classes">Classes</a>
        <ul>
            <li><a href="#studentmanagementsystemapplication">StudentManagementSystemApplication</a></li>
            <li><a href="#student">Student</a></li>
            <li><a href="#studentcontroller">StudentController</a></li>
            <li><a href="#studentrepository">StudentRepository</a></li>
            <li><a href="#studentservice">StudentService</a></li>
            <li><a href="#studentserviceimpl">StudentServiceImpl</a></li>
        </ul>
    </li>
</ol>

<h2 id="classes">Classes</h2>

<h3 id="studentmanagementsystemapplication">AppLauncher</h3>
<p>The <code>StudentManagementSystemApplication</code> class contains the main method that runs the Spring Boot application.</p>

<h3 id="student">Student</h3>
<p>The <code>Student</code> class stores the data that maps to database tables. In this case the <code>Student</code> class corresponds to a table in MySQL, and its fields (id, firstName, lastName, email) correspond to the columns in that table. </p>

<h3 id="studentcontroller">StudentController</h3>
<p>The <code>studentcontroller</code>class will handles HTTP requests which define the endpoints of the API. Also, it uses service classes to perform business logic.

<h3 id="studentrepository">StudentRepository</h3>
<p>The <code>studentrepository</code> interface extends JpaRepository and provides methods for CRUD operations inside the API REST.  
  
<h3 id="studentservice(+Impl)">StudentService(+Impl)</h3>
<p>The <code>studentservice</code> class interacts directly with the <code>StudentRepository</code>. In here we can define methods to handle the CRUD operations related to entities defined in the <code>Student</code> class.</p>

</body>

</html>

![101](https://github.com/user-attachments/assets/42e59df4-b589-475e-828b-2ebae759ff3d)

![102](https://github.com/user-attachments/assets/4a60e935-183e-4262-a3f6-76fc8d5006d1)







