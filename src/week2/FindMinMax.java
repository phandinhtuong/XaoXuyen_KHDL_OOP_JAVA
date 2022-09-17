package week2;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào số nguyên N và 1 mảng A[] gồm N số nguyên từ bàn phím.
- Tìm và in ra giá trị nhỏ nhất và lớn nhất trong mảng A[] trên cùng dòng, cách nhau bởi 01 khoảng trống.
Ví dụ,
Input:
N = 5
A = { 1, 3, 0, 2, 9}
Ouput:
0 9

5.5
 */
/**
 * Chương trình nhập một số nguyên n và mảng gồm n số nguyên
 * sau đó in ra giá trị nhỏ nhất và lớn nhất của mảng trên cùng dòng, 
 * cách nhau bởi một khoảng trống. Cần giữ khung chương trình.
 * */
public class FindMinMax {
	public static int findMin(int Array[]){
        //editing here
		int min = Array[0];
		for (int i = 0; i < Array.length; i++) {
			min = Math.min(min, Array[i]);
		}
		return min;
    }
    
    public static int findMax(int Array[]){
        //editing here
    	int max = Array[0];
    	for (int i = 0; i < Array.length; i++) {
    		max = Math.max(max, Array[i]);
		}
		return max;
    }
    public static void printNumber(int n) {
		System.out.print(n);
		System.out.print(" ");
	}
    
    public static void main(String args[]){
        // editing here
    	Scanner scan = new Scanner(System.in);
    	String lineN = scan.nextLine();
    	//System.out.print("lineN = " + lineN.substring(1));
    	int n = Integer.parseInt(lineN.substring(1));
    	String lineA = scan.nextLine();
    	String[] a = lineA.split(" ");
    	int[] s = new int[n];
    	for (int i = 0; i < n; i++) {
    		s[i] = Integer.parseInt(a[i]);
    	}
    	printNumber(findMin(s));
    	printNumber(findMax(s));
    	scan.close();
    }
}
