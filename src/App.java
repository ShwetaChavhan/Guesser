import java.util.Scanner;

public class App
{
  public static void main(String []args)
  {     
	  System.out.print("\n*****************Welcome to Guesser Game ****************** : ");        
	  Guesser g=new Guesser();      
      System.out.print("\nEnter no of players : ");        
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      Player []p=new Player[n];
      for(int i=0;i<n;i++)
      {
      	p[i]=new Player();
      }
	  Umpire u=new Umpire();
	  u.startGame(g,p);
	  u.compare();
	  u.announceResult();
  }
}

 