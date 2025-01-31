<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Student Management System</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">
			<h1 class="text-center">Create new Student</h1>
			<div class="card-body">
				<form th:action="@{/students}" th:object="${student}" method="POST">
					<div class="form-group">
						<label>Student First Name</label>
						<input type="text" name="firstName" th:field="firstName" class="form-control"
						placeholder="Enter Student First Name"/>
					</div>
					<div class="form-group">
						<label>Student Last Name</label>
						<input type="text" name="lastName" th:field="lastName" class="form-control"
						placeholder="Enter Student Last Name"/>
					</div>
					<div class="form-group">
						<label>Student Email Id</label>
						<input type="text" name="email" th:field="email" class="form-control"
						placeholder="Enter Student Email"/>
					</div>
					<div class="box-footer">
						<button type="submit" class="btn btn-primary">
							Submit
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
</div>

</body>
</html>