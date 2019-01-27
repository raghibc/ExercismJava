class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int length = String.valueOf(numberToCheck).length();
		int sum = 0;
		int cloneVal = numberToCheck;
		
		for(int i = 0; i < length; i++) {
			
			sum += Math.pow((cloneVal%10),length);
			cloneVal = cloneVal/10;
		
		}
			
		if(sum == numberToCheck) {
			return true;
		}
		else
			return false;
	
	}

}
