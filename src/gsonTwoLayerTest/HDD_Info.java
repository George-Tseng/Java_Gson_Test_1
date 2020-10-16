package gsonTwoLayerTest;

import java.io.Serializable;

public class HDD_Info implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String productID;
	private String productName;
	private int hddRPM;//7200 or 5400
	private String diskType;//SMR or CMR
	private int hddCache;
	private String type; //SSHD or HDD
	private double size;//2.5 or 3.5
	private String storage;// 500 GB/1 TB/2 TB
	private String company;
	
	public HDD_Info(int id, String productID, String productName, int hddRPM, String diskType, int hddCache, String type, double size, String storage, String company) {
		this.id = id;
		this.productID = productID;
		this.productName = productName;
		this.hddRPM = hddRPM;
		this.diskType = diskType;
		this.hddCache = hddCache;
		this.type = type;
		this.size = size;
		this.storage = storage;
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getHddRPM() {
		return hddRPM;
	}

	public void setHddRPM(int hddRPM) {
		this.hddRPM = hddRPM;
	}

	public String getDiskType() {
		return diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
	}

	public int getHddCache() {
		return hddCache;
	}

	public void setHddCache(int hddCache) {
		this.hddCache = hddCache;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public String toNormalString() {
		StringBuilder sb0 = new StringBuilder();
		sb0.append("" + id);
		sb0.append("," + productID);
		sb0.append("," + productName);
		sb0.append("," + hddRPM);
		sb0.append("," + diskType);
		sb0.append("," + hddCache);
		sb0.append("," + type);
		sb0.append("," + size);
		sb0.append("," + storage);
		sb0.append("," + company);
		return sb0.toString();
	}
}
