package week2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Chương trình cho phép nhập một số nguyên dương n và một mảng A gồm n số nguyên. 
Viết phương thức xoaPhantu(int A[], int k) cho phép xóa phần tử có chỉ số k khỏi mảng A và trả lại mảng kết quả.
Duyệt mảng A, nếu có giá trị lặp lại (phần tử sau có giá trị giống với phần tử đã xuất hiện trước đó) 
thì sử dụng phương thức xoaPhantu để xóa các phần tử có giá trị lặp, chỉ để lại phần tử xuất hiện đầu tiên mang giá trị đó.
In mảng kết quả ra màn hình trên một dòng, các phần tử cách nhau bởi 01 khoảng trống.
Ví dụ:
Đầu vào:
n = 8
A = {2, 3, 5, 3, 5, 7, 2, 5}
Đầu ra cần in ra:
2 3 5 7
Hướng dẫn: 
- Viết phương thức xoaPhantu như đã hướng dẫn ở phần bài tập mảng.
- Dùng vòng lặp duyệt từ chỉ số i = 0 của mảng A, chừng nào còn chưa hết mảng A hiện tại, thì xét các phần tử sau vị trí hiện tại: 
Nếu có A[k] == A[i] thì gọi phương thức xoaPhantu để xóa phần tử vị trí k. Tăng i và lặp lại quá trình trên.

7.3
 */
/**
 * Chương trình xóa phần tử trùng lặp trong mảng, chỉ để lại phần tử xuất hiện đầu tiên
 * import các thư viện (nếu cần thiết) - Bổ sung các phương thức/hàm (nếu cần thiết)
 * Giữ lại khung chương trình và phương thức xoaPhantu ở dưới
 * **/
public class XoaPTtrung {
	public static int[] xoaPhantu(int A[], int k){
        // bổ sung mã lệnh ở đây
		int[] r = new int[A.length-1];
		for (int i = 0; i < A.length; i++) {
			if (i < k)
			{
				r[i] = A[i];
			}
			else 
			{
				for (int j = i; j < A.length -1; j++) {
					r[j] = A[j+1];
				}
				return r;
			}
		}
		return null;
    }
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
    public static void main(String Args[]){
        // Nhập dữ liệu từ đây - bổ sung mã lệnh
        /*Scanner scan = new Scanner(System.in);
     	String lineN = scan.nextLine();
     	int n = Integer.parseInt(lineN.substring(1));
     	String lineA = scan.nextLine();
     	String[] a = lineA.split(" ");
     	int[] s = new int[n];
     	for (int i = 0; i < n; i++) {
     		s[i] = Integer.parseInt(a[i]);
     	}*/
     	
     	int s[] = {43,11,-9,79,-60,40,-66,-74,97,-59,-2,62,-32,-72,85,-80,35,7,27,-61,-96,-70,71,71,-60,99,77,-84,84,11,-80,-57,-57,-88,-67,33,-49,60,37,8,-51,44,26,-33,58,41,90,58,-49,-33,1,29,15,55,65,35,-5,0,76,-98,-58,-5,-61,-61,75,-84,-26,34,44,98};
     	
     	// xóa trước đến sau
     	/*for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j])
					s = xoaPhantu(s,i);
			}
		}*/
     	
     	// xóa sau đến trước nhưng bị mất index
     	/*for (int i = s.length -1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.println("i = " + i + ", j = "+ j);
				if (s[i] == s[j]) {
					s = xoaPhantu(s,i);
					printArray(s);
					System.out.println();
				}
			}
		}*/
     	/*int i = 0;
     	while(i < s.length) {
     		for (int j = i+1; j < s.length; j++) {
				System.out.println("i = " + i + ", j = "+ j);
				if (s[i] == s[j]) {
					s = xoaPhantu(s,j);
					printArray(s);
					System.out.println();
				}
			}
     		i++;
     	}*/
     	
     	/*int i = 0;
     	while(i < s.length) {
     		int j = i+1;
     		while (j < s.length) {
     			System.out.println("i = " + i + ", j = "+ j);
				if (s[i] == s[j]) {
					s = xoaPhantu(s,j);
					printArray(s);
					System.out.println();
				}
				j++;
     		}
     		i++;
     	}*/
     	
     	int i = 0;
     	while(i < s.length) {
     		int j = s.length -1;
     		while (j >= 0) {
     			System.out.println("i = " + i + ", j = "+ j);
				if (s[i] == s[j] && i != j) {
					s = xoaPhantu(s,j);
					printArray(s);
					System.out.println();
				}
				j--;
     		}
     		i++;
     	}
     
     	printArray(s);
     	//scan.close();
     }
}
