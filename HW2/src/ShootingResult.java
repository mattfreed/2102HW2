import java.util.LinkedList;

class ShootingResult implements IEvent {
	
	LinkedList<ShootingRound> shootingRounds;
	

	//constructs results of all rounds
	ShootingResult (LinkedList<ShootingRound> shootingRounds) {
		this.shootingRounds = shootingRounds;
	}
	
	//sums total targets hit for all rounds. Returns total targets hit
	public double pointsEarned() {
		double totalPoints = 0;
		for (ShootingRound sumPoints: shootingRounds) {
			totalPoints = totalPoints + sumPoints.targetsHit;
		}
		return totalPoints;
	}
	//returns a ShootingRound that was "this" athlete's best round in 
	//regards to points out of the shooting portion of the event
	ShootingRound bestRound() {
		ShootingRound bestRound =shootingRounds.getFirst();
		for (ShootingRound shootingRound: shootingRounds) {
			if (shootingRound.targetsHit>bestRound.targetsHit) {
				bestRound = shootingRound;
			}
		}
		return bestRound;
	}
}
