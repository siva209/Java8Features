package com.java8features;

public class LambdaWithNoParameters {
interface Additon{
	int add (int a,int b);
}
	public static void main(String[] args) {
		Additon add=(a,b)->(a+b);
			System.out.println(add);
		}

	}


