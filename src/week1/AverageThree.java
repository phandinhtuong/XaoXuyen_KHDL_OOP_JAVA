package week1;
/**
 * Program to calculate the average of three (double) numbers
 * The arguments are entered from command line 
 * Use the function Double.parseDouble(String strNumber) to
 * convert a string in (real) number format to its value
 * 1.5
 */
public class AverageThree {
	public static void main(String[] agrs)
	{
		double x = Double.parseDouble(agrs[0]);
		double y = Double.parseDouble(agrs[1]);
		double z = Double.parseDouble(agrs[2]);
		System.out.println(avg(x,y,z));
	}
	public static double avg(double x, double y, double z) {
		double a = 0;
		a = (x + y + z) / 3;
		return a;
	}
}
