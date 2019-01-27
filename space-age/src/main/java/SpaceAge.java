class SpaceAge {
	private double seconds;
	private final int oneEarthYearSeconds = 31557600;
	private double earthAge;

    SpaceAge(double seconds) {
    	this.seconds = seconds;
    	earthAge = seconds/oneEarthYearSeconds;
    }

    double getSeconds() {
    	return seconds;
    }
    
    double calculateAge(double orbital) {
    	return earthAge / orbital;
    }

    double onEarth() {
        return earthAge;
    }

    double onMercury() {
        return calculateAge(0.2408467);
    }

    double onVenus() {
    	return calculateAge(0.61519726);
    }

    double onMars() {
    	return calculateAge(1.8808158);
    }

    double onJupiter() {
    	return calculateAge(11.862615);
    }

    double onSaturn() {
    	return calculateAge(29.447498);
    }

    double onUranus() {
    	return calculateAge(84.016846);
    }

    double onNeptune() {
    	return calculateAge(164.79132);
    }

}
