package javaprojects;

import java.util.HashMap;
import java.util.Map;

public class characteroccurances {
	
	public static void main(String[] args) {
		String str= "JavaArrofCharacters";
		String str1= "PrasanthNeedsProjectinChennai";
		characteroccurances occ = new characteroccurances();
		occ.CheckOccurance(str);
		occ.CheckOccurance(str1);
	}
	
	public void CheckOccurance(String str){
		char[] arr= str.toCharArray();
		Map<Character , Integer> map=new HashMap<Character,Integer>(); 
		for(char ar:arr){
			if(map.containsKey(ar)){
				map.put(ar, map.get(ar)+1);
			}
			else{
				map.put(ar,1);
			}
		}
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.keySet());
	}
}
