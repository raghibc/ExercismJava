class Darts {	
	private double distanceMaxInner;
	private double distanceMaxMid;
	private double distanceMaxOuter;

	private double dartDistance;
	
    Darts(double x, double y) {
    	
    	distanceMaxInner = distanceFormula(1,0);
    	distanceMaxMid = distanceFormula(5,0); 
    	distanceMaxOuter = distanceFormula(10,0); 
    	
    	dartDistance = distanceFormula(x,y);
    	
    }

    double distanceFormula(double x, double y) {
    	return Math.sqrt(Math.pow((0-x), 2) + Math.pow((0-y), 2));
    }
    
    
    int score() {
    	if(dartDistance > distanceMaxOuter) {
    		return 0;
    	}
    	else if(dartDistance > distanceMaxMid && dartDistance <= distanceMaxOuter) {
    		return 1;
    	}
    	else if(dartDistance > distanceMaxInner && dartDistance <= distanceMaxMid) {
    		return 5;
    	}
    	else 
    		return 10;
    
    }

}
