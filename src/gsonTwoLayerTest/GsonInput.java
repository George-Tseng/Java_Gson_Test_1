package gsonTwoLayerTest;

import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonInput {
	public static void main(String[] args) {
		Gson gson0 = new Gson();
		
		String jsonListHDDString0 = File_Conf.readResultFile();
		List<HDD> testHddList0 = gson0.fromJson(jsonListHDDString0, new TypeToken<List<HDD>>() {}.getType());
		
		StringBuilder sb0 = new StringBuilder(); 
		String result;
		sb0.append("catagory,id,productID,productName,hddRPM,diskType,hddCache,type,size,storage,company" + System.lineSeparator());
		
		for(int i = 0; i < testHddList0.size(); i++) {
			String cata = testHddList0.get(i).getCatagory();
			for(int j = 0; j < testHddList0.get(i).getBasicInfo().size(); j++) {
				sb0.append(cata);
				sb0.append(",");
				sb0.append(testHddList0.get(i).getBasicInfo().get(j).toNormalString());
				if(j < testHddList0.get(i).getBasicInfo().size() - 1) {
					sb0.append(System.lineSeparator());
				}
			}
			if(i < testHddList0.size() - 1) {
				sb0.append(System.lineSeparator());
			}
		}
		
		result = sb0.toString();
		System.out.println(result);
		File_Conf.writeSourceFile(result);
	}
}
