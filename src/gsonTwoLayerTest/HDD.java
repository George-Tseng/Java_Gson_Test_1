package gsonTwoLayerTest;

import java.io.Serializable;
import java.util.List;

public class HDD  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String catagory; //NB, Desktop, NAS or DC
	private List<HDD_Info> basicInfo;
	
	public HDD(String catagory, List<HDD_Info> basicInfo) {
		this.catagory = catagory;
		this.basicInfo = basicInfo;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public List<HDD_Info> getBasicInfo() {
		return basicInfo;
	}

	public void setBasicInfo(List<HDD_Info> basicInfo) {
		this.basicInfo = basicInfo;
	}
}
