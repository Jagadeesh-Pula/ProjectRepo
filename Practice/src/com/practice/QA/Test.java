package com.practice.QA;

public class Test {
	public static void main(String[] args) {

		int n = numFilter(12, 32, 222, 43, 65);
		System.out.println(n);

	}

	public static int numFilter(int num1, int num2, int num3, int num4, int num5) {

		if ((num1 >= num2) && (num1 >= num3) && (num1 >= num4) && (num1 >= num4) && (num1 >= num3))
			return num1;
		else if ((num2 >= num1) && (num2 >= num3) && (num2 >= num4) && (num2 >= num5))
			return num2;
		else if ((num3 >= num1) && (num3 >= num2) && (num3 >= num4) && (num3 >= num5))
			return num3;
		else if ((num3 >= num1) && (num3 >= num2) && (num3 >= num4) && (num3 >= num5))
			return num3;
		else if ((num4 >= num1) && (num4 >= num2) && (num4 >= num3) && (num4 >= num5))
			return num4;
		else if ((num5 >= num1) && (num5 >= num2) && (num5 >= num3) && (num5 >= num4))
			return num5;

		return 0;

	}

}
