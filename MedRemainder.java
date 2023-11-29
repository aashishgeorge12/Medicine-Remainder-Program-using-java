package sstring;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) 
	{
		System.out.println("enter the passward");
		Scanner sc=new Scanner(System.in);
		String pass=sc.nextLine();
		sc.close();
		System.out.println(check(pass));
	}
	
	static String check(String pass)
	{
		if(pass.length()<8)
		{
			return "weak";
		}
		if(!(pass.charAt(0)>=48 && pass.charAt(0)<=57))
		{
			return "weak";
		}
		int up=0;
		int sp=0;
		for(int i=1;i<=pass.length()-1;i++)
		{
			if(pass.charAt(i)>=65 && pass.charAt(i)<=90)
			{
				up++;
			}
			if(!(pass.charAt(i)>=65 && pass.charAt(i)<=90 ||pass.charAt(i)>=97 && pass.charAt(i)<=122 || pass.charAt(i)>=48 && pass.charAt(i)<=57))
			{
				sp++;
			}
		}
		if(up>=1&& sp==1)
		{
			return "Strong";
		}
		return "weak";
	}

}
