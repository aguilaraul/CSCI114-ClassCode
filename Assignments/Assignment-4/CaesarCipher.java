/**
 * @author raul aguilar
 */
import java.util.Scanner;

public class CaesarCipher {
	public static String encrypt(String s, int shift) {
		if (shift>26) {
			shift = shift%26;
		}
		String cipher = "";
	      	int length = s.length();
  		for(int i = 0; i<length; i++) {
    			char l = s.charAt(i);
    			if (Character.isLetter(l)) {
      				if (Character.isLowerCase(l)){
					char c = (char) (l+shift);
					if (c>'z') {
						cipher += (char) (l - (26-shift));
					} else if (c<'a') {
						cipher += (char) (l + (26+shift));
					} else {
						cipher += c;
					}
				} else if(Character.isUpperCase(l)) {
					char c = (char) (l+shift);
					if (c>'Z') {
						cipher += (char) (l - (26-shift));
					} else if (c<'A') {
				  		cipher += (char) (l + (26+shift));
					} else {
				    		cipher += c;
					}
				}
			} else {
				cipher += l;
			}
		}
		return cipher;
	}
	public static String decrypt(String s, int shift) {
		if (shift>26) {
			shift = shift%26;
		}

	      	String cipher = "";
	      	int length = s.length();
	      	for(int i = 0; i<length; i++) {
		    	char l = s.charAt(i);
		    	if (Character.isLetter(l)) {
			  	if (Character.isLowerCase(l)){
					char c = (char) (l-shift);
					if (c>'z') {
				      		cipher += (char) (l - (26-shift));
					} else if (c<'a') {
				    		cipher += (char) (l + (26-shift));
					} else {
				      		cipher += c;
					}
			  	} else if(Character.isUpperCase(l)) {
			      		char c = (char) (l-shift);
			      		if (c>'Z') {
				    		cipher += (char) (l - (26-shift));
			      		} else if (c<'A') {
				  		cipher += (char) (l + (26-shift));
			      		} else {
				    		cipher += c;
			      		}
			  	}
		    	} else {
			  	cipher += l;
		    	}
	      	}
	      	return cipher;
	}

	public static String augustusCipher(String s) {
	      	String cipher = "";
		int length = s.length();

		for(int i = 0; i<length; i++) {
		    	char l = s.charAt(i);
		    	if (Character.isLetter(l)) {
			  		if (Character.isLowerCase(l)){
						char c = (char) (l+1);
						if (c>'z') {
				      		cipher += "aa";
						} else {
				      		cipher += c;
						}
			  		} else if(Character.isUpperCase(l)) {
			      		char c = (char) (l+1);
			      		if (c>'Z') {
				    		cipher += "AA";
			      		} else {
				    		cipher += c;
			      		}
			  		}
		    	} else {
			  		cipher += l;
			  	}
		}
		return cipher;
	}

	public static String augustusDecipher(String s) {
		String cipher = "";
		int length = s.length();

		for(int i = 0; i<length; i++) {
		    	char l = s.charAt(i);
		    	if (Character.isLetter(l)) {
			  		if (Character.isLowerCase(l)){
						char c = (char) (l-1);
						if (c<'a') {
				      		cipher += "z";
				      		i++;
						} else {
				      		cipher += c;
						}
			  		} else if(Character.isUpperCase(l)) {
			      		char c = (char) (l-1);
			      		if (c<'A') {
				    		cipher += "Z";
				    		i++;
			      		} else {
				    		cipher += c;
			      		}
			  		}
		    	} else {
			  		cipher += l;
			  	}
		}
		return cipher;
	}	
	
	public static void main(String[] args) {
	  	Scanner scan = new Scanner(System.in);
	  	String message;
		int shift = 0;
	  	
		System.out.printf("%s%n", "Please enter a message you'd like to encrypt");
	  	message = scan.nextLine();
		System.out.printf("%s%n", "Please enter the shift you'd like use");
	  	shift = scan.nextInt();

	  	System.out.println();
	  	System.out.println("Caesar Cipher:");
	  	System.out.println(message);
	  	String cipher = encrypt(message, shift);
	  	System.out.println(cipher);
	  	System.out.println(decrypt(cipher, shift));
	  	
		System.out.println();
		String encryptedAugustus = augustusCipher(message);
		String decryptedAugustus = augustusDecipher(encryptedAugustus);
	  	System.out.println("Augustus Cipher:");
	  	System.out.println(message);
		System.out.println(encryptedAugustus);
		System.out.println(decryptedAugustus);
    }

}
