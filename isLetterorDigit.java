
public class isLetterorDigit {
	 public static void main(String[] args) {
     
	      char ch1, ch2;
  
	      ch1 = 'p';
	      ch2 = '1';
 
	      boolean b1, b2;

	      b1 = Character.isLetterOrDigit(ch1);
	      b2 = Character.isLetterOrDigit(ch2);

	      String str1 = ch1 + " é letra " + b1;
	      String str2 = ch2 + " é digito " + b2;

	      
	      System.out.println( str1 );
	      System.out.println( str2 );
	   }
	}



