<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request Efs Check</title>
</head>
<body style="text-align: left;">
	<h3>Request EFS Check</h3>
	<div style="text-align: left">
		<form:form action="CheckRequested" method="POST" commandName="request">
			<table style="border: outset">

				<tr>
					<td><form:label path="requestTypeId">RequestType:</form:label></td>
					<td><form:select path="requestTypeId" disabled="true">
							<form:option value="0" label="Select..." />
							<form:option value="1" label="Roadside Repair" />
							<form:option value="2" label="MyTruck Repair" />
							<form:option value="3" label="FRS Repair" />
						</form:select></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="requestTypeId" /></td>
				</tr>
				<tr>
					<td><form:label path="company">Company:</form:label></td>
					<td><form:select path="company" disabled="true">
							<form:option value="noSelection" label="Select..." />
							<form:option value="ATEST" label="ATEST" />
							<form:option value="AIS" label="AIS" />
							<form:option value="IMC" label="NDS" />
							<form:option value="GIS" label="GIS" />
							<form:option value="DNJ" label="DNJ" />
							<form:option value="NDS" label="NDS" />
						</form:select></td>
					<td style="color: red; font-style: italic;"><form:errors
							path="company" /></td>
				</tr>
				<tr>
					<td><form:label path="description">Description/Reason for request:</form:label></td>
					<td><form:input path="description" disabled="true" /></td>
				</tr>
				<tr>
					<td><form:label path="driverId">Driver Id:</form:label></td>
					<td><form:input path="driverId" disabled="true" /></td>
				</tr>
				<tr>
					<td><form:label path="driverName">Driver Name:</form:label></td>
					<td><form:input path="driverName" disabled="true" /></td>
				</tr>
				<tr>
					<td><form:label path="efsAmount">EFS Amount:</form:label></td>
					<td><form:input path="efsAmount" disabled="true" /></td>
				</tr>
				<tr>
					<td><form:label path="poWoNumber">PoWoNumber:</form:label></td>
					<td><form:input path="poWoNumber" disabled="true" /></td>
				</tr>
				<tr>
					<td><form:label path="truckId">Truck ID:</form:label></td>
					<td><form:input path="truckId" disabled="true" /></td>
				</tr>
				<tr>
					<td><form:label path="vendorId">Vendor ID:</form:label></td>
					<td><form:input path="vendorId" disabled="true" /></td>
				</tr>
				<tr>
					<td><form:label path="vendorName">Vendor Name:</form:label></td>
					<td><form:input path="vendorName" disabled="true" /></td>
				</tr>
				<tr>
					<td><form:label path="requester">Requester:</form:label></td>
					<td><form:input path="requester" disabled="true" /></td>
				</tr>

			</table>
		</form:form>
	</div>
	<div style="text-align: left">
		<h2>Money Code</h2>
		<table style="border: outset">
			<tr>
				<td>Message:</td>
				<td><b>${responseMessage}</b></td>
			</tr>
			<tr>
				<td>MoneyCode:</td>
				<td><b>${moneyCode}</b></td>
			</tr>
			<tr>
				<td>Reference Number:</td>
				<td><b>${referenceNumber}</b></td>
			</tr>
		</table>


	</div>
</body>
</html>