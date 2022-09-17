package week2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Viết chương trình cho phép nhập một số nguyên dương n, và một mảng gồm n phần tử nguyên. 
 * Sau đó viết hàm/phương thức để xếp tất cả các phần tử giá trị lẻ về đầu mảng, các phần tử giá trị chẵn về cuối mảng. 
 * Thứ tự xuất hiện các giá trị trong mỗi nhóm cần được giữ nguyên.
 * In mảng kết quả ra màn hình trên một dòng, các giá trị cách nhau bởi 01 khoảng trống.
Ví dụ:
Đầu vào
10
1 24 7 13 20 14 37 0 12 8
Cần có đầu ra:
1 7 13 37 24 20 14 0 12 8

6.1
 */
/**
 * chương trình nhập số nguyên n và mảng gồm n số nguyên
 * hàm/phương thức groupArray xếp số lẻ về đầu, số chẵn về cuối mảng
 * Bổ sung thêm các hàm/phương thức khác nếu cần
 * */
public class GroupArray {
	// Định nghĩa hàm/phương thức groupArray() ở đây
    // .....  groupArray(.....)
	public static int[] groupArray(int[] a) {
		int[] le = null;
		int[] chan = null; //new int[a.length];
		int[] grouped = null;
		/*for (int i = 0; i < a.length; i++) {
			if ((a[i]%2) == 1)
				le[i] = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if ((a[i]%2) == 0)
				chan[i] = a[i];
		}
		System.out.print("le = ");
		printArray(le);
		System.out.println(" ");
		System.out.print("chan = ");
		printArray(chan);
		
		//grouped = Arrays.copyOf(le, le.length + chan.length); -- trailing 0's
		//System.arraycopy(chan, 0, grouped, le.length, chan.length);
		int leLength = 0;
		for (int i = 0; i < le.length; i++) {
			if (le[i] == 0)
				leLength = i;
		}
		System.out.println(leLength);
		grouped = le;
		for (int i = 0; i < chan.length; i++) {
			grouped[leLength-2+i] = chan[i];
		}
		return grouped;*/
		
		for (int i = 0; i < a.length; i++) {
			if ((a[i]%2) == 1)
				le = appendArray(le,a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			if ((a[i]%2) == 0)
				chan = appendArray(chan,a[i]);
		}
		grouped = concatArrays(le,chan);
		return grouped;
		
	}
	public static int[] concatArrays(int[] a, int[] b) {
		int[] c = a;
		for (int i=0; i< b.length; i++) {
			c = Arrays.copyOf(c, c.length + 1);
			c[c.length-1] = b[i];
		}
		return c;
	}
	public static int[] appendArray(int[] a, int n) {
		if (a == null) {
			a = new int[1];
			a[0] = n;
			return a;
		}else
		{
			a = Arrays.copyOf(a, a.length + 1);
			a[a.length-1] = n;
			return a;
		}
	}
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
    public static void main(String args[]){
        // ... editing 
    	Scanner scan = new Scanner(System.in);
    	String lineN = scan.nextLine();
    	int n = Integer.parseInt(lineN.substring(1));
    	String lineA = scan.nextLine();
    	String[] a = lineA.split(" ");
    	int[] s = new int[n];
    	for (int i = 0; i < n; i++) {
    		s[i] = Integer.parseInt(a[i]);
    	}
    	printArray(groupArray(s));
    	scan.close();
    }
}
