package week1;
import java.util.Scanner;
/*
 * Một số nguyên dương được gọi là đối xứng nếu viết các chữ số của nó theo chiều ngược lại vẫn được chính số đó. Ví dụ: 1, 2, …, 11, 22, … 101, 121, … là số đối xứng.
Mở rộng lớp (class) PalindromeNumbers, với các phương thức

isPalindrome(int k), kiểm tra số nguyên k có là đối xứng hay không, nếu đúng trả về true, ngược lại trả về false.

Phương thức main cho phép nhập hai số nguyên M và N từ bàn phím, sau đó sử dụng phương thức isPalindrome để kiểm tra và liệt kê các số đối xứng nằm giữa M và N (gồm cả M, N nếu chúng đối xứng và cần xử lý khi M < N hoặc N< M) ra màn hình trên một dòng, 2 số cách nhau bởi 01 khoảng trống, sau khi liệt kê xong cần xuống dòng (bằng cách in ra ký tự \n).

Ví dụ: Với M = 400, N=450 thì cần in ra 404 414 424 434 444
 */
//in ra cac so doi xung giua M và N
// 4.7
public class PalindromeNumbers {
	//ham kiem tra so nguyen k co la doi xung?
    //@para n kieu in
    //@return boolean
    public static boolean isPalindrome(int k)
    {
        // Noi dung ham o day
    	String s = Integer.toString(k);
    	//System.out.println("k = " + k);
    	String[] arr = s.split("");
    	//System.out.println("arr.length = " +arr.length);
    	for (int i = 0; i < arr.length; i++) {
    		//System.out.println("first  arr[" + i + "] = " +arr[i]);
    		//System.out.println("second arr[" + (arr.length -1 - i) + "] = " +arr[arr.length -1 - i]);
    		if (!arr[i].equals(arr[arr.length -1 - i]))
    		{
    			//System.out.println("k = " + k + " is NOT isPalindrome");
    			return false;
    		}
    		//System.out.println("arr[" + i + "] = " +arr[i]);
    	}
    	//System.out.println("k = " + k + " is isPalindrome");
    	return true;
    }

    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
    	int m = scan.nextInt();
    	int n = scan.nextInt();
    	if (m > n)
    	{
    		int temp = m;
    		m = n;
    		n = temp;
    	}
    	for (int i = m; i < n + 1; i ++) {
			if (isPalindrome(i))
				{
				System.out.print(i);
				System.out.print(" ");
				}
		}
    	scan.close();
    }
}
