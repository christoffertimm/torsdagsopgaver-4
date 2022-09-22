import java.util.Random;
class MathWork
{
	static int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
	public static void main(String [] args)
	{
		divisible(2);
		System.out.println(getRandom(arr));
		subtractor(10);

	}
	static void divisible(int a)
	{
		for(int i=0; i<=100; i++)
		{
			if(i%a==0)
			{
				System.out.println(i);
			}
		}
	}
	static int getRandom(int [] arr)
	{
		Random rand = new Random();
		int n = rand.nextInt(arr.length);
		return arr[n];
	}
	static void subtractor(int number)
	{
		if(number>=0)
		{
			System.out.println(number);
			subtractor(number-1);
		}
	}
}
