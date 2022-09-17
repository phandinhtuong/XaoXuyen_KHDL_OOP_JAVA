package week1;
import java.lang.Math.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

//Viết chương trình tính exp theo công thức khai triển Taylor được mô tả trong file Đề bài tinh_exp.pdf
//Khuôn mẫu các phương thức và lớp cần được giữ nguyên 
//Có thể bổ sung thêm các phương thức khác nếu cần!
// 4.5
public class Exp {
	// phương thức dblExp tính và trả về giá trị gần đúng của e^x
    public static double dblExp(double x, int n){
        //begin editing 
        double e = 1;
        for (int i = 1; i < n + 1; i++) {
        	//e = e + Math.pow(x, i) / factorial(i));
        	//BigInteger numerator = BigInteger.valueOf((long)Math.pow(x, i));
        	BigDecimal numerator = power(x,i);
        	//System.out.println("numerator: "+numerator);
        	
        	BigDecimal denominator = new BigDecimal(factorial(i));
        	//System.out.println("denominator: "+denominator);
        	
        	BigDecimal fraction = numerator.divide(denominator,100, RoundingMode.HALF_UP) ;
        	//System.out.println("fraction: "+fraction);
        	
        	e = e + fraction.doubleValue();
        	//System.out.println("e = " + e);
        	
        	//System.out.println("dblExp: "+x+"^"+i+" = " + (Math.pow(x, i)));
        	//System.out.println("dblExp: "+i+"! = " + factorial(i));
        	//System.out.println("dblExp: "+x+"^"+i+"/"+i+"! = " + (Math.pow(x, i) / factorial(i)));
        	//System.out.println("dblExp: "+"x = " + x + ", n = " + n + ", e = " + e);
        	//System.out.println(" ");
        }
    	return e;
        //end editing
    }
    public static BigDecimal power(double x, int i) {
    	BigDecimal xInBigDecimal = new BigDecimal(x);
    	BigDecimal p = xInBigDecimal.pow(i);
    	return p;
    }
    public static BigInteger factorial(int n) {
    	BigInteger f = BigInteger.valueOf(1);
    	for (int i = 2; i < n + 1; i++) {
        	f = f.multiply(BigInteger.valueOf(i));
        	//System.out.println("factorial: i = " + i + ", f = " + f);
        }
    	return f;
    }
    
    public static void main(String args[]){
        //double x = Double.parseDouble(args[0]);
        //int n = Integer.parseInt(args[1]);
        
        double x = 2.5;
        int n = 1000;
        
        System.out.println(Math.round(dblExp(x, n)*1000.0)/1000.0);
    }
}
