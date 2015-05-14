<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function changeButtonText() {
		var elem = document.getElementById("requestButton");
		if (elem.value == "Request Check") {
			elem.value = "Requesting...";
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request Efs Check</title>
</head>
<body style="text-align: left;">
	<h3>Request EFS Check</h3>
	<div style="text-align: left">
		<form:form action="CheckRequested" method="POST" commandName="request">
			<table style="border: outset">
				<tr>
					<td><form:label path="company">Company:</form:label></td>
					<td><form:select path="company">
							<form:option value="noSelection" label="Select..." />
							<form:option value="ATEST" label="ATEST" />
							<form:option value="AIS" label="AIS" disabled="true" />
							<form:option value="IMC" label="NDS" disabled="true" />
							<form:option value="GIS" label="GIS" disabled="true" />
							<form:option value="DNJ" label="DNJ" disabled="true" />
							<form:option value="NDS" label="NDS" disabled="true" />
						</form:select></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="company" /></td>
				</tr>
				<tr>
					<td><form:label path="description">Description/Reason for request:</form:label></td>
					<td><form:input path="description" /></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="description" /></td>
				</tr>
				<tr>
					<td><form:label path="driverId">Driver Id:</form:label></td>
					<td><form:input path="driverId" /></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="driverId" /></td>
				</tr>
				<tr>
					<td><form:label path="driverName">Driver Name:</form:label></td>
					<td><form:input path="driverName" /></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="driverName" /></td>
				</tr>
				<tr>
					<td><form:label path="efsAmount">EFS Amount:</form:label></td>
					<td><form:input path="efsAmount" /></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="efsAmount" /></td>
				</tr>
				<tr>
					<td><form:label path="poWoNumber">PoWoNumber:</form:label></td>
					<td><form:input path="poWoNumber" /></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="poWoNumber" /></td>
				</tr>
				<tr>
					<td><form:label path="truckId">Truck ID:</form:label></td>
					<td><form:input path="truckId" /></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="truckId" /></td>
				</tr>
				<tr>
					<td><form:label path="vendorId">Vendor ID:</form:label></td>
					<td><form:input path="vendorId" /></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="vendorId" /></td>
				</tr>
				<tr>
					<td><form:label path="vendorName">Vendor Name:</form:label></td>
					<td><form:input path="vendorName" /></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="vendorName" /></td>
				</tr>
				<tr>
					<td><form:label path="requester">Requester:</form:label></td>
					<td><form:input path="requester" /></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="requester" /></td>
				</tr>
<!-- 				<tr> -->
<!-- 					<td><input type="file" name="file"></td> -->
<!-- 				</tr> -->
				<tr>
					<td><input id="requestButton" type="submit"
						value="Request Check" onclick="changeButtonText()"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>