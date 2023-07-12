package mom;
import java.util.Scanner;   
   
public class RailFenceCipher   
{   
      
    public static String encryptData(String inputStr)   
    {     
    	String encryptStr = "";
    	String s1 = "";
    	String s2 = "";
	
    	for(int i=0; i<inputStr.length(); i++) {
    		if(i % 2 == 0)
    			s1 += inputStr.charAt(i);
    		else if(i % 2 != 0) {
    			s2 += inputStr.charAt(i);
    		}
    	}
    	encryptStr = s1 + s2;
          
        return encryptStr;   
    }   
      
    public static String decryptData(String inputStr)   
    {   
          
        String decryptStr = "";
        String s1 = "";
    	String s2 = "";
    	
        for(int i=0; i<inputStr.length(); i++) {
        	if(i >= 0 && i <= ((inputStr.length()-1)/2))
        		s1 += inputStr.charAt(i);
        	else
        		s2 += inputStr.charAt(i);
        		
        }
        for(int i=0; i < s1.length(); i++) {
        	if((i==s1.length()-1) && (s1.length() > s2.length()))
        		decryptStr += s1.charAt(i);
        	else
        	decryptStr += s1.charAt(i) + "" + s2.charAt(i);
        }
        
        return decryptStr;   
    }   
      
    public static void main(String[] args)   
    {   
        Scanner sc = new Scanner(System.in);   
          
        System.out.println("Enter a string: ");   
        String inputStr = sc.nextLine().toLowerCase();   
        System.out.println("Encrypted Data ===> "+encryptData(inputStr)); 
        System.out.println("Decrypted Data ===> "+decryptData(encryptData(inputStr)));   
          
        sc.close();   
    }   
} 