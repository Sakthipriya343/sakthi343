/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	
		int n=345,lastdigit,sum=0;
		while(n!=0)
		{
		    lastdigit=n%10;
		    sum=sum+lastdigit;
		    n=n/10;
		}
			System.out.println(sum);
	}
}