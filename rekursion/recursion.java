
public class recursion {
	
	public static void main(String[] args)
	{
		int sum = recursiveSum(5);
		int mul = recursiveMul(9);
		System.out.println(mul);
		System.out.println(sum);
	}
	
	public static int recursiveSum(int n)
	{
		if (n==0)
		{
			return 0;
		}
		return recursiveSum(n-1) + n;
	}
	
	public static int recursiveMul(int n)
	{
		if (n==0)
		{
			return 1;
		}
		return recursiveMul(n-1) * n;
	}
	
}
