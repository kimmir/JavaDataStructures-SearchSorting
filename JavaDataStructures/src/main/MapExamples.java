package main;

import java.io.*;
import java.util.*;

public class MapExamples {

	public static void main(String[] args) {
		System.out.println("Hasmap");
		HashMapExample();
		System.out.println("Linked HashMap");
		LinkedHashMapExample();
		System.out.println("TreeMap");
		TreeMap();
	}
	
	static void HashMapExample() {
		
		Map<String,Integer> hm = new HashMap<>();
		
		hm.put("a",1);
		hm.put("b",2);
		hm.put("c",3);
		hm.put("d",4);
		
		for(Map.Entry<String, Integer> me: hm.entrySet()) {
			System.out.print(me.getKey() + ":" );
			System.out.println(me.getValue());
		}		
	}
	
	static void LinkedHashMapExample() {
		
		Map<String,Integer> lhm = new LinkedHashMap<>();
		
		lhm.put("a34234", 1);
		lhm.put("b", 2);
		lhm.put("c", 3);
		
		for(Map.Entry<String, Integer> e: lhm.entrySet()) {
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
		}
	}
	
	static void TreeMap() {
		
		Map<String,Integer> map = new TreeMap<>();
		
		map.put("c", 1);
		map.put("b", 2);
		map.put("a", 3);
		
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
		}
	}
	
	
}
