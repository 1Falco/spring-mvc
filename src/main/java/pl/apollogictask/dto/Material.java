package pl.apollogictask.dto;

import java.util.HashMap;
import java.util.Map;

public class Material {

	public String name;
	public Long iD;
	public Long companyID;
	public static Map <Long, Material> materialMap = new HashMap<Long, Material>();
	public Long getCompanyID() {
		return companyID;
	}
	public void setCompanyID(Long companyID) {
		this.companyID = companyID;
	}
	@Override
	public String toString() {
		return iD + "." + name;
	}
}