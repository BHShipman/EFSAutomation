package com.imc.efs.automation.entities;

// Generated Apr 6, 2015 4:37:07 PM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * Auditlog generated by hbm2java
 */
@Entity
@Table(name = "auditlog", schema = "dbo")
public class AuditLog implements java.io.Serializable {

	private int id;
	private Date timestamp;
	private String message;
	private boolean isRequest;

	public AuditLog() {
	}

	public AuditLog(int id, String message, boolean isRequest) {
		this.id = id;
		this.message = message;
		this.isRequest = isRequest;
	}

	@Id
	@Column(name = "Id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Version
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Timestamp", nullable = false, length = 29)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Column(name = "Message", nullable = false, length = 99)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "IsRequest", nullable = false)
	public boolean isIsRequest() {
		return this.isRequest;
	}

	public void setIsRequest(boolean isRequest) {
		this.isRequest = isRequest;
	}

}
