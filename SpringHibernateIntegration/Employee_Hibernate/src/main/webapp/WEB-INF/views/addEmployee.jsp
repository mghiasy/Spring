<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Valued Employees</h1>
				<p>Add a new one
				<p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="newEmployee" class="form-horizontal"
			action="add" method="post">>
			<fieldset>
				<legend>Add new employee</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div" />
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="employeeNumber">
						Employee Number</label>
					<div class="col-lg-10">
						<form:input id="employeeNumber" path="employeeNumber" type="text"
							class="form:input-large" />
						<form:errors path="employeeNumber" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="firstName">First
						Name</label>
					<div class="col-lg-10">
						<form:input id="firstName" path="firstName" type="text"
							class="form:input-large" />
						<form:errors path="firstName" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="lastName">Last
						Name</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="lastName" path="lastName" type="text"
								class="form:input-large" />
							<form:errors path="lastName" cssClass="text-danger" />
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="age">Age</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="age" path="age" type="text"
								class="form:input-large" />
							<form:errors path="age" cssClass="text-danger" />
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="title">Title</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="title" path="title" type="text"
								class="form:input-large" />
							<form:errors path="title" cssClass="text-danger" />
						</div>
					</div>
				</div>
				<lable>Address info:-------</lable>
				<div class="form-group">
					<label class="control-label col-lg-2" for="street">Street : </label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="street" path="address.street" type="text"
								class="form:input-large" />
							<form:errors path="address.street" cssClass="text-danger" />
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="city">City : </label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="city" path="address.city" type="text"
								class="form:input-large" />
							<form:errors path="address.city" cssClass="text-danger" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="state">State : </label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="state" path="address.state" type="text"
								class="form:input-large" />
							<form:errors path="address.state" cssClass="text-danger" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="zipcode">ZipCode : </label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="zipcode" path="address.zipCode" type="text"
								class="form:input-large" />
							<form:errors path="address.zipCode" cssClass="text-danger" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Add" />
					</div>
				</div>

			</fieldset>
		</form:form>
	</section>
</body>
</html>
