package controller;
import java.util.Scanner;

public class SloController {
	
	private double myDouble = 7.3;
	private double yourDouble = 12.8;
	private boolean biggerInt;
	private Scanner myScanner;
	private boolean DeathtoFakeMetal = true;
	private int EndAll = 1;
	
void Start()
{
	myScanner = new Scanner(System.in);
	
	
	if(myDouble < yourDouble)
	{
		
		biggerInt = false;
		System.out.println("it is " + biggerInt + " that your Double is bigger than mine");
		myDouble ++;
	}
	
	else
	{
		biggerInt = true;
		System.out.println("your number may have been the bigger " + biggerInt + " But it wont be the next time");
		yourDouble++;
		yourDouble++;
		
		
		
	}
	
	if(DeathtoFakeMetal = true)
	{
		System.out.println("My number was " + myDouble + " your number was " + yourDouble);
		
	}
	else
	{
		System.out.println("You broke it");
	}
if(EndAll > 6)
{
	System.out.println("Wow you played till you won didnt you");
}
else
{
	EndAll ++;
}
	
KickBack();
}
public void KickBack()
{
	myScanner.nextLine();
	Start();
	
}
	



}