package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateElement {

	public static void main(String[] args) {

		String str[]= {"Java","Ruby","JavaScript","C#","Java"};
		
		//1.using HashSet
		Set<String> store=new HashSet<String>();
		
		for(String name:str) {
			if(store.add(name)==false) {
				System.out.println("duplicate element is: " +name);
			}
		}
		
		System.out.println("***************");
		
		//2. Using HashMap
		
		Map<String,Integer> storeMap=new HashMap<String,Integer>();
		for(String name:str) {
			Integer count=storeMap.get(name);
			if(count == null) {
				storeMap.put(name,1);
			}
			else {
				storeMap.put(name, ++count);
			}
				
		}
		
		Set<Entry<String,Integer>> entrySet=storeMap.entrySet();
		for(Entry<String,Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is: "+entry.getKey());
			}
		}
		

	}

}
