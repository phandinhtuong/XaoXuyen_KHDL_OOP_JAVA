package week1;
/*
 * Viết chương trình thực hiện in ra số hoàn hảo nhỏ hơn n.
 * Hoàn thiện các phương thức cho trong lớp NPerfects
 * Ví dụ: n = 100 kết quả là
 * 6 28
 * 4.2
 */
//Bài thực hành in ra các số hoàn hảo nhỏ hơn n với n được nhập từ bàn phím
//Kết quả in trên một dòng các số được cách nhau bởi một dấu cach
public class NPerfects {
	// Hàm kiểm tra số n có phải là số hoàn hảo hay không
    // nếu n là số hoàn hảo thì trả về true, ngược lại trả về false
    static boolean isPerfect(int n)
    {
        //begin edit
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
    // hàm in ra các số hoàn hảo nhỏ hơn n trên cùng dòng, ví dụ n = 100 kết quả in ra là:
    // 6 28
    
    static void printNPerfect(int n)
    {
        for (int i = 0; i < n; i++) {
        	if (isPerfect(i))
        		{
        		System.out.print(i);
        		System.out.print(" ");
        		}
        }
    }
    public static void main (String args[])
    {
        
    }
}
