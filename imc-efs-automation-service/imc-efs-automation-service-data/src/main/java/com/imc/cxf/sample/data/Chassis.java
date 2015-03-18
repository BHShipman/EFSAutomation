package com.imc.cxf.sample.data;

import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@SuppressWarnings("restriction")
@XmlRootElement(name="Chassis")
public class Chassis implements Serializable{
	private static final long serialVersionUID = -469508291426686998L;
	
	private String ownerID;
	private String chassisID;

    public Chassis() {
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getChassisID() {
        return chassisID;
    }

    public void setChassisID(String chassisID) {
        this.chassisID = chassisID;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append("ownerID:").append(ownerID);
        stringBuilder.append(", chassisID::" + chassisID);

        return stringBuilder.toString();
    }
}
