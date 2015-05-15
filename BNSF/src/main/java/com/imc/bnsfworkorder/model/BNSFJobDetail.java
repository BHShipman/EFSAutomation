package com.imc.bnsfworkorder.model;


//Entity
//Table(name = "trb_job_code_data")
public class BNSFJobDetail {

	//Id
	//SequenceGenerator(name = "trb_job_code_data_key_column_seq", sequenceName = "trb_job_code_data_key_column_seq", allocationSize = 1)
	//GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trb_job_code_data_key_column_seq")
	//Column(name = "key_column", unique = true, nullable = false)
	private Long id;
	//Column(name = "filler")
	private String jobCodefiller;
	//Column(name = "job_code")
	private String jobCode;
	//Column(name = "why_made")
	private String whyMade;
	//Column(name = "cond_code")
	private String condCode;
	//Column(name = "location")
	private String location;
	//Column(name = "quantity")
	private String quantity;
	//Column(name = "repair_size")
	private String repairSize;
	//Column(name = "defect_size")
	private String defectSize;
	//Column(name = "dot_on")
	private String dotON;
	//Column(name = "dot_off")
	private String dotOFF;
	//Column(name = "dotr_on")
	private String dotrON;
	//Column(name = "dotr_off")
	private String dotrOFF;
	//Column(name = "brand_on")
	private String brandON;
	//Column(name = "brand_off_new")
	private String brandOFFNew;
	//Column(name = "brand_off_job_code_ext")
	private String brandOffJobCodeExt;
	//Column(name = "tax")
	private float tax;
	//Column(name = "labor_charge")
	private float laborCharge;
	//Column(name = "material_charge")
	private float materialCharge;
	//Column(name = "price")
	private float price;
	//Column(name = "rail_matl")
	private String railMatl;
	//Column(name = "nbr_mechanics")
	private float nbrMechanics;
	//Column(name = "labor_hrs")
	private float laborHrs;
	//Column(name = "wo_nbr")
	private String woNbr;

	public String getWoNbr() {
		return woNbr;
	}

	public void setWoNbr(String woNbr) {
		this.woNbr = woNbr;
	}

	public String getJobCodefiller() {
		return jobCodefiller;
	}

	public void setJobCodefiller(String jobCodefiller) {
		this.jobCodefiller = jobCodefiller;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getWhyMade() {
		return whyMade;
	}

	public void setWhyMade(String whyMade) {
		this.whyMade = whyMade;
	}

	public String getCondCode() {
		return condCode;
	}

	public void setCondCode(String condCode) {
		this.condCode = condCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRepairSize() {
		return repairSize;
	}

	public void setRepairSize(String repairSize) {
		this.repairSize = repairSize;
	}

	public String getDefectSize() {
		return defectSize;
	}

	public void setDefectSize(String defectSize) {
		this.defectSize = defectSize;
	}

	public String getDotON() {
		return dotON;
	}

	public void setDotON(String dotON) {
		this.dotON = dotON;
	}

	public String getDotOFF() {
		return dotOFF;
	}

	public void setDotOFF(String dotOFF) {
		this.dotOFF = dotOFF;
	}

	public String getDotrON() {
		return dotrON;
	}

	public void setDotrON(String dotrON) {
		this.dotrON = dotrON;
	}

	public String getDotrOFF() {
		return dotrOFF;
	}

	public void setDotrOFF(String dotrOFF) {
		this.dotrOFF = dotrOFF;
	}

	public String getBrandON() {
		return brandON;
	}

	public void setBrandON(String brandON) {
		this.brandON = brandON;
	}

	public String getBrandOFFNew() {
		return brandOFFNew;
	}

	public void setBrandOFFNew(String brandOFFNew) {
		this.brandOFFNew = brandOFFNew;
	}

	public String getBrandOffJobCodeExt() {
		return brandOffJobCodeExt;
	}

	public void setBrandOffJobCodeExt(String brandOffJobCodeExt) {
		this.brandOffJobCodeExt = brandOffJobCodeExt;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getLaborCharge() {
		return laborCharge;
	}

	public void setLaborCharge(float laborCharge) {
		this.laborCharge = laborCharge;
	}

	public float getMaterialCharge() {
		return materialCharge;
	}

	public void setMaterialCharge(float materialCharge) {
		this.materialCharge = materialCharge;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getRailMatl() {
		return railMatl;
	}

	public void setRailMatl(String railMatl) {
		this.railMatl = railMatl;
	}

	public float getNbrMechanics() {
		return nbrMechanics;
	}

	public void setNbrMechanics(float nbrMechanics) {
		this.nbrMechanics = nbrMechanics;
	}

	public float getLaborHrs() {
		return laborHrs;
	}

	public void setLaborHrs(float laborHrs) {
		this.laborHrs = laborHrs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
