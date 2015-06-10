package com.imc.driver.wait.service.entities;

// Generated May 21, 2015 5:06:04 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Company generated by hbm2java
 */
@Entity
@Table(name = "company", uniqueConstraints = @UniqueConstraint(columnNames = "oid"))
public class Company implements java.io.Serializable {

	private int no;
	private Date adate;
	private Date atime;
	private String alogin;
	private Date udate;
	private Date utime;
	private String ulogin;
	private String name;
	private String addr1;
	private String addr2;
	private String city;
	private String stCode;
	private String zip;
	private String fid;
	private String sid;
	private String phone;
	private String fax;
	private Date invdate;
	private BigDecimal pctpay;
	private int pctpaymile;
	private BigDecimal bonussaf;
	private BigDecimal bonusrec;
	private BigDecimal ins1;
	private Date inseff1dt;
	private Date insexp1dt;
	private BigDecimal ins2;
	private Date inseff2dt;
	private Date insexp2dt;
	private BigDecimal ins3;
	private Date inseff3dt;
	private Date insexp3dt;
	private Date begytd;
	private Date priorytd;
	private int suminv;
	private int master;
	private String scac;
	private String agcmpy;
	private String rfinv;
	private String rfsum;
	private char status;
	private char payb4man;
	private String bdbname;
	private String pgschemaname;
	private String imcdir;
	private String edidir;
	private Integer agentofCmpyNo;
	private char processinbound;
	private char processoutbound;
	private String inbounddir;
	private String outbounddir;
	private String ediemail;
	private String shortName;
	private String dep2pro;
	private String loadmasterMode;
	private String esobtCode;
	private String esovnCode;
	private String swsserver;
	private String reformInvoice;
	private String reformSuminvoice;
	private String wwwUrl;
	private String wwwEmailContact;
	private String swsEmailContact;
	private String ilsEmailDomain;
	private String type;
	private String startpgm;
	private char swsTruckingAccess;
	private char swsBrokerageAccess;
	private String efsAccount;
	private Character topMenu;
	private Character userBasedAccess;
	private String ischzusage;
	private String imagingVersion;
	private String autoinvoice;
	private String stopImaging;
	private Character imagingOn;
	private Set<Billto> billtos = new HashSet<Billto>(0);

	public Company() {
	}

	public Company(int no, String alogin, String ulogin, String name,
			String addr1, String addr2, String city, String stCode, String zip,
			String fid, String sid, String phone, String fax,
			BigDecimal pctpay, int pctpaymile, BigDecimal bonussaf,
			BigDecimal bonusrec, BigDecimal ins1, BigDecimal ins2,
			BigDecimal ins3, int suminv, int master, String scac,
			String agcmpy, String rfinv, String rfsum, char status,
			char payb4man, String bdbname, String pgschemaname, String imcdir,
			String edidir, char processinbound, char processoutbound,
			String inbounddir, String outbounddir, String ediemail,
			String shortName, String dep2pro, String loadmasterMode,
			String esobtCode, String esovnCode, String swsserver,
			String reformInvoice, String reformSuminvoice, String wwwUrl,
			String wwwEmailContact, String swsEmailContact,
			String ilsEmailDomain, String type, String startpgm,
			char swsTruckingAccess, char swsBrokerageAccess, String efsAccount,
			String ischzusage, String autoinvoice) {
		this.no = no;
		this.alogin = alogin;
		this.ulogin = ulogin;
		this.name = name;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.city = city;
		this.stCode = stCode;
		this.zip = zip;
		this.fid = fid;
		this.sid = sid;
		this.phone = phone;
		this.fax = fax;
		this.pctpay = pctpay;
		this.pctpaymile = pctpaymile;
		this.bonussaf = bonussaf;
		this.bonusrec = bonusrec;
		this.ins1 = ins1;
		this.ins2 = ins2;
		this.ins3 = ins3;
		this.suminv = suminv;
		this.master = master;
		this.scac = scac;
		this.agcmpy = agcmpy;
		this.rfinv = rfinv;
		this.rfsum = rfsum;
		this.status = status;
		this.payb4man = payb4man;
		this.bdbname = bdbname;
		this.pgschemaname = pgschemaname;
		this.imcdir = imcdir;
		this.edidir = edidir;
		this.processinbound = processinbound;
		this.processoutbound = processoutbound;
		this.inbounddir = inbounddir;
		this.outbounddir = outbounddir;
		this.ediemail = ediemail;
		this.shortName = shortName;
		this.dep2pro = dep2pro;
		this.loadmasterMode = loadmasterMode;
		this.esobtCode = esobtCode;
		this.esovnCode = esovnCode;
		this.swsserver = swsserver;
		this.reformInvoice = reformInvoice;
		this.reformSuminvoice = reformSuminvoice;
		this.wwwUrl = wwwUrl;
		this.wwwEmailContact = wwwEmailContact;
		this.swsEmailContact = swsEmailContact;
		this.ilsEmailDomain = ilsEmailDomain;
		this.type = type;
		this.startpgm = startpgm;
		this.swsTruckingAccess = swsTruckingAccess;
		this.swsBrokerageAccess = swsBrokerageAccess;
		this.efsAccount = efsAccount;
		this.ischzusage = ischzusage;
		this.autoinvoice = autoinvoice;
	}

	public Company(int no, Date adate, Date atime, String alogin, Date udate,
			Date utime, String ulogin, String name, String addr1, String addr2,
			String city, String stCode, String zip, String fid, String sid,
			String phone, String fax, Date invdate, BigDecimal pctpay,
			int pctpaymile, BigDecimal bonussaf, BigDecimal bonusrec,
			BigDecimal ins1, Date inseff1dt, Date insexp1dt, BigDecimal ins2,
			Date inseff2dt, Date insexp2dt, BigDecimal ins3, Date inseff3dt,
			Date insexp3dt, Date begytd, Date priorytd, int suminv, int master,
			String scac, String agcmpy, String rfinv, String rfsum,
			char status, char payb4man, String bdbname, String pgschemaname,
			String imcdir, String edidir, Integer agentofCmpyNo,
			char processinbound, char processoutbound, String inbounddir,
			String outbounddir, String ediemail, String shortName,
			String dep2pro, String loadmasterMode, String esobtCode,
			String esovnCode, String swsserver, String reformInvoice,
			String reformSuminvoice, String wwwUrl, String wwwEmailContact,
			String swsEmailContact, String ilsEmailDomain, String type,
			String startpgm, char swsTruckingAccess, char swsBrokerageAccess,
			String efsAccount, Character topMenu, Character userBasedAccess,
			String ischzusage, String imagingVersion, String autoinvoice,
			String stopImaging, Character imagingOn, Set<Billto> billtos) {
		this.no = no;
		this.adate = adate;
		this.atime = atime;
		this.alogin = alogin;
		this.udate = udate;
		this.utime = utime;
		this.ulogin = ulogin;
		this.name = name;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.city = city;
		this.stCode = stCode;
		this.zip = zip;
		this.fid = fid;
		this.sid = sid;
		this.phone = phone;
		this.fax = fax;
		this.invdate = invdate;
		this.pctpay = pctpay;
		this.pctpaymile = pctpaymile;
		this.bonussaf = bonussaf;
		this.bonusrec = bonusrec;
		this.ins1 = ins1;
		this.inseff1dt = inseff1dt;
		this.insexp1dt = insexp1dt;
		this.ins2 = ins2;
		this.inseff2dt = inseff2dt;
		this.insexp2dt = insexp2dt;
		this.ins3 = ins3;
		this.inseff3dt = inseff3dt;
		this.insexp3dt = insexp3dt;
		this.begytd = begytd;
		this.priorytd = priorytd;
		this.suminv = suminv;
		this.master = master;
		this.scac = scac;
		this.agcmpy = agcmpy;
		this.rfinv = rfinv;
		this.rfsum = rfsum;
		this.status = status;
		this.payb4man = payb4man;
		this.bdbname = bdbname;
		this.pgschemaname = pgschemaname;
		this.imcdir = imcdir;
		this.edidir = edidir;
		this.agentofCmpyNo = agentofCmpyNo;
		this.processinbound = processinbound;
		this.processoutbound = processoutbound;
		this.inbounddir = inbounddir;
		this.outbounddir = outbounddir;
		this.ediemail = ediemail;
		this.shortName = shortName;
		this.dep2pro = dep2pro;
		this.loadmasterMode = loadmasterMode;
		this.esobtCode = esobtCode;
		this.esovnCode = esovnCode;
		this.swsserver = swsserver;
		this.reformInvoice = reformInvoice;
		this.reformSuminvoice = reformSuminvoice;
		this.wwwUrl = wwwUrl;
		this.wwwEmailContact = wwwEmailContact;
		this.swsEmailContact = swsEmailContact;
		this.ilsEmailDomain = ilsEmailDomain;
		this.type = type;
		this.startpgm = startpgm;
		this.swsTruckingAccess = swsTruckingAccess;
		this.swsBrokerageAccess = swsBrokerageAccess;
		this.efsAccount = efsAccount;
		this.topMenu = topMenu;
		this.userBasedAccess = userBasedAccess;
		this.ischzusage = ischzusage;
		this.imagingVersion = imagingVersion;
		this.autoinvoice = autoinvoice;
		this.stopImaging = stopImaging;
		this.imagingOn = imagingOn;
		this.billtos = billtos;
	}

	@Id
	@Column(name = "no", unique = true, nullable = false)
	public int getNo() {
		return this.no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "adate", length = 13)
	public Date getAdate() {
		return this.adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "atime", length = 15)
	public Date getAtime() {
		return this.atime;
	}

	public void setAtime(Date atime) {
		this.atime = atime;
	}

	@Column(name = "alogin", nullable = false, length = 8)
	public String getAlogin() {
		return this.alogin;
	}

	public void setAlogin(String alogin) {
		this.alogin = alogin;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "udate", length = 13)
	public Date getUdate() {
		return this.udate;
	}

	public void setUdate(Date udate) {
		this.udate = udate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "utime", length = 15)
	public Date getUtime() {
		return this.utime;
	}

	public void setUtime(Date utime) {
		this.utime = utime;
	}

	@Column(name = "ulogin", nullable = false, length = 8)
	public String getUlogin() {
		return this.ulogin;
	}

	public void setUlogin(String ulogin) {
		this.ulogin = ulogin;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "addr1", nullable = false, length = 30)
	public String getAddr1() {
		return this.addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	@Column(name = "addr2", nullable = false, length = 30)
	public String getAddr2() {
		return this.addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	@Column(name = "city", nullable = false, length = 20)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "st_code", nullable = false, length = 2)
	public String getStCode() {
		return this.stCode;
	}

	public void setStCode(String stCode) {
		this.stCode = stCode;
	}

	@Column(name = "zip", nullable = false, length = 10)
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Column(name = "fid", nullable = false, length = 15)
	public String getFid() {
		return this.fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	@Column(name = "sid", nullable = false, length = 15)
	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Column(name = "phone", nullable = false, length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "fax", nullable = false, length = 20)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "invdate", length = 13)
	public Date getInvdate() {
		return this.invdate;
	}

	public void setInvdate(Date invdate) {
		this.invdate = invdate;
	}

	@Column(name = "pctpay", nullable = false, precision = 16)
	public BigDecimal getPctpay() {
		return this.pctpay;
	}

	public void setPctpay(BigDecimal pctpay) {
		this.pctpay = pctpay;
	}

	@Column(name = "pctpaymile", nullable = false)
	public int getPctpaymile() {
		return this.pctpaymile;
	}

	public void setPctpaymile(int pctpaymile) {
		this.pctpaymile = pctpaymile;
	}

	@Column(name = "bonussaf", nullable = false, precision = 16)
	public BigDecimal getBonussaf() {
		return this.bonussaf;
	}

	public void setBonussaf(BigDecimal bonussaf) {
		this.bonussaf = bonussaf;
	}

	@Column(name = "bonusrec", nullable = false, precision = 16)
	public BigDecimal getBonusrec() {
		return this.bonusrec;
	}

	public void setBonusrec(BigDecimal bonusrec) {
		this.bonusrec = bonusrec;
	}

	@Column(name = "ins1", nullable = false, precision = 16)
	public BigDecimal getIns1() {
		return this.ins1;
	}

	public void setIns1(BigDecimal ins1) {
		this.ins1 = ins1;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "inseff1dt", length = 13)
	public Date getInseff1dt() {
		return this.inseff1dt;
	}

	public void setInseff1dt(Date inseff1dt) {
		this.inseff1dt = inseff1dt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "insexp1dt", length = 13)
	public Date getInsexp1dt() {
		return this.insexp1dt;
	}

	public void setInsexp1dt(Date insexp1dt) {
		this.insexp1dt = insexp1dt;
	}

	@Column(name = "ins2", nullable = false, precision = 16)
	public BigDecimal getIns2() {
		return this.ins2;
	}

	public void setIns2(BigDecimal ins2) {
		this.ins2 = ins2;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "inseff2dt", length = 13)
	public Date getInseff2dt() {
		return this.inseff2dt;
	}

	public void setInseff2dt(Date inseff2dt) {
		this.inseff2dt = inseff2dt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "insexp2dt", length = 13)
	public Date getInsexp2dt() {
		return this.insexp2dt;
	}

	public void setInsexp2dt(Date insexp2dt) {
		this.insexp2dt = insexp2dt;
	}

	@Column(name = "ins3", nullable = false, precision = 16)
	public BigDecimal getIns3() {
		return this.ins3;
	}

	public void setIns3(BigDecimal ins3) {
		this.ins3 = ins3;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "inseff3dt", length = 13)
	public Date getInseff3dt() {
		return this.inseff3dt;
	}

	public void setInseff3dt(Date inseff3dt) {
		this.inseff3dt = inseff3dt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "insexp3dt", length = 13)
	public Date getInsexp3dt() {
		return this.insexp3dt;
	}

	public void setInsexp3dt(Date insexp3dt) {
		this.insexp3dt = insexp3dt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "begytd", length = 13)
	public Date getBegytd() {
		return this.begytd;
	}

	public void setBegytd(Date begytd) {
		this.begytd = begytd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "priorytd", length = 13)
	public Date getPriorytd() {
		return this.priorytd;
	}

	public void setPriorytd(Date priorytd) {
		this.priorytd = priorytd;
	}

	@Column(name = "suminv", nullable = false)
	public int getSuminv() {
		return this.suminv;
	}

	public void setSuminv(int suminv) {
		this.suminv = suminv;
	}

	@Column(name = "master", nullable = false)
	public int getMaster() {
		return this.master;
	}

	public void setMaster(int master) {
		this.master = master;
	}

	@Column(name = "scac", nullable = false, length = 4)
	public String getScac() {
		return this.scac;
	}

	public void setScac(String scac) {
		this.scac = scac;
	}

	@Column(name = "agcmpy", nullable = false, length = 2)
	public String getAgcmpy() {
		return this.agcmpy;
	}

	public void setAgcmpy(String agcmpy) {
		this.agcmpy = agcmpy;
	}

	@Column(name = "rfinv", nullable = false, length = 15)
	public String getRfinv() {
		return this.rfinv;
	}

	public void setRfinv(String rfinv) {
		this.rfinv = rfinv;
	}

	@Column(name = "rfsum", nullable = false, length = 15)
	public String getRfsum() {
		return this.rfsum;
	}

	public void setRfsum(String rfsum) {
		this.rfsum = rfsum;
	}

	@Column(name = "status", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Column(name = "payb4man", nullable = false, length = 1)
	public char getPayb4man() {
		return this.payb4man;
	}

	public void setPayb4man(char payb4man) {
		this.payb4man = payb4man;
	}

	@Column(name = "bdbname", nullable = false, length = 15)
	public String getBdbname() {
		return this.bdbname;
	}

	public void setBdbname(String bdbname) {
		this.bdbname = bdbname;
	}

	@Column(name = "pgschemaname", nullable = false, length = 15)
	public String getPgschemaname() {
		return this.pgschemaname;
	}

	public void setPgschemaname(String pgschemaname) {
		this.pgschemaname = pgschemaname;
	}

	@Column(name = "imcdir", nullable = false, length = 15)
	public String getImcdir() {
		return this.imcdir;
	}

	public void setImcdir(String imcdir) {
		this.imcdir = imcdir;
	}

	@Column(name = "edidir", nullable = false, length = 15)
	public String getEdidir() {
		return this.edidir;
	}

	public void setEdidir(String edidir) {
		this.edidir = edidir;
	}

	@Column(name = "agentof_cmpy_no")
	public Integer getAgentofCmpyNo() {
		return this.agentofCmpyNo;
	}

	public void setAgentofCmpyNo(Integer agentofCmpyNo) {
		this.agentofCmpyNo = agentofCmpyNo;
	}

	@Column(name = "processinbound", nullable = false, length = 1)
	public char getProcessinbound() {
		return this.processinbound;
	}

	public void setProcessinbound(char processinbound) {
		this.processinbound = processinbound;
	}

	@Column(name = "processoutbound", nullable = false, length = 1)
	public char getProcessoutbound() {
		return this.processoutbound;
	}

	public void setProcessoutbound(char processoutbound) {
		this.processoutbound = processoutbound;
	}

	@Column(name = "inbounddir", nullable = false, length = 63)
	public String getInbounddir() {
		return this.inbounddir;
	}

	public void setInbounddir(String inbounddir) {
		this.inbounddir = inbounddir;
	}

	@Column(name = "outbounddir", nullable = false, length = 63)
	public String getOutbounddir() {
		return this.outbounddir;
	}

	public void setOutbounddir(String outbounddir) {
		this.outbounddir = outbounddir;
	}

	@Column(name = "ediemail", nullable = false, length = 127)
	public String getEdiemail() {
		return this.ediemail;
	}

	public void setEdiemail(String ediemail) {
		this.ediemail = ediemail;
	}

	@Column(name = "short_name", nullable = false, length = 8)
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Column(name = "dep2pro", nullable = false, length = 1)
	public String getDep2pro() {
		return this.dep2pro;
	}

	public void setDep2pro(String dep2pro) {
		this.dep2pro = dep2pro;
	}

	@Column(name = "loadmaster_mode", nullable = false, length = 1)
	public String getLoadmasterMode() {
		return this.loadmasterMode;
	}

	public void setLoadmasterMode(String loadmasterMode) {
		this.loadmasterMode = loadmasterMode;
	}

	@Column(name = "esobt_code", nullable = false, length = 6)
	public String getEsobtCode() {
		return this.esobtCode;
	}

	public void setEsobtCode(String esobtCode) {
		this.esobtCode = esobtCode;
	}

	@Column(name = "esovn_code", nullable = false, length = 6)
	public String getEsovnCode() {
		return this.esovnCode;
	}

	public void setEsovnCode(String esovnCode) {
		this.esovnCode = esovnCode;
	}

	@Column(name = "swsserver", nullable = false, length = 28)
	public String getSwsserver() {
		return this.swsserver;
	}

	public void setSwsserver(String swsserver) {
		this.swsserver = swsserver;
	}

	@Column(name = "reform_invoice", nullable = false, length = 32)
	public String getReformInvoice() {
		return this.reformInvoice;
	}

	public void setReformInvoice(String reformInvoice) {
		this.reformInvoice = reformInvoice;
	}

	@Column(name = "reform_suminvoice", nullable = false, length = 32)
	public String getReformSuminvoice() {
		return this.reformSuminvoice;
	}

	public void setReformSuminvoice(String reformSuminvoice) {
		this.reformSuminvoice = reformSuminvoice;
	}

	@Column(name = "www_url", nullable = false, length = 127)
	public String getWwwUrl() {
		return this.wwwUrl;
	}

	public void setWwwUrl(String wwwUrl) {
		this.wwwUrl = wwwUrl;
	}

	@Column(name = "www_email_contact", nullable = false, length = 127)
	public String getWwwEmailContact() {
		return this.wwwEmailContact;
	}

	public void setWwwEmailContact(String wwwEmailContact) {
		this.wwwEmailContact = wwwEmailContact;
	}

	@Column(name = "sws_email_contact", nullable = false, length = 127)
	public String getSwsEmailContact() {
		return this.swsEmailContact;
	}

	public void setSwsEmailContact(String swsEmailContact) {
		this.swsEmailContact = swsEmailContact;
	}

	@Column(name = "ils_email_domain", nullable = false, length = 63)
	public String getIlsEmailDomain() {
		return this.ilsEmailDomain;
	}

	public void setIlsEmailDomain(String ilsEmailDomain) {
		this.ilsEmailDomain = ilsEmailDomain;
	}

	@Column(name = "type", nullable = false, length = 1)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "startpgm", nullable = false, length = 10)
	public String getStartpgm() {
		return this.startpgm;
	}

	public void setStartpgm(String startpgm) {
		this.startpgm = startpgm;
	}

	@Column(name = "sws_trucking_access", nullable = false, length = 1)
	public char getSwsTruckingAccess() {
		return this.swsTruckingAccess;
	}

	public void setSwsTruckingAccess(char swsTruckingAccess) {
		this.swsTruckingAccess = swsTruckingAccess;
	}

	@Column(name = "sws_brokerage_access", nullable = false, length = 1)
	public char getSwsBrokerageAccess() {
		return this.swsBrokerageAccess;
	}

	public void setSwsBrokerageAccess(char swsBrokerageAccess) {
		this.swsBrokerageAccess = swsBrokerageAccess;
	}

	@Column(name = "efs_account", nullable = false, length = 10)
	public String getEfsAccount() {
		return this.efsAccount;
	}

	public void setEfsAccount(String efsAccount) {
		this.efsAccount = efsAccount;
	}

	@Column(name = "top_menu", length = 1)
	public Character getTopMenu() {
		return this.topMenu;
	}

	public void setTopMenu(Character topMenu) {
		this.topMenu = topMenu;
	}

	@Column(name = "user_based_access", length = 1)
	public Character getUserBasedAccess() {
		return this.userBasedAccess;
	}

	public void setUserBasedAccess(Character userBasedAccess) {
		this.userBasedAccess = userBasedAccess;
	}

	@Column(name = "ischzusage", nullable = false, length = 1)
	public String getIschzusage() {
		return this.ischzusage;
	}

	public void setIschzusage(String ischzusage) {
		this.ischzusage = ischzusage;
	}

	@Column(name = "imaging_version", length = 10)
	public String getImagingVersion() {
		return this.imagingVersion;
	}

	public void setImagingVersion(String imagingVersion) {
		this.imagingVersion = imagingVersion;
	}

	@Column(name = "autoinvoice", nullable = false, length = 1)
	public String getAutoinvoice() {
		return this.autoinvoice;
	}

	public void setAutoinvoice(String autoinvoice) {
		this.autoinvoice = autoinvoice;
	}

	@Column(name = "stop_imaging", length = 1)
	public String getStopImaging() {
		return this.stopImaging;
	}

	public void setStopImaging(String stopImaging) {
		this.stopImaging = stopImaging;
	}

	@Column(name = "imaging_on", length = 1)
	public Character getImagingOn() {
		return this.imagingOn;
	}

	public void setImagingOn(Character imagingOn) {
		this.imagingOn = imagingOn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
	public Set<Billto> getBilltos() {
		return this.billtos;
	}

	public void setBilltos(Set<Billto> billtos) {
		this.billtos = billtos;
	}

}
