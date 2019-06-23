package sortutil1;

import java.util.ArrayList;

public class SortUtil {
	public static void sort(ArrayList<User> uList,BijiaoQi bijiaoQi) {
		for(int i=0;i<uList.size()-1;i++) {
			for(int j=0;j<uList.size()-1-i;j++) {
				
				boolean bijiao = bijiaoQi.bijiao(uList.get(j), uList.get(j+1));
				
				if(bijiao) {
					User tmp = uList.get(j);
					uList.set(j, uList.get(j+1));
					uList.set(j+1, tmp);
				}
			}
			
		}
		
	}
}
