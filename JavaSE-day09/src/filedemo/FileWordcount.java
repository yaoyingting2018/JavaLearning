package filedemo;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FileWordcount {
	public static void main(String[] args) throws Exception {
		HashMap<String, Integer> countMap = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/test.txt")));
		String line="";
		while((line=br.readLine())!=null) {
			
			String[] words = line.split(" ");
			for(String word:words) {
				if(countMap.containsKey(word)) {
					Integer value = countMap.get(word);
					countMap.put(word, value+1);
				}else {
					countMap.put(word, 1);
				}
				
			}
		}
		
		// 关流
		br.close();
		
		// 打印结果
		Set<Entry<String, Integer>> entrySet = countMap.entrySet();
		for(Entry<String, Integer> ent:entrySet) {
			
			System.out.println(ent.getKey() + " : " + ent.getValue());
		}
		
		
		
		
	}

}
