package com.efs.face.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.efs.face.validator.CheckRequestValidation;
import com.imc.efs.automation.service.EFSAutomationServiceBean;
import com.imc.efs.automation.service.EfsCheckRequest;
import com.imc.efs.automation.service.EfsMoneyCode;
import com.imc.efs.automation.service.Exception_Exception;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index() {

		return "index/index";
	}

	@RequestMapping(value = "/RequestEfsCheck")
	public String requestEfsCheck(Model model) {

		model.addAttribute("request", new EfsCheckRequest());

		return "CheckRequest";
	}

	@RequestMapping(value = "/CheckRequested")
	public String checkRequested(
			@ModelAttribute("request") EfsCheckRequest request,
			BindingResult result, Model model) {
		CheckRequestValidation validation = new CheckRequestValidation();

		validation.validate(request, result);

		if (result.hasErrors()) {
			return "CheckRequest";
		}

		
		request.setPass("myTruck123");
		request.setUser("myTruck");
//		request.setPathToInvoice("C://temp//testpdf.pdf");
		request.setFile(null);

		EFSAutomationServiceBean service = new EFSAutomationServiceBean();
		EfsMoneyCode moneyCodeResponse = null;
		try {
			moneyCodeResponse = service.efsAutoService.requestEfsCheck(request);
		} catch (Exception_Exception e) {
			if (e.getLocalizedMessage()
					.substring(0, 3)
					.compareTo(
							"com") == 0) {
				model.addAttribute("responseMessage", e.getLocalizedMessage()
						.substring(51));
			} else {
				model.addAttribute("responseMessage", e.getLocalizedMessage());
			}
			return "CheckResponse";
		}

		model.addAttribute("responseMessage", moneyCodeResponse.getMessage());
		model.addAttribute("moneyCode", moneyCodeResponse.getMoneyCode());
		model.addAttribute("referenceNumber", moneyCodeResponse.getReferenceNumber());

		return "CheckResponse";
	}

}
