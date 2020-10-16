package gsonTwoLayerTest;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class GsonReader {
	public static void main(String[] args) {
		Gson gson0 = new Gson();
		
		List<HDD_Info> hddInfoList0 = new ArrayList<HDD_Info>();
		List<HDD_Info> hddInfoList1 = new ArrayList<HDD_Info>();
		List<HDD_Info> hddInfoList2 = new ArrayList<HDD_Info>();
		List<HDD_Info> hddInfoList3 = new ArrayList<HDD_Info>();
		
		String sourceString = File_Conf.readSourceFile();
		String[] sourceSpace = sourceString.split(System.lineSeparator());
		for(int i = 1; i < sourceSpace.length; i++) {
			String[] itemSpace = sourceSpace[i].split(",");
			if(itemSpace[0].equals("NB")) {
				hddInfoList0.add(new HDD_Info(Integer.parseInt(itemSpace[1]), itemSpace[2], itemSpace[3], Integer.parseInt(itemSpace[4]), itemSpace[5], Integer.parseInt(itemSpace[6]), itemSpace[7], Double.parseDouble(itemSpace[8]), itemSpace[9], itemSpace[10]));
			}
			else if(itemSpace[0].equals("Desktop")) {
				hddInfoList1.add(new HDD_Info(Integer.parseInt(itemSpace[1]), itemSpace[2], itemSpace[3], Integer.parseInt(itemSpace[4]), itemSpace[5], Integer.parseInt(itemSpace[6]), itemSpace[7], Double.parseDouble(itemSpace[8]), itemSpace[9], itemSpace[10]));
			}
			else if(itemSpace[0].equals("DataCenter")) {
				hddInfoList2.add(new HDD_Info(Integer.parseInt(itemSpace[1]), itemSpace[2], itemSpace[3], Integer.parseInt(itemSpace[4]), itemSpace[5], Integer.parseInt(itemSpace[6]), itemSpace[7], Double.parseDouble(itemSpace[8]), itemSpace[9], itemSpace[10]));
			}
			else if(itemSpace[0].equals("NAS")) {
				hddInfoList3.add(new HDD_Info(Integer.parseInt(itemSpace[1]), itemSpace[2], itemSpace[3], Integer.parseInt(itemSpace[4]), itemSpace[5], Integer.parseInt(itemSpace[6]), itemSpace[7], Double.parseDouble(itemSpace[8]), itemSpace[9], itemSpace[10]));
			}
		}
		
		List<HDD> hddList0 = new ArrayList<HDD>();
		hddList0.add(new HDD("NB", hddInfoList0));
		hddList0.add(new HDD("Desktop", hddInfoList1));
		hddList0.add(new HDD("DataCenter", hddInfoList2));
		hddList0.add(new HDD("NAS", hddInfoList3));
		
		String jsonListHDDString0 = gson0.toJson(hddList0);
		
		System.out.println(jsonListHDDString0);
		File_Conf.writeResultFile2(jsonListHDDString0);
	}
}
