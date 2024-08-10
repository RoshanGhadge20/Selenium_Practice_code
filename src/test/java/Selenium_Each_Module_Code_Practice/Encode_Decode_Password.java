package Selenium_Each_Module_Code_Practice;
import java.util.Base64;

public class Encode_Decode_Password 
{
	public static void main(String[] args) 
	{
		
		String strstring="Roshan@123";
		byte[] encode_pass=Base64.getEncoder().encode(strstring.getBytes());
		String  en_str=new String(encode_pass);
		System.out.println("Encoded Password:- "+en_str);
		
		byte[] decode_pass=Base64.getDecoder().decode(encode_pass);
		String de_str= new String(decode_pass);
		System.out.println("Decoded Password:- "+ de_str);
		
		System.out.println("End of program code");
	}
}
