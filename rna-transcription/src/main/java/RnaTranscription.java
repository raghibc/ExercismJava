class RnaTranscription {

    String transcribe(String dnaStrand) {
    	String transcribedString = "";
    	
    	for(int i = 0; i < dnaStrand.length(); i++) {
    		
    		if(dnaStrand.charAt(i) == 'G')
    			transcribedString += 'C';
    		else if(dnaStrand.charAt(i) == 'C')
    			transcribedString += 'G';
    		else if(dnaStrand.charAt(i) == 'T')
    			transcribedString += 'A';
    		else 
    			transcribedString += 'U';
    
    	}
    	
    	return transcribedString;

    }

}
