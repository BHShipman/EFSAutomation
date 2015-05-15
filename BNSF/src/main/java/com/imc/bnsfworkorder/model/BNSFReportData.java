package com.imc.bnsfworkorder.model;

import java.io.Serializable;

//@NamedQuery(name="verify.reportExists", query = "SELECT rep FROM BNSFReportData rep WHERE rep.work_order_number=:number AND rep.work_order_status = 'Approved'")

//@Entity
//@Table(name = "bnsf_report_data")
public class BNSFReportData implements Serializable {

	//@Id
	//@SequenceGenerator(name = "bnsf_report_data_id_seq", sequenceName = "bnsf_report_data_id_seq", allocationSize = 1)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bnsf_report_data_id_seq")
	//@Column(unique = true, nullable = false)
	private int id;
	//@Column
	private String bill_to_party_scac;
	//@Column
	private String company_number;
	//@Column
	private String company_name;
	//@Column
	private String company_type;
	//@Column
	private String scac;
	//@Column
	private String invoice_number;
	//@Column
	private String invoice_date;
	//@Column
	private String invoice_status;
	//@Column
	private String invoiced_equip_total;
	//@Column
	private String invoiced_tax_total;
	//@Column
	private String invoiced_grand_total;
	//@Column
	private String payable_equip_total;
	//@Column
	private String payable_tax_total;
	//@Column
	private String payable_invoice_total;
	//@Column
	private String declined_amount;
	//@Column
	private String date_paid;
	//@Column
	private String submit_date;
	//@Column
	private String work_order_number;
	//@Column
	private String reference_number;
	//@Column
	private String work_order_status;
	//@Column
	private String unit_initial;
	//@Column
	private String unit_number;
	//@Column
	private String mate_initial;
	//@Column
	private String mate_number;
	//@Column
	private String repair_date;
	//@Column
	private String in_gate_location;
	//@Column
	private String out_gate_location;
	//@Column
	private String repair_location;
	//@Column
	private String unit_type;
	//@Column
	private String purchase_order_number;
	//@Column
	private String fhwa_due_date;
	//@Column
	private String bit_due_date;
	//@Column
	private String international_domestic;
	//@Column
	private String ieo_number;
	//@Column
	private String ieo_hold_code;
	//@Column
	private String composition;
	//@Column
	private String job_code;
	//@Column
	private String job_code_description;
	//@Column
	private String condition_code;
	//@Column
	private String why_made;
	//@Column
	private String unit_location_code;
	//@Column
	private String responsibility_code;
	//@Column
	private String defect_size;
	//@Column
	private String defect_quantity;
	//@Column
	private String repair_size;
	//@Column
	private String repair_quantity;
	//@Column
	private String rail_material;
	//@Column
	private String material_charge;
	//@Column
	private String labor_charge;
	//@Column
	private String tax_charge;
	//@Column
	private String rl_total;
	//@Column
	private String payable_material_charge;
	//@Column
	private String payable_labor_charge;
	//@Column
	private String payable_tax_charge;
	//@Column
	private String payable_total_charge;

	public BNSFReportData(){
		
	}
	
	public BNSFReportData(String bill_to_party_scac,
			String company_number, String company_name, String company_type,
			String scac, String invoice_number, String invoice_date,
			String invoice_status, String invoiced_equip_total,
			String invoiced_tax_total, String invoiced_grand_total,
			String payable_equip_total, String payable_tax_total,
			String payable_invoice_total, String declined_amount,
			String date_paid, String submit_date, String work_order_number,
			String reference_number, String work_order_status,
			String unit_initial, String unit_number, String mate_initial,
			String mate_number, String repair_date, String in_gate_location,
			String out_gate_location, String repair_location, String unit_type,
			String purchase_order_number, String fhwa_due_date,
			String bit_due_date, String international_domestic,
			String ieo_number, String ieo_hold_code, String composition,
			String job_code, String job_code_description,
			String condition_code, String why_made, String unit_location_code,
			String responsibility_code, String defect_size,
			String defect_quantity, String repair_size, String repair_quantity,
			String rail_material, String material_charge, String labor_charge,
			String tax_charge, String rl_total, String payable_material_charge,
			String payable_labor_charge, String payable_tax_charge,
			String payable_total_charge) {
		this.bill_to_party_scac = bill_to_party_scac;
		this.company_number = company_number;
		this.company_name = company_name;
		this.company_type = company_type;
		this.scac = scac;
		this.invoice_number = invoice_number;
		this.invoice_date = invoice_date;
		this.invoice_status = invoice_status;
		this.invoiced_equip_total = invoiced_equip_total;
		this.invoiced_tax_total = invoiced_tax_total;
		this.invoiced_grand_total = invoiced_grand_total;
		this.payable_equip_total = payable_equip_total;
		this.payable_tax_total = payable_tax_total;
		this.payable_invoice_total = payable_invoice_total;
		this.declined_amount = declined_amount;
		this.date_paid = date_paid;
		this.submit_date = submit_date;
		this.work_order_number = work_order_number;
		this.reference_number = reference_number;
		this.work_order_status = work_order_status;
		this.unit_initial = unit_initial;
		this.unit_number = unit_number;
		this.mate_initial = mate_initial;
		this.mate_number = mate_number;
		this.repair_date = repair_date;
		this.in_gate_location = in_gate_location;
		this.out_gate_location = out_gate_location;
		this.repair_location = repair_location;
		this.unit_type = unit_type;
		this.purchase_order_number = purchase_order_number;
		this.fhwa_due_date = fhwa_due_date;
		this.bit_due_date = bit_due_date;
		this.international_domestic = international_domestic;
		this.ieo_number = ieo_number;
		this.ieo_hold_code = ieo_hold_code;
		this.composition = composition;
		this.job_code = job_code;
		this.job_code_description = job_code_description;
		this.condition_code = condition_code;
		this.why_made = why_made;
		this.unit_location_code = unit_location_code;
		this.responsibility_code = responsibility_code;
		this.defect_size = defect_size;
		this.defect_quantity = defect_quantity;
		this.repair_size = repair_size;
		this.repair_quantity = repair_quantity;
		this.rail_material = rail_material;
		this.material_charge = material_charge;
		this.labor_charge = labor_charge;
		this.tax_charge = tax_charge;
		this.rl_total = rl_total;
		this.payable_material_charge = payable_material_charge;
		this.payable_labor_charge = payable_labor_charge;
		this.payable_tax_charge = payable_tax_charge;
		this.payable_total_charge = payable_total_charge;
	}

	public String getBill_to_party_scac() {
		return bill_to_party_scac;
	}

	public void setBill_to_party_scac(String bill_to_party_scac) {
		this.bill_to_party_scac = bill_to_party_scac;
	}

	public String getCompany_number() {
		return company_number;
	}

	public void setCompany_number(String company_number) {
		this.company_number = company_number;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_type() {
		return company_type;
	}

	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}

	public String getScac() {
		return scac;
	}

	public void setScac(String scac) {
		this.scac = scac;
	}

	public String getInvoice_number() {
		return invoice_number;
	}

	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}

	public String getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}

	public String getInvoice_status() {
		return invoice_status;
	}

	public void setInvoice_status(String invoice_status) {
		this.invoice_status = invoice_status;
	}

	public String getInvoiced_equip_total() {
		return invoiced_equip_total;
	}

	public void setInvoiced_equip_total(String invoiced_equip_total) {
		this.invoiced_equip_total = invoiced_equip_total;
	}

	public String getInvoiced_tax_total() {
		return invoiced_tax_total;
	}

	public void setInvoiced_tax_total(String invoiced_tax_total) {
		this.invoiced_tax_total = invoiced_tax_total;
	}

	public String getInvoiced_grand_total() {
		return invoiced_grand_total;
	}

	public void setInvoiced_grand_total(String invoiced_grand_total) {
		this.invoiced_grand_total = invoiced_grand_total;
	}

	public String getPayable_equip_total() {
		return payable_equip_total;
	}

	public void setPayable_equip_total(String payable_equip_total) {
		this.payable_equip_total = payable_equip_total;
	}

	public String getPayable_tax_total() {
		return payable_tax_total;
	}

	public void setPayable_tax_total(String payable_tax_total) {
		this.payable_tax_total = payable_tax_total;
	}

	public String getPayable_invoice_total() {
		return payable_invoice_total;
	}

	public void setPayable_invoice_total(String payable_invoice_total) {
		this.payable_invoice_total = payable_invoice_total;
	}

	public String getDeclined_amount() {
		return declined_amount;
	}

	public void setDeclined_amount(String declined_amount) {
		this.declined_amount = declined_amount;
	}

	public String getDate_paid() {
		return date_paid;
	}

	public void setDate_paid(String date_paid) {
		this.date_paid = date_paid;
	}

	public String getSubmit_date() {
		return submit_date;
	}

	public void setSubmit_date(String submit_date) {
		this.submit_date = submit_date;
	}

	public String getWork_order_number() {
		return work_order_number;
	}

	public void setWork_order_number(String work_order_number) {
		this.work_order_number = work_order_number;
	}

	public String getReference_number() {
		return reference_number;
	}

	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}

	public String getWork_order_status() {
		return work_order_status;
	}

	public void setWork_order_status(String work_order_status) {
		this.work_order_status = work_order_status;
	}

	public String getUnit_initial() {
		return unit_initial;
	}

	public void setUnit_initial(String unit_initial) {
		this.unit_initial = unit_initial;
	}

	public String getUnit_number() {
		return unit_number;
	}

	public void setUnit_number(String unit_number) {
		this.unit_number = unit_number;
	}

	public String getMate_initial() {
		return mate_initial;
	}

	public void setMate_initial(String mate_initial) {
		this.mate_initial = mate_initial;
	}

	public String getMate_number() {
		return mate_number;
	}

	public void setMate_number(String mate_number) {
		this.mate_number = mate_number;
	}

	public String getRepair_date() {
		return repair_date;
	}

	public void setRepair_date(String repair_date) {
		this.repair_date = repair_date;
	}

	public String getIn_gate_location() {
		return in_gate_location;
	}

	public void setIn_gate_location(String in_gate_location) {
		this.in_gate_location = in_gate_location;
	}

	public String getOut_gate_location() {
		return out_gate_location;
	}

	public void setOut_gate_location(String out_gate_location) {
		this.out_gate_location = out_gate_location;
	}

	public String getRepair_location() {
		return repair_location;
	}

	public void setRepair_location(String repair_location) {
		this.repair_location = repair_location;
	}

	public String getUnit_type() {
		return unit_type;
	}

	public void setUnit_type(String unit_type) {
		this.unit_type = unit_type;
	}

	public String getPurchase_order_number() {
		return purchase_order_number;
	}

	public void setPurchase_order_number(String purchase_order_number) {
		this.purchase_order_number = purchase_order_number;
	}

	public String getFhwa_due_date() {
		return fhwa_due_date;
	}

	public void setFhwa_due_date(String fhwa_due_date) {
		this.fhwa_due_date = fhwa_due_date;
	}

	public String getBit_due_date() {
		return bit_due_date;
	}

	public void setBit_due_date(String bit_due_date) {
		this.bit_due_date = bit_due_date;
	}

	public String getInternational_domestic() {
		return international_domestic;
	}

	public void setInternational_domestic(String international_domestic) {
		this.international_domestic = international_domestic;
	}

	public String getIeo_number() {
		return ieo_number;
	}

	public void setIeo_number(String ieo_number) {
		this.ieo_number = ieo_number;
	}

	public String getIeo_hold_code() {
		return ieo_hold_code;
	}

	public void setIeo_hold_code(String ieo_hold_code) {
		this.ieo_hold_code = ieo_hold_code;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getJob_code() {
		return job_code;
	}

	public void setJob_code(String job_code) {
		this.job_code = job_code;
	}

	public String getJob_code_description() {
		return job_code_description;
	}

	public void setJob_code_description(String job_code_description) {
		this.job_code_description = job_code_description;
	}

	public String getCondition_code() {
		return condition_code;
	}

	public void setCondition_code(String condition_code) {
		this.condition_code = condition_code;
	}

	public String getWhy_made() {
		return why_made;
	}

	public void setWhy_made(String why_made) {
		this.why_made = why_made;
	}

	public String getUnit_location_code() {
		return unit_location_code;
	}

	public void setUnit_location_code(String unit_location_code) {
		this.unit_location_code = unit_location_code;
	}

	public String getResponsibility_code() {
		return responsibility_code;
	}

	public void setResponsibility_code(String responsibility_code) {
		this.responsibility_code = responsibility_code;
	}

	public String getDefect_size() {
		return defect_size;
	}

	public void setDefect_size(String defect_size) {
		this.defect_size = defect_size;
	}

	public String getDefect_quantity() {
		return defect_quantity;
	}

	public void setDefect_quantity(String defect_quantity) {
		this.defect_quantity = defect_quantity;
	}

	public String getRepair_size() {
		return repair_size;
	}

	public void setRepair_size(String repair_size) {
		this.repair_size = repair_size;
	}

	public String getRepair_quantity() {
		return repair_quantity;
	}

	public void setRepair_quantity(String repair_quantity) {
		this.repair_quantity = repair_quantity;
	}

	public String getRail_material() {
		return rail_material;
	}

	public void setRail_material(String rail_material) {
		this.rail_material = rail_material;
	}

	public String getMaterial_charge() {
		return material_charge;
	}

	public void setMaterial_charge(String material_charge) {
		this.material_charge = material_charge;
	}

	public String getLabor_charge() {
		return labor_charge;
	}

	public void setLabor_charge(String labor_charge) {
		this.labor_charge = labor_charge;
	}

	public String getTax_charge() {
		return tax_charge;
	}

	public void setTax_charge(String tax_charge) {
		this.tax_charge = tax_charge;
	}

	public String getRl_total() {
		return rl_total;
	}

	public void setRl_total(String rl_total) {
		this.rl_total = rl_total;
	}

	public String getPayable_material_charge() {
		return payable_material_charge;
	}

	public void setPayable_material_charge(String payable_material_charge) {
		this.payable_material_charge = payable_material_charge;
	}

	public String getPayable_labor_charge() {
		return payable_labor_charge;
	}

	public void setPayable_labor_charge(String payable_labor_charge) {
		this.payable_labor_charge = payable_labor_charge;
	}

	public String getPayable_tax_charge() {
		return payable_tax_charge;
	}

	public void setPayable_tax_charge(String payable_tax_charge) {
		this.payable_tax_charge = payable_tax_charge;
	}

	public String getPayable_total_charge() {
		return payable_total_charge;
	}

	public void setPayable_total_charge(String payable_total_charge) {
		this.payable_total_charge = payable_total_charge;
	}

}
