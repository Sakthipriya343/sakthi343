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
	int year=n.nextInt();
	if(year%400==0)
	System.out.println("Leap year");
	else if((year%4==0)&&(year%100!=0))
	System.out.println("Leap year");
	else
	
	System.out.println("Not a Leap year");
	
	
	
	}
}