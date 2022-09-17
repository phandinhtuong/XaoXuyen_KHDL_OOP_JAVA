package week1;
/*
 * Hoàn thiện phương thức (hàm) isPrime trong file NumberProps.java
 * Phương thức isPrime nhận đối số là một số nguyên k, kiểm tra k có phải số nguyên tố hay không,
 * Nếu k là số nguyên tố phương thức trả lại giá trị true, ngược lại nó trả lại giá trị false.
 * 4.3
 */
//Hoàn thiện hàm kiểm tra số nguyên tố isPrime
//Sinh viên có thể viết thêm các hàm khác nếu cần, tuy nhiên cần giữ nguyên khuôn mẫu hàm isPrime
public class NumberProps {
	//Sinh viên hoàn thiện hàm isPrime, giữ nguyên nguyên mẫu hàm
    public static boolean isPrime(int k){
    	if( k > 1 )
        {
    		for(int i=2; i<=k/2; i++)
        	{
        		if( (k%i) == 0 )
        			return false;
        	}
    		return true;
        }
        return false;
    }
    public static void main (String args[])
    {
        double k = Double.parseDouble(args[0]);
        if (k == (int)k)
        	System.out.println(isPrime((int)k));
        else 
        	System.out.println(false);
    }
}
