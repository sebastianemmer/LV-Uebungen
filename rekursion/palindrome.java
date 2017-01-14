
public class palindrome {

	public static void main(String[] args) {
		
		System.out.println(istPalindrom("REnTner"));
		
	}
	
	static boolean istPalindrom(String satz)
	{
	   int li = 0;
	   int re = satz.length()-1;
	   String satzlow;
	   
	   if (li >= re) return true; 
	   
	   satzlow = satz.toLowerCase();
	   
	   
	   if (satzlow.charAt(li) != satzlow.charAt(re)) return false;
	   else
	   {
	      satzlow = satzlow.substring(1,satz.length()-1);
	      System.out.println(satzlow);
	      return istPalindrom(satzlow);
	   }
	}

}
