package week2;

import java.util.Scanner;

/**
 * Chương trình cộng 2 mảng số nguyên: 
 * Cho phép đọc số nguyên n, và 2 mảng với n phần tử nguyên
 * Tính và in ra mảng có phần tử là tổng phần tử tương ứng
 * của 2 mảng nhập vào trên một dòng, cách nhau bởi khoảng trống.
 * Yêu cầu giữ cấu trúc các hàm/phương thức đã có, có thể bổ sung nếu cần
 * 5.3
 * */
public class AddArray {
	// hàm/phương thức SumArray trả về tổng 2 mảng nguyên A, B
    // .....{.......}
    public static String[] sumArray(String[] a, String[] b, int n) {
    	String[] c = new String[n];
    	for (int i = 0; i < n; i ++) {
    		c[i] = String.valueOf(Integer.parseInt(a[i]) + Integer.parseInt(b[i]));
    	}
    	return c;
    }
	
    // hàm/phương thức printArray để in một mảng A ra màn hình
    public static void printArray(String[] a) {
    	for (int i = 0; i < a.length; i ++) {
    		System.out.print(a[i]);
    		System.out.print(" ");
    	}
    }
    
    public static void main(String args[]){
        //editing
    	Scanner scan = new Scanner(System.in);
    	String lineN = scan.nextLine();
    	//System.out.print("lineN = " + lineN.substring(1));
    	int n = Integer.parseInt(lineN.substring(1));
    	String lineA = scan.nextLine();
    	String lineB = scan.nextLine();
    	String[] a = lineA.split(" ");
    	String[] b = lineB.split(" ");
    	
    	printArray(sumArray(a,b,n));
    	scan.close();
    }
}
