package week2;

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
public class XoaPTtrung2 {
	public static int[] xoa0(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
			{
				for (int j = i; j < a.length; j++) {
					if (j == a.length -1)
						a[j] = 0;
					else
						a[j] = a[j+1];
				}
				
			}
		}
		return a;
	}
	public static int[] xoaPhantu(int A[]){
        // bổ sung mã lệnh ở đây
		for (int i = 0; i < A.length; i++) {
			for (int j = i +1; j < A.length; j++) {
				if (A[i] == A[j])
					A[i] = 0;
			}
		}
		
		return xoa0(A);
    }
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
    public static void main(String Args[]){
        // Nhập dữ liệu từ đây - bổ sung mã lệnh
        Scanner scan = new Scanner(System.in);
     	String lineN = scan.nextLine();
     	int n = Integer.parseInt(lineN.substring(1));
     	String lineA = scan.nextLine();
     	String[] a = lineA.split(" ");
     	int[] s = new int[n];
     	for (int i = 0; i < n; i++) {
     		s[i] = Integer.parseInt(a[i]);
     	}
     	printArray(xoaPhantu(s));
     	scan.close();
     }
}
