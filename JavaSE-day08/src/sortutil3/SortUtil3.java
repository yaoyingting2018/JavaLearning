package sortutil3;

import java.util.ArrayList;

public class SortUtil3 {
	public void sort(ArrayList<User> uList) {
			
			for(int i=0;i<uList.size()-1;i++) {
				for(int j=0;j<uList.size()-1-i;j++) {
					int res = uList.get(j).bijiao(uList.get(j+1));
					if(res>0) {
						User tmp = uList.get(j);
						uList.set(j, uList.get(j+1));
						uList.set(j+1, tmp);
					}
				}
				
			}
			
			
		}
}
