
package javaapplication26;

public class NewClass {
    public boolean isPalindrome(int x){
        
        String xString = Integer.toString(x);
        String reverseString = "";
        for(int i = xString.length() -1; i>=0; i--){
            reverseString = reverseString + xString.charAt(i);
        }
        if(reverseString.equals(xString)){
            System.out.println("Palindromo");
            return true;
        } else{
            return false;
        }
    }
}
