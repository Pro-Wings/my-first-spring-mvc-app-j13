<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<html>
<head>
    <title>Student Registration</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h2>Student Registration Form</h2>
    <form action="/student" method="POST">
        <div class="form-group">
            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="firstName" required>
        </div>
        <div class="form-group">
            <label for="lastName">Address:</label>
            <input type="text" id="address" name="address" required>
        </div>
        <div class="form-group">
            <button type="submit">Register</button>
        </div>
    </form>
</body>
</html>
