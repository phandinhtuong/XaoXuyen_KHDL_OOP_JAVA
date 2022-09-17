package week1;

import java.util.Scanner;

/*
 * Số hoàn thiện (số hoàn hảo) là số có tổng các ước nhỏ hơn nó bằng chính số đó.
 * Hoàn thiện phương thức isPerfect cho trong lớp PerfectNumber để kiểm tra một số nguyên dương n có phải là số hoàn hảo hay không, trả về đúng hoặc sai.
 * 4.1
 */
public class PerfectNumber {
	public static boolean isPerfect(int n)
    {
        // begin edit
        int sum = 0;
        for ( int i=1; i <= n/2; i++){
        	if (n % i == 0)
        		sum = sum + i;
        }
        if (sum == n)
        	return true;
        else 
        	return false;
        //end edit
    }
    public static void main(String []args)
    {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	System.out.println(isPerfect(n));
    	scan.close();
    }
}
