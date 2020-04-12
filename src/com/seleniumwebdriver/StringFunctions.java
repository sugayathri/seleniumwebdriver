package com.seleniumwebdriver;


public class StringFunctions {

	public static void main(String[] args) {
		String a="formal";
		String b= "    enormous existence    ";
		String c="EDUCATION";
		String d="Generous";
		String e=" Failures are the stepping stones for success";
		String f[]=e.split("");
		int i;
		for(i=0;i<f.length;i++)
		{
			System.out.println("split method:"+f[i]);
		}
		
			System.out.println("statswith method:"+a.startsWith("f"));
			System.out.println("endswith method:"+a.endsWith("l"));
		System.out.println(b.trim());
	System.out.println(c.toLowerCase());
	System.out.println(d.toUpperCase());
	System.out.println(a.charAt(3));
	System.out.println(d.indexOf("o"));
	System.out.println(a.concat(c));
	System.out.println(a.equals(c));
	System.out.println(a.equalsIgnoreCase(c));
	System.out.println(c.length());
	System.out.println(e.contains("s"));
	System.out.println(a.replace("f", "ab"));
	System.out.println(e.replace(" ", ""));
	}
	
	

}
