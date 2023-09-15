class Ternary
{
	public static void main(String[] args) 
	{
		//int x=30, y=20;
		//if(++x<30 && ++y>20)
		//{
		//	x++;
		//}
		//else
		//{
		//	y++;
		//}
		//System.out.println(x+" "+y);

		//int a=10, b=5;
		//String s = (a<b) ? "Hello Rohit" : "hello Suman";
		//System.out.println(s);

		//System.out.println("---------------------------------");

		//int  c = 6;
		//String s1= (c%2==0) ? "Even" : "Odd";
		//System.out.println(s1);

		System.out.println("---------------------------------");

		int x=7, y=3, z=5;
		int res = x<y ? x>z ? x : z : y ;
		System.out.println(res);

		System.out.println("---------------------------------");

		int k = 7, l=88, m=34;
		int res1 = k>l ? k>m ? k:m:l ;
		System.out.println(res1);

		System.out.println("--------------------------------");

		int a=35, b=6, c=34;
		int res2 = (a<b) ? (c>b) ? c : b : (c>a) ? c:a;
		System.out.println(res2);




	}
}
