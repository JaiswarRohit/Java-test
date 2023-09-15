class LFTest 
{
	public static void main(String[] args) 
	{
		int a = 6;
		int b = ++a*2+a++;
		System.out.println(b);

		int x = 6;
		int y= x-- + --x + x++ - ++x;
		System.out.println(y);

		int q = 3;
		int q1 = q-- + q++ - --q * ++q + q--;
		System.out.println(q1);

		int l = 10;
		int l1= l-- * --l * l++ - l-- * l++;
		System.out.println(l1);

		int g=4;
		int g1= g-- / ++g * --g + g++ * g-- - --g / g++;
		System.out.println(g1);
	}

}