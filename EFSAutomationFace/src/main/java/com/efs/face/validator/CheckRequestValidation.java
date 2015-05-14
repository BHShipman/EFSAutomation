package com.efs.face.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.imc.efs.automation.service.EfsCheckRequest;

public class CheckRequestValidation implements Validator {

	private Pattern pattern;
	private Matcher matcher;
	
	String FLOAT_PATTERN = "[+]?\\d*\\.?\\d+";
	String ID_PATTERN = "[0-9]+";
	String STRING_PATTERN = "[a-zA-Z]+";
	
	public boolean supports(Class<?> arg0) {
		return false;
	}

	public void validate(Object target, Errors errors) {

		EfsCheckRequest request = (EfsCheckRequest) target;
		ValidationUtils.rejectIfEmpty(errors, "description", "required.description", "Description is required.");
		ValidationUtils.rejectIfEmpty(errors, "driverId", "required.driverId", "Driver Id is required.");
		ValidationUtils.rejectIfEmpty(errors, "driverName", "required.driverName", "Driver Name is required.");
		ValidationUtils.rejectIfEmpty(errors, "efsAmount", "required.efsAmount", "EFS Amount is required.");
		ValidationUtils.rejectIfEmpty(errors, "poWoNumber", "required.poWoNumber", "PoWoNumber is required.");
		ValidationUtils.rejectIfEmpty(errors, "truckId", "required.truckId", "Truck Id is required.");
		ValidationUtils.rejectIfEmpty(errors, "vendorId", "required.vendorId", "VendorId Id is required.");
		ValidationUtils.rejectIfEmpty(errors, "vendorName", "required.vendorName", "Vendor Name is required.");
		ValidationUtils.rejectIfEmpty(errors, "requester", "required.requester", "Requester is required.");
		
		if(String.valueOf(request.getEfsAmount()) != null){
			pattern = Pattern.compile(FLOAT_PATTERN);
			matcher = pattern.matcher(String.valueOf(request.getEfsAmount()));
			if(!matcher.matches()){
				errors.rejectValue("efsAmount", "efsAmount.incorrect", "Enter a numeric value");
			}
		}
		if(String.valueOf(request.getVendorId()) != null){
			pattern = Pattern.compile(ID_PATTERN);
			matcher=pattern.matcher(String.valueOf(request.getVendorId()));
			if(!matcher.matches()){
				errors.rejectValue("vendorId", "vendorId.incorrect", "Enter a numeric value");
			}
		}
		if(request.getCompany().compareTo("noSelection")==0){
			errors.rejectValue("company", "company.incorrect", "Choose a company");
		}
		
		
	}

}
