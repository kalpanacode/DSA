package com.dsa.algo.basic;

import java.util.Arrays;
import java.util.Random;

public class CountZeros {

	public static int countZeros(int a[]) {

		int l =0; int r = a.length-1;

		int mid =0;

		while (l < r)
		{
			mid = (l + r)/2;

			if(a[mid] == 0 && a[mid+1] == 1)
				return mid+1;
			else if (a[mid] == 0 && a[mid+1] == 0)
				l =mid+1;
			else if (a[mid] == 1 && a[mid+1] == 1)
				r = mid;
		}
		return -1;
	}

	public static int[] testcase1(int n) {
		int[] in = new int[n];
		Arrays.fill(in, 0);
		Random r = new Random();
		for(int i = r.nextInt(n); i < n; ++i)
			in[i] = 1;
		return in;
	}

	public static void main(String[] args) {
		int n =35;
		int[] arr = testcase1(n);
		
		for (int i : arr) {
		    System.out.println(i);
		}
		
		// TODO Auto-generated method stub
		System.out.println("# of zeroes are" + countZeros(arr));


	}

}
