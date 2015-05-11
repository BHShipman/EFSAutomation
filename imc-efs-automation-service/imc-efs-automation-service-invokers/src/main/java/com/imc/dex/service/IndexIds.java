package com.imc.dex.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="IndexIds", namespace="http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
public enum IndexIds {

	ProjectId(0), GroupId(1), DocumentId(2), Name(3), Idx1(4), Idx2(5), Idx3(6), Idx4(
			7), Idx5(8), Idx6(9), Idx7(10), Idx8(11), Idx9(12), Idx10(13), Idx11(
			14), Idx12(15), Idx13(16), Idx14(17), Idx15(18), Idx16(19), Idx17(
			20), Idx18(21), Idx19(22), Idx20(23);

	private final int index;

	IndexIds(int index) {
		this.index = index;
	}

	public int index() {
		return index;
	}
}
