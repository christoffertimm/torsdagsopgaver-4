class Task2
{
	public static void main(String [] args)
	{
		printPartOfWord("Makker",2,4);
	}
	public static void printPartOfWord(String ordet, int start, int længden)
	{

		System.out.println(ordet.substring(start,længden));
	}
}