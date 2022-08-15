import java.util.Scanner;

public class Umpire
{
	int gNo;
	int []pNo;
	StringBuffer result=new StringBuffer(); 	
	public void startGame(Guesser g,Player []p)
	{   
		pNo=new int[p.length];
		gNo=g.guessNo();
		for(int i=0;i<p.length;i++)
		{
			pNo[i]=p[i].guessNo(i+1);
		}
	}
	public void compare()
	{
		int f=0;
		for(int i=0;i<pNo.length;i++) 
		{
			if(pNo[i]==gNo)
			{
				f=1;
				result.append(i+1+" ");
			}
		}
		if(f==0)    	  
			result.append("fail");     
	}
	public void announceResult()
	{
		StringBuffer sb=new StringBuffer("fail");
		System.out.print("\n****************************Guesser Game Result***********************");			  	
		if(result.compareTo(sb)!=0)
			System.out.print("\nGame won by player "+result+"\n");
		else
			System.out.print("\nGame lost please try again!\n");			
		System.out.print("\n**********************************************************************");		


	}
}
