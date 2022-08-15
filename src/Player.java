import java.util.Scanner;

public class Player
{
	int guessNo;
	public int guessNo(int i)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlayer "+i+" Please Guess No : ");
		guessNo=sc.nextInt();
		return guessNo;
	}
}
