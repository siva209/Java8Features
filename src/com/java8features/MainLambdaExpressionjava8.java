package com.java8features;

import java.util.ArrayList;

public class MainLambdaExpressionjava8 {
	public static void main(String[] args) {
	
	ArrayList<Object>arrayList=new ArrayList<>();
	arrayList.add(1);
	arrayList.add("siva");
	arrayList.add(1000000.00);
	
//	for(Object o:arrayList) {
//		System.out.println(o);
//	}

	
	arrayList.forEach(list->System.out.println(list));
}
}