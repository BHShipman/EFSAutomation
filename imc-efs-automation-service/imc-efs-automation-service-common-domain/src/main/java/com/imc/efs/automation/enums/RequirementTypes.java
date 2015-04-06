package com.imc.efs.automation.enums;

public enum RequirementTypes {

	NotRequired((byte) 0), Optional((byte) 1), Required((byte) 2);

	private final byte index;

	RequirementTypes(byte index) {
		this.index = index;
	}

	public byte index() {
		return index;
	}
}
