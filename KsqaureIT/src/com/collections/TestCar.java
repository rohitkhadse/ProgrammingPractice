package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCar {

	public static void main(String[] args) {
		
		List<Car> al = new ArrayList<Car>();

		Map<Integer,Car> hmap = new HashMap<Integer,Car>();
		for(int i=0;i<100000;i++){
			Car c = new Car(i,i+"a",2000+i,i+"sedan",i*100);
			hmap.put(c.getId(),c);
			al.add(c);
		}
		
		System.out.println("Time before searching ="+ System.currentTimeMillis() +"ms");
		searchArrayList(al,99945);
		searchMap(hmap,9999);
		
	}

	private static void searchArrayList(List<Car> al, int i) {
		for(Car c : al){
			if(i==c.getId()){
				System.out.println(c);
				System.out.println("Time After searching in ArrayList = "+ System.currentTimeMillis() +"ms");
			}
		}
		
	}

	private static void searchMap(Map<Integer, Car> hmap, int i) {
		for(Map.Entry<Integer,Car> m:hmap.entrySet()){
			Car c = m.getValue();
			if(i == m.getKey()){
				System.out.println(c);
				System.out.println("Time After searching in Hashmap = "+ System.currentTimeMillis() +"ms");
			}
		}
	}

}
