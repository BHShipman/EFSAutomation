package com.imc.bnsfworkorder.process;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import net.sf.flatpack.DataSet;
import net.sf.flatpack.DefaultParserFactory;
import net.sf.flatpack.Parser;

import com.imc.bnsfworkorder.model.*;

public class ParseBNSFWorkOrder {

	public BNSFHeader processFlatFile(File flatFile) throws Exception {

		InputStream mapping = getDefaultMapping();

		System.out.println("parsing file: " + flatFile.getName());
		return parseFile(mapping, flatFile);

	}

	public InputStream getDefaultMapping() {
		return getClass().getResourceAsStream(
				"/PEOPLE-FixedLengthWithHeaderTrailer.pzmap.xml");
	}

	@SuppressWarnings({ "deprecation", "rawtypes" })
	private BNSFHeader parseFile(final InputStream mapping, final File data)
			throws Exception {

		Parser pzparser = DefaultParserFactory.getInstance()
				.newFixedLengthParser(mapping, new FileInputStream(data));

		pzparser.setHandlingShortLines(true);
		pzparser.setIgnoreParseWarnings(true);

		final DataSet ds = pzparser.parse();

		BNSFJobDetail jobDetail = null;
		BNSFHeader header = null;

		List<BNSFJobDetail> jobDetails = new ArrayList<BNSFJobDetail>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		while (ds.next()) {

			if (ds.isRecordID("header")) {
				System.out.println("found header");
				header = new BNSFHeader();
				header.setRecType(ds.getString("REC_TYPE").trim());
				header.setRecIndicator(ds.getString("REC_INDICATOR").trim());
				header.setPatronNbr(ds.getString("PATRON_NBR").trim());
				header.setInvoiceNbr(ds.getString("INVOICE_NBR").trim());
				header.setPoNbr(ds.getString("PO_NBR").trim());
				header.setWoNbr(ds.getString("WO_NBR").trim());
				header.setCompleteDate(format.parse(ds.getString("COMPLETE_DT")
						.trim()));
				header.setMechanic(ds.getString("MECHANIC").trim());
				header.setVendorName(ds.getString("VENDOR_NAME").trim());
				header.setPayableAmt(Float.valueOf(ds.getString("PAYABLE_AMT")
						.substring(0, 3)
						+ "."
						+ ds.getString("PAYABLE_AMT").substring(3,
								ds.getString("PAYABLE_AMT").length())));
				header.setEqpInit(ds.getString("EQP_INIT").trim());
				header.setEqpNumb(ds.getString("EQP_NUMB").trim());
				header.setAtchInit(ds.getString("ATCH_INIT").trim());
				header.setAtchNumb(ds.getString("ATCH_NUMB").trim());
				header.setMainResp(ds.getString("MAINT_RESP").trim());
				header.setOwnerAbbr(ds.getString("OWNER_ABBR").trim());
				header.setDriverName(ds.getString("DRIVER_NAME").trim());
				header.setDriverLicense(ds.getString("DRIVER_LICENSE").trim());
				header.setLoadEmpty(ds.getString("LOAD_EMPTY").trim());
				header.setCarKndAbbr(ds.getString("CAR_KND_ABBR").trim());
				header.setLength(ds.getString("LENGTH").trim());
				header.setStn333(ds.getString("STN_333").trim());
				header.setStnSt(ds.getString("STN_ST").trim());
				header.setRepairLocCity(ds.getString("REPAIR_LOC_CITY").trim());
				header.setRepairLocSt(ds.getString("REPAIR_LOC_ST").trim());
				header.setComposition(ds.getString("COMPOSITION").trim());
				header.setYearBuilt(ds.getString("YEAR_BUILT").trim());
				header.setManufacturer(ds.getString("MANUFACTURER").trim());
				header.setNbrDetails(ds.getString("NBR_DETAILS").trim());
				header.setInspect(Boolean.valueOf(ds.getString("INSPECT")
						.trim()));
				header.setTotalLaborHrs(Float.valueOf(ds.getString(
						"TOTAL_LABOR_HOURS").substring(0, 3)
						+ "."
						+ ds.getString("TOTAL_LABOR_HOURS").substring(3,
								ds.getString("TOTAL_LABOR_HOURS").length())));
			}

			if (ds.isRecordID("jobCode")) {
				System.out.println("found job detail");
				jobDetail = new BNSFJobDetail();
				jobDetail.setJobCodefiller(ds.getString("JOB_CODE_FILLER")
						.trim());
				jobDetail.setJobCode(ds.getString("JOB_CODE").trim());
				jobDetail.setWhyMade(ds.getString("WHY_MADE").trim());
				jobDetail.setCondCode(ds.getString("COND_CODE").trim());
				jobDetail.setLocation(ds.getString("LOCATION").trim());
				jobDetail.setQuantity(ds.getString("QUANTITY").trim());
				jobDetail.setRepairSize(ds.getString("REPAIR_SIZE").trim());
				jobDetail.setDefectSize(ds.getString("DEFECT_SIZE").trim());
				jobDetail.setDotON(ds.getString("DOT_ON").trim());
				jobDetail.setDotOFF(ds.getString("DOT_OFF").trim());
				jobDetail.setDotrON(ds.getString("DOTR_ON").trim());
				jobDetail.setDotrOFF(ds.getString("DOTR_OFF").trim());
				jobDetail.setBrandON(ds.getString("BRAND_ON").trim());
				jobDetail.setBrandOFFNew(ds.getString("BRAND_OFF_NEW").trim());
				jobDetail.setBrandOffJobCodeExt(ds.getString(
						"BRAND_OFF_JOB_CODE_EXT").trim());
				jobDetail.setTax(Float.valueOf(ds.getString("TAX").substring(0,
						5)
						+ "."
						+ ds.getString("TAX").substring(5,
								ds.getString("TAX").length())));
				jobDetail.setLaborCharge(Float.valueOf(ds.getString(
						"LABOR_CHARGE").substring(0, 5)
						+ "."
						+ ds.getString("LABOR_CHARGE").substring(5,
								ds.getString("LABOR_CHARGE").length())));
				jobDetail.setMaterialCharge(Float.valueOf(ds.getString(
						"MATERIAL_CHARGE").substring(0, 5)
						+ "."
						+ ds.getString("MATERIAL_CHARGE").substring(5,
								ds.getString("MATERIAL_CHARGE").length())));
				jobDetail.setPrice(Float.valueOf(ds.getString("PRICE")
						.substring(0, 5)
						+ "."
						+ ds.getString("PRICE").substring(5,
								ds.getString("PRICE").length())));
				jobDetail.setRailMatl(ds.getString("RAIL_MATL").trim());
				jobDetail.setNbrMechanics(Float.valueOf(ds
						.getString("NBR_MECHANICS")));
				jobDetail.setLaborHrs(Float.valueOf(ds.getString("LABOR_HRS")
						.substring(0, 3)
						+ "."
						+ ds.getString("LABOR_HRS").substring(3,
								ds.getString("LABOR_HRS").length())));
				jobDetail.setWoNbr(header.getWoNbr());
				jobDetails.add(jobDetail);
			}

			if (ds.isRecordID("mechanicCode")) {
				System.out.println("mechanic present");
			}

			if (ds.isRecordID("fhwaHeader")) {
				System.out.println("inspection header present");
			}

			if (ds.isRecordID("inspectCode")) {
				System.out.println("inspection description present");
			}

		}
		header.setDetails(jobDetails);

		return header;
	}

	public void test(File flatFile) throws Exception {
		if (flatFile.getName().compareTo("bnsfedi.004354104") == 0) {
			throw new Exception("testing: " + flatFile.getName());
		} else
			System.out.println("we're good");
	}
}
