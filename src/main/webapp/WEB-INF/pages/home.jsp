<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        .container {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 50%;
            text-align: center;
            margin-bottom: 20px;
        }
        h2 {
            color: #333;
        }
        form {
            text-align: left;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            font-weight: bold;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            background-color: #28a745;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #218838;
        }
        .update-container {
            background: #fff3cd;
            border: 1px solid #ffeeba;
        }
        .update-button {
            background-color: #007bff;
        }
        .update-button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <!-- Student Registration Form -->
    <div class="container">
        <h2>Student Registration</h2>
        <form action="registerStudent" method="POST">
            <div class="form-group">
                <label for="name">First Name:</label>
                <input type="text" id="name" name="name" required>
            </div>

            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" id="address" name="address" required>
            </div>

            <div class="form-group">
                <button type="submit">Register</button>
            </div>
        </form>
    </div>

    <!-- Update Student Form -->
    <div class="container update-container">
        <h2>Update Student</h2>
        <form action="updateStudent" method="POST">
            <div class="form-group">
                <label for="id">Student ID:</label>
                <input type="number" id="id" name="id" required>
            </div>

            <div class="form-group">
                <label for="name">New Name:</label>
                <input type="text" id="name" name="name" required>
            </div>

            <div class="form-group">
                <label for="address">New Address:</label>
                <input type="text" id="address" name="address" required>
            </div>

            <div class="form-group">
                <button type="submit" class="update-button">Update</button>
            </div>
        </form>
    </div>

</body>
</html>
