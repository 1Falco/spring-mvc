package pl.apollogictask.dto;

import java.util.Map;

public class Company {

	public Long iD;
	public String companyName;
	public static Map<Long, Company> companyMap;

	public Long getiD() {
		return iD;
	}

	public void setiD(Long iD) {
		this.iD = iD;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return companyName;
	}
}