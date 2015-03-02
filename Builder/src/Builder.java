import java.util.Scanner;
public class Builder
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println(" enter in a string");
		String firstString=input.nextLine();
		StringBuilder string= new StringBuilder();
		StringBuilder g=string.append(firstString);
		System.out.println("this string's capacity is "+g.length());
		String second=" I love it!";
		System.out.println("enter in Yes,");
		String Yes=input.nextLine();
		
		string.append(Yes);
		StringBuilder SecondString =string.append(second);
		System.out.print(SecondString);
		System.out.println();
		System.out.println("String capacity is now "+SecondString.length());
	}
}
