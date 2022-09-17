package week2;
/*
 * Viết chương trình cho phép nhập các số nguyên dương m, n và k trong khoảng [0, n - 1]. 
Sau đó nhập ma trận nguyên A kích thước m x n, rồi xóa đi cột chỉ số k từ ma trận A.
In ma trận kết quả ra màn hình, mỗi dòng ma trận trên một dòng, các phần tử trong dòng cách nhau bởi 01 khoảng trống.
Ví dụ đầu vào:
m = 4, n = 5, k = 3
A =
1  3  7  9  10
2 6  3  11  20
5 9 13 12 1
5 5 7  10  1
Đầu ra:
1 3 7 10
2 6 3 20
5 9 13 1
5 5 7 1

6.5
 */

import java.util.Scanner;

/**
 * Chương trình nhập ma trận nguyên kích thước m x n,
 * sau đó xóa đi dòng có chỉ số k
 * **/
public class XoaCot {
	public static int[][] xoaCot(int[][] a, int k){
		int[][] r = new int[a.length][a[0].length-1];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				//System.out.println("i = " + i + ", j = "+ j + ", k = "+ k);
				if (j >= k - 1)
				{
					if (j != a[0].length -1)
						r[i][j] = a[i][j+1];
				}
				else
					r[i][j] = a[i][j];
			}
		}
		return r;
	}
	public static void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	String lineN = scan.nextLine();
    	int m = Integer.parseInt(lineN.substring(1,2));
    	int n = Integer.parseInt(lineN.substring(3,4));
    	int k = Integer.parseInt(lineN.substring(5,6));
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
    	printMatrix(xoaCot(array, k+1)); // đề để k bắt đầu từ 0 nên phải k +1
    	scan.close();
	}
}
