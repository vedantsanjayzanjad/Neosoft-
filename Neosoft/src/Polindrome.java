import java.util.Scanner;

public class Polindrome {
	 public static boolean isStringPolinDrome(String str) {
			str=str.toLowerCase();str=str.replaceAll("\\s","").replaceAll("[^a-zA-Z]","");

			StringBuffer stringBuffer = new StringBuffer(str);
			String rev = "";
			String temp = str;

			for(
			int i = str.length() - 1;i>=0;i--)
			{
				rev = rev + str.charAt(i);
			}

			if(rev.equals(temp))
			{
				return true;
			}else
			{
				return false;
			}
		}

		public static void main(String[] args) {

		    Scanner scanner = new Scanner(System.in);
		    String str = scanner.nextLine();

		    boolean stringPolinDrome = isStringPolinDrome(str);
		    
		    if (stringPolinDrome) {
		        System.out.println("YES");
		    } else {
		        System.out.println("No");
		    }
		}
}
