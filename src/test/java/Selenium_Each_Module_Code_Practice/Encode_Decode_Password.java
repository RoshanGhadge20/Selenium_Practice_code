package Selenium_Each_Module_Code_Practice;

import java.util.Base64;

public class Encode_Decode_Password 
{
	public static void main(String[] args) 
	{
		String strstring="Roshan@123";
		byte[] encode_pass=Base64.getEncoder().encode(strstring.getBytes());
		System.out.println("Encoded Password:- "+encode_pass);
		
		byte[] decode_pass=Base64.getDecoder().decode(encode_pass);
		System.out.println("Decoded Password:- "+ decode_pass);
		
	}
}
