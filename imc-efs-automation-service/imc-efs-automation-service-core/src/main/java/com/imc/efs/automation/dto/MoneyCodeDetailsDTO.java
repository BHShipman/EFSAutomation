package com.imc.efs.automation.dto;

public class MoneyCodeDetailsDTO {

	private boolean voided;
	private double amount;
	private double amountUsed;
	private double feeAmount;
	private String firstUse;
	private String who;

	public boolean isVoided() {
		return voided;
	}

	public void setVoided(boolean voided) {
		this.voided = voided;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmountUsed() {
		return amountUsed;
	}

	public void setAmountUsed(double amountUsed) {
		this.amountUsed = amountUsed;
	}

	public double getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFirstUse() {
		return firstUse;
	}

	public void setFirstUse(String firstUse) {
		this.firstUse = firstUse;
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}
}
