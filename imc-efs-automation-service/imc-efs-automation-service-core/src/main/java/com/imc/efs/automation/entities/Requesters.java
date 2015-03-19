package com.imc.efs.automation.entities;

// Generated Mar 16, 2015 4:02:11 PM by Hibernate Tools 4.0.0

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Requesters generated by hbm2java
 */
@Entity
@Table(name = "Requesters", schema = "dbo", catalog = "EfsAutomation")
public class Requesters implements java.io.Serializable {

	private int id;
	private RequestTypes requestTypes;
	private Serializable name;
	private BigDecimal limit;

	public Requesters() {
	}

	public Requesters(int id, RequestTypes requestTypes, BigDecimal limit) {
		this.id = id;
		this.requestTypes = requestTypes;
		this.limit = limit;
	}

	public Requesters(int id, RequestTypes requestTypes, Serializable name,
			BigDecimal limit) {
		this.id = id;
		this.requestTypes = requestTypes;
		this.name = name;
		this.limit = limit;
	}

	@Id
	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RequestTypeId", nullable = false)
	public RequestTypes getRequestTypes() {
		return this.requestTypes;
	}

	public void setRequestTypes(RequestTypes requestTypes) {
		this.requestTypes = requestTypes;
	}

	@Column(name = "Name")
	public Serializable getName() {
		return this.name;
	}

	public void setName(Serializable name) {
		this.name = name;
	}

	@Column(name = "Limit", nullable = false, precision = 18)
	public BigDecimal getLimit() {
		return this.limit;
	}

	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}

}
