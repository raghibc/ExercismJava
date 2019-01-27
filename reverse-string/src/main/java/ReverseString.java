class ReverseString {
	private String reversedString = "";

    String reverse(String inputString) {
    	
    	for(int i = inputString.length()-1; i >= 0; i--) {
    		reversedString += inputString.charAt(i);
    	}
    	
    	return reversedString;
 
    }
  
}