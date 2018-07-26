
class Athlete {
	
	ShootingResult shootingResult;
	SkiingResult skiingResult;
	String name;
	//initialize athlete variables
	Athlete(ShootingResult shootingResult, SkiingResult skiingResult, String name){
		this.shootingResult = shootingResult;
		this.skiingResult = skiingResult;
		this.name=name;
	}
	//checks whether this athlete has a better skiing score than the input athlete. Returns better athlete.
	Athlete betterSkiier(Athlete anotherAthlete) {
		if (skiingResult.pointsEarned() > anotherAthlete.skiingResult.pointsEarned()) {
			return anotherAthlete;
		}
		else { 
			return this;
		}
	}
	//determines whether this athlete has beaten the input athlete in either skiing result or shooting result. Returns boolean
	boolean hasBeaten(Athlete anotherAthlete) {
		if (skiingResult.pointsEarned() > anotherAthlete.skiingResult.pointsEarned() || shootingResult.pointsEarned()<anotherAthlete.shootingResult.pointsEarned()) {
			return false;
		}
		else { 
			return true;
		}	
	}
}
