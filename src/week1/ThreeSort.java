package week1;
//Sắp xếp. Viết chương trình ThreeSort.java nhận 3 giá trị nguyên từ dòng lệnh và 
//in ra màn hình 3 giá trị theo thứ tự tăng dần. Sử dụng hàm Math.min() và Math.max().

//Viết chương trình theo mô tả Bài 13 trong file Bài tập. 
//Đầu vào là 3 số nguyên nhận từ đối dòng lệnh, 
//kết quả là 3 số theo thứ tự tăng dần in trên 1 dòng. (dùng phương thức println in kết quả)
// 1.1
public class ThreeSort
{
		public static void print(String name)
	{
		System.out.println("Hi there! " + name + "---" + "This is ThreSort!" + "---" + "Please enter Three integer: " );
	}
	public static void main(String args[])
	{
		/*int a, b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		
		if (a < b & b < c) 
			System.out.println( a +" " +b +" "+ c);
		if (a < b & b > c)
			System.out.println( a +" "+ c +" "+ b);
		if (a > b & a < c)
			System.out.println( b +" "+ a +" "+ c);
		if (a > b & a > c)
			System.out.println( b +" "+ c +" "+ a);
		if (c < b & a > b)
			System.out.println( c +" "+ b +" "+ a);
		if (c > b & a < b)
			System.out.println( c +" "+ a +" "+ b);*/
		int arr[] = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] =  Integer.parseInt(args[i]);
		}
		int min = arr[0];
		int max = arr[0];
		int indexMin = 0;
		int indexMax = 0;
		for (int i = 0; i < 3; i++) {
            if (arr[i] == Math.min(min, arr[i])) {
                min = Math.min(min, arr[i]);
                indexMin = i;
            }
            if (arr[i] == Math.max(max, arr[i])) {
                max = Math.max(max, arr[i]);;
                indexMax = i;
            }
        }
        int middle = arr[0];
		for (int i = 0; i < 3; i++) {
		    if (i != indexMin && i != indexMax)
                middle = arr[i];
        }
        System.out.println( min + " " + middle + " " + max);
	}
}