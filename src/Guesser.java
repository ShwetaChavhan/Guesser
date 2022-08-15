import java.util.Scanner;

public class Guesser 
{
	int guessNo;
	public int guessNo()	
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("\nGuesser please guess no between 1-100 : ");
			guessNo=sc.nextInt();
			if(guessNo>=1&&guessNo<=100)
				break;	 		
		}
		return guessNo;
	}
}
