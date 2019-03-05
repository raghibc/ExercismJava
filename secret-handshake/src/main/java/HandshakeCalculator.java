import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {
	
    List<Signal> calculateHandshake(int number) {
    				
    	List<Signal> handShake = new ArrayList<Signal>();
    	
    	for(int signalBitPosition = 0; signalBitPosition <= 4; signalBitPosition++) {
    		final int mask = 1 << signalBitPosition;
    		boolean numberContainsSignalBit = ((number & mask) == mask);
    		
    		if(numberContainsSignalBit) {
    			if(mask == 16) {
    				Collections.reverse(handShake);
    			}
    			else {
    				handShake.add(Signal.values()[signalBitPosition]);   		
    			}
    		}		
    	}
    	return handShake;
    }
    
}