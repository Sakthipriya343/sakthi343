/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner n=new Scanner(System.in);
	int a=n.nextInt();
	int flag=0;
	int i;
	if(a==0||a==1)
	flag++;
	for(i=2;i<=a;i++)
	{
	    if(a%i==0)
	    flag++;
	    
	}
	if(flag==0)
	System.out.println("Prime number");
	else
		System.out.println("Not a Prime number");
	}
}