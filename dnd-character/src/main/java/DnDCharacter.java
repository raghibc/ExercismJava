import java.util.Random;

class DnDCharacter {
	private int[] abilities = new int[6];
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	private Random rand = new Random();
	
	DnDCharacter() {
		
		for(int i = 0; i < abilities.length; i++) {
    		
    		int sum = 0;
    		int lowestNum = 6;
    		
    		for(int j = 0; j < 4; j++) {
    			int num = rand.nextInt(6)+1;
    			sum += num;
    			
    			if(num < lowestNum) {
    				lowestNum = num;
    			}
    		}
    		
    		sum -= lowestNum;
    		abilities[i] = sum;
    	}
    	
    	strength = abilities[0];
    	dexterity = abilities[1];
    	constitution = abilities[2];
    	intelligence = abilities[3];
    	wisdom = abilities[4];
    	charisma = abilities[5];
	}

    int ability() {
    	int choice = rand.nextInt(6);
    	
    	return abilities[choice];
    }

    int modifier(int input) {
    	int mod = (int) Math.floor((input-10)/(double)2);
    	return mod;
    }
    
    int getHitpoints() {
    	return modifier(constitution)+10;
    }

    int getStrength() {
    	return strength;
    }
    
    int getDexterity() {
    	return dexterity;
    }
    
    int getConstitution() {
    	return constitution;
    }
    
    int getIntelligence() {
    	return intelligence;
    }
    
    int getWisdom() {
    	return wisdom;
    }
    
    int getCharisma() {
    	return charisma;
    }
    
    
}
