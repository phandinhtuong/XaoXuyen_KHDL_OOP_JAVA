package week2;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào số nguyên n từ bàn phím,
- Nhập mảng A gồm n số nguyên, in ra màn hình các số nguyên tố có trong mảng A theo đúng thứ tự.
Ví dụ: 
 n = 5
 A = 1 3 4 5 7
 Kết quả in ra màn hình là:
 3 5 7
 
 5.4
 */
//in ra các số nguyên tố có trong mảng
public class PrimesInArray {
	public static boolean isPrime(int k) {
		if (k <= 1)
			return false;
		for (int i = 2; i < k/2 + 1 ; i++) {
			if ((k%i) == 0)
				return false;
		}
		return true;
	}
	public static void printPrime(String[] a, int n) {
		for (int i = 0; i < n; i++) {
			if (isPrime(Integer.parseInt(a[i])))
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
    	String lineN = scan.nextLine();
    	//System.out.print("lineN = " + lineN.substring(1));
    	int n = Integer.parseInt(lineN.substring(1));
    	String lineA = scan.nextLine();
    	String[] a = lineA.split(" ");
    	
    	printPrime(a,n);
    	scan.close();
	}
}
