import java.util.Scanner;

class Accio
{
	public static void countVowels(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++))
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public class Main
	{
	public static void main (String[] args) throws java.lang.Exception
		{
      Scanner sc=new Scanner(System.in);
      String sentence=sc.nextLine();
      Accio Obj=newAccio();
      Obj.countVowels(sentence);
		}
	}
}