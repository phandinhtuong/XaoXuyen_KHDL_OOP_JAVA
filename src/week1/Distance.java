package week1;
//Chuong trinh in ra khoang cach cua 2 diem
// 1.3
public class Distance {
	public static void main(String[] agrs)
	{	
		double x1 = Double.parseDouble(agrs[0]);
		double y1 = Double.parseDouble(agrs[1]);
		double x2 = Double.parseDouble(agrs[2]);
		double y2 = Double.parseDouble(agrs[3]);
		
		System.out.println(distance(x1, x2, y1, y2));
	}
	
	public static double distance(double x1, double x2, double y1, double y2) 
	{
		double d;
		d = Math.sqrt(Math.pow((x1 -x2), 2) +  Math.pow((y1 -y2), 2));
		d = Math.round(d * 100.0) / 100.0;
		return d;
	}
	
}
