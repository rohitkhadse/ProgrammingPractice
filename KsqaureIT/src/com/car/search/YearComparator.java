package com.car.search;

import java.util.Comparator;

public class YearComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Car c1=(Car)o1;
		Car c2=(Car)o2;
		
		if(c1.getYear() == c2.getYear())
			return 0;
		else if(c1.getYear() > c2.getYear())
			return 1;
		else 
			return -1;
	}

}
