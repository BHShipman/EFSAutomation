package com.imc.efs.automation.bo.impl;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.commons.lang3.StringUtils;

import com.imc.efs.automation.bo.NotificationBO;
import com.imc.efs.automation.dao.DexDAO;
import com.imc.efs.automation.email.service.EmailServiceInvoker;
import com.imc.efs.automation.entities.Requests;

@Remote(NotificationBO.class)
@Stateless(name = "NotificationBO")
public class NotificationBOImpl implements NotificationBO {

	@EJB(beanName = "EmailService")
	private EmailServiceInvoker _mailer;
	@EJB(beanName = "DexDAO")
	private DexDAO _dex;

	public NotificationBOImpl() {
	}

	public NotificationBOImpl(EmailServiceInvoker mailer, DexDAO dex) {
		this._dex = dex;
		this._mailer = mailer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.imc.efs.automation.bo.impl.NotificationBO#sendIssuanceEmail(com.imc
	 * .efs.automation.entities.Requests, java.lang.String)
	 */
	@Override
	public void sendIssuanceEmail(Requests request, String moneyCode)
			throws Exception {
		List<String> to = new ArrayList<String>();
		// to.add("mcoolican@iils.com");
		// to.add("RBrower@iilogistics.com");
		to.add("bshipman@imccompanies.com");

		List<String> cc = null;
		// cc.add("driver_Services@IMCG.COM");

		String subject;
		if ((StringUtils.isNotEmpty(request.getPoWoNumber()) || request
				.getPoWoNumber() != null)) {
			subject = request.getRequestTypes().getName()
					+ "EFS Check Issuance Notice for "
					+ request.getPoWoNumber();
		} else if (request.getDriverId() != null) {
			subject = request.getRequestTypes().getName()
					+ "EFS Check Issuance Notice for Driver "
					+ request.getDriverId() + " " + request.getDriverName();
		} else {
			subject = request.getRequestTypes().getName()
					+ "EFS Check Issuance Notice";
		}

		String body = "<h3>"
				+ request.getRequester().toUpperCase()
				+ ",</h3><p>A money code, which can be found"
				+ " <a href=\"https://www.tch.com/security/logon.jsp\">here</a> with reference number <b>"
				+ request.getMoneyCodeReferenceNumber()
				+ "</b>, is ready to be issued to an appropriate driver/vendor.</p>"
				+ "<p>The money code is: <b>" + moneyCode + "</b></p>";

		_mailer.sendEmail(to, subject, body, cc, null);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.imc.efs.automation.bo.impl.NotificationBO#sendApprovalRequestEmail
	 * (com.imc.efs.automation.entities.Requests)
	 */
	@Override
	public String sendApprovalRequestEmail(Requests request) throws Exception {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(request.getPoWoNumber());
		matcher.find();
		int recordId = request.getRequestTypes().isIsOpsPortalType() ? request
				.getRequestId() : Integer.parseInt(matcher.group(0));
		List<String> filePaths = _dex.getDocumentFilePathsByRequestId(recordId,
				request.getRequestTypes().getDexProjectId());

		List<String> to = new ArrayList<String>();
//		 to.add("mcoolican@iils.com");
		// to.add("RBrower@iilogistics.com");
		to.add("bshipman@imccompanies.com");

		List<String> cc = null;
		// cc.add("driver_Services@IMCG.COM");

		String subject;
		if (StringUtils.isNotEmpty(request.getPoWoNumber())
				|| request.getPoWoNumber() != null) {
			subject = "Requesting approval for "
					+ request.getRequestTypes().getName() + " EFS Check for "
					+ request.getPoWoNumber() + ". Request #"
					+ request.getRequestId();
		} else if (request.getDriverId() != null) {
			subject = "Requesting approval for "
					+ request.getRequestTypes().getName()
					+ " EFS Check for Driver " + request.getDriverId() + " "
					+ request.getDriverName() + ". Request #"
					+ request.getRequestId();
		} else if (request.getVendorName() != null) {
			subject = "Requesting approval fo "
					+ request.getRequestTypes().getName()
					+ " EFS Check for Vendor " + request.getVendorName()
					+ ". Request #" + request.getRequestId();
		} else {
			subject = "Requesting approval for "
					+ request.getRequestTypes().getName()
					+ " EFS Check. Request #" + request.getRequestId();
		}
		boolean hasAttachments = false;
		if (filePaths != null) {
			hasAttachments = filePaths.size() > 0;
		}
		String body = getCheckRequestEmailBody(request, hasAttachments);

		_mailer.sendEmail(to, subject, body, cc, filePaths);

		String recipient = to.get(0);
		if (to.size() > 1) {
			for (int i = 1; i < to.size(); i++){
				recipient = recipient + ";" + to.get(i);
			}
		}
		return recipient;
	}

	public static String getCheckRequestEmailBody(Requests request,
			boolean hasAttachments) {
		StringBuilder message = new StringBuilder();

		message.append("<h3>EFS Check Request For "
				+ request.getRequestTypes().getName()
				+ "</h3>Please reply to this email with \"APPROVED\" or \"REJECTED\" included in the body.");

		NumberFormat amountFormat = NumberFormat.getCurrencyInstance(Locale.US);
		amountFormat.setMinimumFractionDigits(1);
		amountFormat.setMaximumFractionDigits(2);
		
		message.append("<br/><b>Request Date:</b> " + request.getRequestDate())
				.append("<br/><b>Amount:</b> " + amountFormat.format(request.getEfsAmount().setScale(2, RoundingMode.HALF_EVEN).doubleValue()))
				.append("<br/><b>Status:</b> "
						+ request.getStatus().getDescription().trim())
				.append("<br/><b>Requester:</b> "
						+ request.getRequester().trim())
				.append("<br/><b>Company:</b> " + request.getCompany().trim());

		if (StringUtils.isNotEmpty(request.getProNumber())
				|| request.getProNumber() != null)
			message.append("<br><b>Pro Number:</b> "
					+ request.getProNumber().trim());
		if (StringUtils.isNotEmpty(request.getPoWoNumber())
				|| request.getPoWoNumber() != null)
			message.append("<br><b>PO Number / WO Number:</b> "
					+ request.getPoWoNumber().trim());
		if (request.getServiceCharge() != null)
			message.append("<br><b>Service Charge:</b> $"
					+ request.getServiceCharge());
		if (StringUtils.isNotEmpty(request.getVendorName())
				|| request.getVendorName() != null)
			message.append("<br><b>VendorName:</b> "
					+ request.getVendorName().trim());
		if (StringUtils.isNotEmpty(request.getDriverId())
				|| request.getDriverId() != null)
			message.append("<br><b>Driver Id:</b> "
					+ request.getDriverId().trim());
		if (StringUtils.isNotEmpty(request.getTruckId())
				|| request.getTruckId() != null)
			message.append("<br><b>Truck Id:</b> "
					+ request.getTruckId().trim());
		if (StringUtils.isNotEmpty(request.getChassisNumber())
				|| request.getChassisNumber() != null)
			message.append("<br><b>Chassis Number:</b> "
					+ request.getChassisNumber().trim());
		if (StringUtils.isNotEmpty(request.getContainerNumber())
				|| request.getContainerNumber() != null)
			message.append("<br><b>Container Number:</b> "
					+ request.getContainerNumber().trim());

		if (hasAttachments)
			message.append("<br><br>The attached documents are related to this request.");

		return message.toString();

	}
}
