package week2;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào số nguyên N và  mảng A[] gồm N số nguyên từ bàn phím.
- Kiểm tra mảng vừa nhập có tạo thành một dãy tăng hay không (A[i] < A[i+1] với mọi i = 0, 1 ... (N-2)). In ra màn hình YES nếu dãy tăng và NO nếu ngược lại.
Ví dụ 1
N = 5
A = {1, 2, 3, 4, 6}
Kết quả in ra là
YES
Ví dụ 2
N = 5
A = {1, 2, 3, 4, 4}
Kết quả in ra là
NO

6.2
 */
//Chương trình kiểm tra dãy tăng
public class DayTang {
	public static boolean dayTang(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] >= a[i+1])
				return false;
		}
		return true;
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
    	if (dayTang(s))
    		System.out.println("YES");
    	else
    		System.out.println("NO");
    	scan.close();
	}
}
