class Proverb {
	private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
    	String str = "";
	    	    	
	    for(int i = 0; i <= words.length-1; i++) {
	    		
	    	if(i+1 != words.length)
	    		str += "For want of a " + words[i] + " the " + words[i+1] + " was lost.\n";
	    	else
	    	    str += "And all for the want of a " + words[0] + ".";
	    	
	    }
    
	    return str;
    }
    
}
