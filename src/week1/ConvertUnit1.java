package week1;
//Viết chương trình đổi đơn vị từ m -> inches
// 1.2
public class ConvertUnit1 {
	public static void main(String[] agrs)
	{	
		double x = Double.parseDouble(agrs[0]);
		double y = convertUnit(x);
		System.out.println(y);
	}
	
	public static double convertUnit(double x) {
		double y;
		y = Math.round(x*100/2.54 * 100.0) / 100.0 ;
		return y;
	}
}
