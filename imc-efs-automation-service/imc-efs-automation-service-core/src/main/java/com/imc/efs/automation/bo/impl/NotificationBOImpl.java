package com.imc.efs.automation.bo.impl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.imc.efs.automation.bo.NotificationBO;
import com.imc.efs.automation.dao.impl.DexDAOImpl;
import com.imc.efs.automation.dao.impl.MailerDAOImpl;
import com.imc.efs.automation.entities.Requests;

public class NotificationBOImpl implements NotificationBO {

	private MailerDAOImpl _mailer;
	private DexDAOImpl _dex;

	public NotificationBOImpl() {
	}

	public NotificationBOImpl(MailerDAOImpl mailer, DexDAOImpl dex) {
		this._dex = dex;
		this._mailer = mailer;
	}

	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.NotificationBO#sendIssuanceEmail(com.imc.efs.automation.entities.Requests, java.lang.String)
	 */
	@Override
	public String sendIssuanceEmail(Requests request, String moneyCode) {
		String to = "mcoolican@iils.comRBrower@iilogistics.com";

		String cc = null;
		// cc = "driver_Services@IMCG.COM";

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

		_mailer.sendEmail(to, subject, body, cc);

		return to;
	}

	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.NotificationBO#sendApprovalRequestEmail(com.imc.efs.automation.entities.Requests)
	 */
	@Override
	public String sendApprovalRequestEmail(Requests request) {
		Pattern pattern = Pattern.compile("@\\d+");
		Matcher matcher = pattern.matcher(request.getPoWoNumber());
		int recordId = request.getRequestTypes().isIsOpsPortalType() ? request
				.getRequestId() : Integer.parseInt(matcher.group(1));
		List<String> filePaths = _dex.getDocumentFilePathsByRequestId(recordId,
				request.getRequestTypes().getDexProjectId());

		String to = "mcoolican@iils.com;RBrower@iilogistics.com";

		String cc = null;
		// cc = "Driver_Services@IMCG.COM

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

		boolean hasAttachments = filePaths.size() > 0;
		String body = getCheckRequestEmailBody(request, hasAttachments);

		_mailer.sendEmail(to, subject, body, cc, filePaths);

		return to;
	}

	public static String getCheckRequestEmailBody(Requests request,
			boolean hasAttachments) {
		StringBuilder message = new StringBuilder();

		message.append("<h3>EFS Check Request For "
				+ request.getRequestTypes().getName()
				+ "</h3>Please reply to this email with \"APPROVED\" or \"REJECTED\" included in the body.");

		message.append("<br/><b>Request Date:</b> " + request.getRequestDate())
				.append("<br/><b>Amount:</b> $" + request.getEfsAmount())
				.append("<br/><b>Status:</b> "
						+ request.getStatus().getDescription())
				.append("<br/><b>Requester:</b> " + request.getRequester())
				.append("<br/><b>Company:</b> " + request.getCompany());

		if (StringUtils.isNotEmpty(request.getProNumber())
				|| request.getProNumber() != null)
			message.append("<br><b>Pro Number:</b> " + request.getProNumber());
		if (StringUtils.isNotEmpty(request.getPoWoNumber())
				|| request.getPoWoNumber() != null)
			message.append("<br><b>PO Number / WO Number:</b> "
					+ request.getPoWoNumber());
		if (request.getServiceCharge() != null)
			message.append("<br><b>Service Charge:</b> $"
					+ request.getServiceCharge());
		if (StringUtils.isNotEmpty(request.getVendorName())
				|| request.getVendorName() != null)
			message.append("<br><b>VendorName:</b> " + request.getVendorName());
		if (StringUtils.isNotEmpty(request.getDriverId())
				|| request.getDriverId() != null)
			message.append("<br><b>Driver Id:</b> " + request.getDriverId());
		if (StringUtils.isNotEmpty(request.getTruckId())
				|| request.getTruckId() != null)
			message.append("<br><b>Truck Id:</b> " + request.getTruckId());
		if (StringUtils.isNotEmpty(request.getChassisNumber())
				|| request.getChassisNumber() != null)
			message.append("<br><b>Chassis Number:</b> "
					+ request.getChassisNumber());
		if (StringUtils.isNotEmpty(request.getContainerNumber())
				|| request.getContainerNumber() != null)
			message.append("<br><b>Container Number:</b> "
					+ request.getContainerNumber());

		if (hasAttachments)
			message.append("<br><br>The attached documents are related to this request.");

		return message.toString();

	}
}
