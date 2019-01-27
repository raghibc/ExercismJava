import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
    	ArrayList<String> codon = new ArrayList<String>();
    	
    	for(int i = 0; i < rnaSequence.length(); i += 3) {
    		codon.add(rnaSequence.substring(i, i+3));
    	}
    	
    	ArrayList<String> rnaProtein = new ArrayList<String>();
    	
    	for(String str:codon) {
    		
    		if(str.equals("UAA") || str.equals("UAG") || str.equals("UGA")) {
    			break;
    		}
    		
    		switch(str) {
    		
    			case "AUG": rnaProtein.add("Methionine");
    			break;
    			case "UUU":
    			case "UUC": rnaProtein.add("Phenylalanine");
    			break;
    			case "UUA":
    			case "UUG":	rnaProtein.add("Leucine");
    			break;
    			case "UCU":
    			case "UCC":
    			case "UCA":
    			case "UCG": rnaProtein.add("Serine");
    			break;
    			case "UAU":
    			case "UAC": rnaProtein.add("Tyrosine");
    			break;
    			case "UGU":
    			case "UGC": rnaProtein.add("Cysteine");
    			break;
    			case "UGG": rnaProtein.add("Tryptophan");
    			break;
    		}
    		
    	}
    	
    	return rnaProtein;
    }
}