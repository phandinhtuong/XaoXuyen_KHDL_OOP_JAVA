package week2;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào số nguyên N và 1 mảng A[] gồm N số nguyên từ bàn phím.
- Sắp xếp mảng A theo thứ tự tăng dần về giá trị và in các phần tử của mảng sau khi sắp xếp ra màn hình trên một dòng, mỗi phần tử cách nhau bởi một khoảng trống.
Ví dụ,
Input:
N = 5
A = { 1, 3, 0, 2, 9}
Ouput:
0 1 2 3 9

6.3
 */
/**
 * Nhập số nguyên N và một mảng A gồm N số nguyên từ bàn phím
 * Sắp xếp A tăng dần về giá trị và in ra mảng đã sắp xếp
 * */
public class SortArray {
	public static int[] sortArray(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					//System.out.println("");
					//printArray(a);
					//System.out.println("");
				}
			}
		}
		return a;
	}
	//public static int[] 
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
	public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	String lineN = scan.nextLine();
    	int n = Integer.parseInt(lineN.substring(1));
    	String lineA = scan.nextLine();
    	String[] a = lineA.split(" ");
    	int[] s = new int[n];
    	for (int i = 0; i < n; i++) {
    		s[i] = Integer.parseInt(a[i]);
    	}
    	printArray(sortArray(s));
    	scan.close();
	}
}
