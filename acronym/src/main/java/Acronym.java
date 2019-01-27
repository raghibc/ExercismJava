class Acronym {
	private String acronym = "";

    Acronym(String phrase) {
    	String[] words = phrase.split(" ");
    	String acronym = "";
    	
    	for(int i = 0; i < words.length; i++) {
    		for(int j = 0; j < words[i].length(); j++) {
    		
    			if(j == 0 && Character.isLetter(words[i].charAt(j))) {
    				acronym += words[i].charAt(j);
    			}
    			if(j != 0 && Character.isLetter(words[i].charAt(j))) {
    				if(words[i].charAt(j-1) == '_' || words[i].charAt(j-1) == '-') {
    					acronym += words[i].charAt(j);
    				}
    			}
    		}		
    	}
    	
    	this.acronym = acronym.toUpperCase();
    }

    String getAcronym() {
    	return acronym;
    }

}
