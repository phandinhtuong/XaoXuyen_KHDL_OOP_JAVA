import java.util.Scanner;

public class Distance {
	public static void main(String[] agrs)
	{
		Scanner scan = new Scanner(System.in);
		double x1 = Double.parseDouble(scan.nextLine());
		double y1 = Double.parseDouble(scan.nextLine());
		double x2 = Double.parseDouble(scan.nextLine());
		double y2 = Double.parseDouble(scan.nextLine());
		scan.close();
	}
	
	public static double Distance(double x1, x2, y1, y2) 
	{
		double d;
		d = Math.sqrt(Math.pow((x1 -x2), 2) +  Math.pow((y1 -y2), 2));
		return d;
	}
	
}
