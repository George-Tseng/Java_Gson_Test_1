package gsonTwoLayerTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class GsonOutput {
	public static void main(String[] args) {
		Gson gson0 = new Gson();
		
		List<HDD_Info> hddInfoList0 = new ArrayList<HDD_Info>();
		hddInfoList0.add(new HDD_Info(1, "WD5000LPLX", "Black Label Mobile", 7200, "CMR", 32, "HDD", 2.5, "500 GB", "WD"));
		hddInfoList0.add(new HDD_Info(2, "ST500LM034", "Barracuda Pro Mobile", 7200, "SMR", 128, "HDD", 2.5, "500 GB", "Seagate"));
		hddInfoList0.add(new HDD_Info(3, "ST500LX025", "Firecuda Mobile", 5400, "SMR", 128, "SSHD", 2.5, "500 GB", "Seagate"));
		hddInfoList0.add(new HDD_Info(4, "WD10SPSX", "Black Label Mobile", 7200, "SMR", 64, "HDD", 2.5, "1 TB", "WD"));
		hddInfoList0.add(new HDD_Info(5, "ST1000LM049", "Barracuda Pro Mobile", 7200, "SMR", 128, "HDD", 2.5, "1 TB", "Seagate"));
		hddInfoList0.add(new HDD_Info(6, "ST1000LX015", "Firecuda Mobile", 5400, "SMR", 128, "SSHD", 2.5, "1 TB", "Seagate"));
		hddInfoList0.add(new HDD_Info(7, "ST2000LX001", "Firecuda Mobile", 5400, "SSHD", 128, "SSHD", 2.5, "2 TB", "Seagate"));
		
		List<HDD_Info> hddInfoList1 = new ArrayList<HDD_Info>();
		hddInfoList1.add(new HDD_Info(101, "WD5003AZEX", "Black Label", 7200, "CMR", 64, "HDD", 3.5, "500 GB", "WD"));
		hddInfoList1.add(new HDD_Info(102, "WD1003FZEX", "Black Label", 7200, "CMR", 64, "HDD", 3.5, "1 TB", "WD"));
		hddInfoList1.add(new HDD_Info(103, "ST1000DX002", "Firecuda", 7200, "CMR", 64, "SSHD", 3.5, "1 TB", "Seagate"));
		hddInfoList1.add(new HDD_Info(104, "WD2003FZEX", "Black Label", 7200, "CMR", 64, "HDD", 3.5, "2 TB", "WD"));
		hddInfoList1.add(new HDD_Info(105, "ST2000DX002", "Firecuda", 7200, "CMR", 64, "SSHD", 3.5, "2 TB", "Seagate"));
		hddInfoList1.add(new HDD_Info(106, "ST2000DM009", "Barracuda Pro", 7200, "CMR", 128, "HDD", 3.5, "2 TB", "Seagate"));
		
		List<HDD_Info> hddInfoList2 = new ArrayList<HDD_Info>();
		hddInfoList2.add(new HDD_Info(201, "WD1005FBYZ", "Gold Label Enterprise", 7200, "CMR", 128, "HDD", 3.5, "1 TB", "WD"));
		hddInfoList2.add(new HDD_Info(202, "ST1000NM008", "ExOS 7E2 Enterprise", 7200, "CMR", 128, "HDD", 3.5, "1 TB", "Seagate"));
		hddInfoList2.add(new HDD_Info(203, "HUS722T1TALA604", "UltraStar DC HA210 Enterprise", 7200, "CMR", 128, "HDD", 3.5, "1 TB", "WD"));
		hddInfoList2.add(new HDD_Info(204, "MG04ACA100N", "MG Enterprise", 7200, "CMR", 128, "HDD", 3.5, "1 TB", "Toshiba"));
		hddInfoList2.add(new HDD_Info(205, "WD2005FBYZ", "Gold Label Enterprise", 7200, "CMR", 128, "HDD", 3.5, "2 TB", "WD"));
		hddInfoList2.add(new HDD_Info(206, "ST2000NM008", "ExOS 7E2 Enterprise", 7200, "CMR", 128, "HDD", 3.5, "2 TB", "Seagate"));
		hddInfoList2.add(new HDD_Info(207, "HUS722T2TALA604", "UltraStar DC HA210 Enterprise", 7200, "CMR", 128, "HDD", 3.5, "2 TB", "WD"));
		hddInfoList2.add(new HDD_Info(208, "MG04ACA200E", "MG Enterprise", 7200, "CMR", 128, "HDD", 3.5, "2 TB", "Toshiba"));
		
		List<HDD_Info> hddInfoList3 = new ArrayList<HDD_Info>();
		hddInfoList3.add(new HDD_Info(301, "WD2002FFSX", "Red Label Pro", 7200, "CMR", 64, "HDD", 3.5, "2 TB", "WD"));
		hddInfoList3.add(new HDD_Info(302, "ST2000NE0025", "IronWolf Pro", 7200, "CMR", 128, "HDD", 3.5, "2 TB", "Seagate"));
		
		List<HDD> hddList0 = new ArrayList<HDD>();
		hddList0.add(new HDD("NB", hddInfoList0));
		hddList0.add(new HDD("Desktop", hddInfoList1));
		hddList0.add(new HDD("DataCenter", hddInfoList2));
		hddList0.add(new HDD("NAS", hddInfoList3));
		
		String jsonListHDDString0 = gson0.toJson(hddList0);
		
		System.out.println(jsonListHDDString0);
		try {
			File_Conf.writeResultFile(jsonListHDDString0);
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
