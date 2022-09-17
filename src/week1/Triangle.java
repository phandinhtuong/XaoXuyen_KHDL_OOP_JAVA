package week1;
/*
Hoàn thiện các hàm isTriangle(double x1, double y1, double x2, double y2, double x3, double y3) và isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3)  cho trong lớp Triangle. 

Hàm isTriangle kiểm tra ba tọa độ thực (x1, y1); (x2, y2) và (x3, y3)  có lập thành ba đỉnh của tam giác hay không, nếu đúng thì trả về true; ngược lại trả về false.

Hàm isRightTriangle kiểm tra ba tọa độ thực (x1, y1); (x2, y2) và (x3, y3)  có lập thành ba đỉnh của tam giác vuông hay không, nếu đúng thì trả về true; ngược lại trả về false.

(được dùng cấu trúc if ... else  và cũng có thể không dùng nếu thấy không cần thiết). 
2.3
 */

/*
 * Hoàn thiện các hàm isTriangle(double a, double b, double c) và getArea (double a, double b, double c)  cho trong lớp Triangle. 

Hàm isTriangle kiểm tra ba số thực a, b, c:  nếu chúng lập thành ba cạnh của tam giác thì trả về true; ngược lại trả về false (có thể copy phần này từ bài RightTriangle).

Hàm getArea cho phép tính diện tích tam giác tạo bởi ba số thực a, b, c (nếu đó là ba cạnh tam giác). Ngược lại, nếu a, b, c không tạo thành ba cạnh của tam giác, hàm này trả về 0 (được dùng cấu trúc if ... else). 
3.4
 */
public class Triangle {
	//2.3
	public static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
		// begin edit
		//Shoelace formula to determine the area
		double a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        if (a == 0) 
        	return false;
        else
        	return true;
        //end edit
    }
	public static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        // begin edit
		// calculate the length of sides of triangle and using Pythagoras Theorem
		double a = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		double b = Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2);
		double c = Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2);
		
		if ((a > 0 && b > 0 && c > 0) && (a == (b + c) || b == (a + c) || c == (a + b)))
			return true;
		else 
			return false;
        //end edit         
    }
	
	//3.4
	public static boolean isTriangle(double a, double b, double c)
    {
        // begin edit 
		a = Math.pow(a,2);
		b = Math.pow(b,2);
		c = Math.pow(c,2);
		
		if ((a > 0 && b > 0 && c > 0) && (a == (b + c) || b == (a + c) || c == (a + b)))
			return true;
		else 
			return false;
        //end edit
    }
    public static double getArea(double a, double b, double c)
    {
        // begin edit 
        double area = 0;
        double p = (a+b+c)/2;       
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    	return area;
        //end edit         
    }
    public static void main(String [] args)
    {
        /*double x1 = Double.parseDouble(args[0]);
        double x2 = Double.parseDouble(args[1]);
        double x3 = Double.parseDouble(args[2]);
        double y1 = Double.parseDouble(args[3]);
        double y2 = Double.parseDouble(args[4]);
        double y3 = Double.parseDouble(args[5]);
        System.out.println(isTriangle(x1,x2,x3,y1,y2,y3) + " " + isRightTriangle(x1,x2,x3,y1,y2,y3));*/
    }
}
