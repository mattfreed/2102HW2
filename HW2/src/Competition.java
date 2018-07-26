import java.util.LinkedList;

class Competition {
	LinkedList<Athlete> athletes;
	int rounds;
	//constructs a competition to have rounds and a list of all athletes as parameters
	Competition(int rounds, LinkedList<Athlete> athletes) {
		this.athletes = athletes;
		this.rounds = rounds;
	}
	//returns a list of athletes' names who did not finish the event
	LinkedList<String> shootingDNF(){
		LinkedList<String> didNotFinishNames = new LinkedList<>();	
		for (Athlete name: athletes) {
			if (this.rounds > name.shootingResult.shootingRounds.size()) {
				didNotFinishNames.add(name.name);
			}
		}
		if (didNotFinishNames.size() == 0) {
			return null;
		}
		return didNotFinishNames;	
	}
	//takes in a name of an athlete and returns the amount of points that the athlete 
	//earned in the event
	double skiingScoreForAthlete(String athleteName) {
		for (Athlete athlete: athletes) {
			if(athlete.name == athleteName) {
				return athlete.skiingResult.pointsEarned();
			}
		}
		return -1;
	}
	//takes in a Competition and returns true if any of the athletes in "this" 
	//competition had a better Skiing score than they had in the given competition
	boolean anySkiingImprovement(Competition anotherCompetition) {
		for(Athlete athlete: athletes) {
			for (Athlete athlete2: anotherCompetition.athletes) {
				if (athlete.name.equals(athlete2.name)) {
					if(athlete.skiingResult.pointsEarned()>athlete2.skiingResult.pointsEarned()){
						return false;
					}
				}
			}
		}
	return true;
	}
}
/*
The solutions are similar where it would seem that we could use the same helper function
for both to eliminate some of the minute amount of clutter. On the other hand, implementation of
the helper function would be kind of useless as it would only eliminate a few lines of code because 
the two functions return different types that would be cumbersome to implement in a single helper
function. For this reason, we are content with how we structered our code.
*/
