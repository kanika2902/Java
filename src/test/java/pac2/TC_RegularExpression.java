package pac2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class TC_RegularExpression {

	public static void main(String[] args) {
		String input="12345";
		String regex="\\d+";
		
		Pattern p=Pattern.compile(regex);
		Matcher m = p.matcher((input));

		boolean result=m.matches();
		
		if(result==true) {
			System.out.println("Valid");
			
		}
		else {
			System.out.println("InValid");

		}
		
		String input1="Shop,Mop,Hopping,Chopping";
		Pattern pattern=Pattern.compile("hop");
		Matcher match=pattern.matcher(input1);
		System.out.println(match.matches());
		
		while(match.find()) {
			System.out.println(match.group()+":"+match.start()+":"+match.end());
		}
		
		String phno="87694899739";
		String regex1="\\d{10}";
		Pattern pattern2=Pattern.compile(regex1);
		Matcher match1=pattern2.matcher(phno);
		System.out.println(match1.matches());
		
		
		String inp="Exo1";
		String regex3="^[A-Z][a-z]+[0-9]$";
		Pattern pattern3=Pattern.compile(regex3);
		Matcher match2=pattern3.matcher(inp);
		System.out.println(match2.matches());
		
		
		String email="test.user@gmail.com";
		String regex4="^[A-Za-z0-9._%+-]+@[A-Za-z0-9._%+-]+\\.[A-Za-z]{2,}$";
		Pattern pattern4=Pattern.compile(regex4);
		Matcher match3=pattern4.matcher(email);
		System.out.println(match3.matches());
		
		
	}

}
