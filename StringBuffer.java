package com.jaggu.pack;

import java.io.IOException;

public class StringBuffer
{  
	public static void main(String args[])
	{  
		StringBuffer sb=new StringBuffer();  
		try {
			((Appendable) sb).append("Java");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println(sb);
	} 
}  
