import java.util.Scanner;
public class Builder
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println(" enter in a string");
		String firstString=input.nextLine();
		StringBuilder string= new StringBuilder();//String Builder class instance
		StringBuilder g=string.append(firstString);//first string's length
		System.out.println("this string's capacity is "+g.length());
		String second=" I love it!";
		System.out.println("enter in Yes,");
		String Yes=input.nextLine();
		
		string.append(Yes);//append yes string and secondString in order so they're printed in order
		StringBuilder SecondString =string.append(second);
		System.out.print(SecondString);
		System.out.println();
		System.out.println("String capacity is now "+SecondString.length());
	}
}
