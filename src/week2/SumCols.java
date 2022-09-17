package week2;
/*
 * - Nhập 02 số nguyên dương m, n và một ma trận nguyên A kích thước m x n.
- In ra tổng của các phần tử của mỗi cột trong số n cột, các tổng được viết trên cùng một dòng, các nhau bởi 01 khoảng trống.
Ví dụ
m = 3, n =4
A = 
1 2 4 6
2 1 2 2
5 7 1 9
Cần in ra
8 10 7 17

6.7
 */
//Nhập ma trận A cỡ m x n, sau đó in ra n tổng các phần tử của n cột.

import java.util.Scanner;

public class SumCols {
	public static int[] sumCols(int[][] a) {
		int arraySum[] = new int[a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				arraySum[j] = arraySum[j] + a[i][j];
			}
		}
		return arraySum;
	}
	public static void printMatrix(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
	public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	String lineN = scan.nextLine();
    	int m = Integer.parseInt(lineN.substring(1,2));
    	int n = Integer.parseInt(lineN.substring(3,4));
    	int[][] array = new int [m][n];
    	for (int i = 0; i < m; i++) {
    		String line = scan.nextLine();
    		String[] a = line.split(" ");
        	int[] s = new int[n];
        	for (int j = 0; j < n; j++) {
        		s[j] = Integer.parseInt(a[j]);
        	}
        	array[i] = s;
    	}
    	printMatrix(sumCols(array));
    	scan.close();
	}
}
