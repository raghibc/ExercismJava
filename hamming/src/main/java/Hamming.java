class Hamming {
	private int hammingDist = 0;

    Hamming(String leftStrand, String rightStrand) {
    	
    	if(leftStrand.length() == rightStrand.length()) {
	    	
	    	for(int i = 0; i < leftStrand.length(); i++) {
	    		if(leftStrand.charAt(i) != rightStrand.charAt(i))
	    			++hammingDist;
	    	} 
    	}
    	else {
    		throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");	
    	}
    	
    }
    
    int getHammingDistance() {
    	return hammingDist;
    }

}