/*Matt Freed & Dillon Arnold
 * CS2102
 * HW 2
 */

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class Examples {
	Athlete athlete1;
	Athlete athlete2;
	Athlete athlete3;
	Athlete athlete4;
	Competition competition1;
	Competition competition2;
	MassStartResult massStartResult;
    public Examples(){
    	
    	//create shooting round scores for athlete1. input is targets hit
	    ShootingRound r1 = new ShootingRound(3);
	    ShootingRound r2 = new ShootingRound(1);
	    ShootingRound r3 = new ShootingRound(4);
	    ShootingRound r4 = new ShootingRound(2);
	    
	    LinkedList<ShootingRound> shootingRounds = new LinkedList<>();
	    shootingRounds.add(r1);
	    shootingRounds.add(r2);
	    shootingRounds.add(r3);
	    shootingRounds.add(r4);
	    //create shooting result for athlete 1 with rounds 1,2,3,4 as inputs
	    ShootingResult shootingResult1 = new ShootingResult(shootingRounds);
	    
	    //create skiing result for athlete 1 with time, position, and the total shooting result as inputs.
	    SkiingResult skiingResult1 = new SkiingResult(20.1, 1, shootingResult1);
	    
	    //create athlete1 object with inputs shooting result and skiing result
	    athlete1 = new Athlete(shootingResult1, skiingResult1, "Matt");
	    
	    //create shooting round scores for athlete2. input is targets hit
	    r1 = new ShootingRound(5);
	    r2 = new ShootingRound(3);
	    r3 = new ShootingRound(4);
	    r4 = new ShootingRound(1);
	    
	    LinkedList<ShootingRound> shootingRounds2 = new LinkedList<>();
	    
	    shootingRounds2.add(r1);
	    shootingRounds2.add(r2);
	    shootingRounds2.add(r3);
	    shootingRounds2.add(r4);
	    //create shooting result for athlete 2 with rounds 1,2,3,4 as inputs
	    ShootingResult shootingResult2 = new ShootingResult(shootingRounds2);
	    
	    //create skiing result for athlete 2 with time, position, and the total shooting result as inputs.
	    SkiingResult skiingResult2 = new SkiingResult(18.8, 2, shootingResult2);
	    
	    //create athlete2 object with inputs shooting result and skiing result
	    athlete2 = new Athlete(shootingResult2, skiingResult2,"Dillon");
	    
	    //create shooting round scores for athlete3. input is targets hit (This athlete DNF)
	    r1 = new ShootingRound(5);
	    r2 = new ShootingRound(3);
	    r3 = new ShootingRound(4);
	    
	    LinkedList<ShootingRound> shootingRounds3 = new LinkedList<>();
	    shootingRounds3.add(r1);
	    shootingRounds3.add(r2);
	    shootingRounds3.add(r3);
	    //create shooting result for athlete 1 with rounds 1,2,3,4 as inputs
	    ShootingResult shootingResult3 = new ShootingResult(shootingRounds3);
	    
	    //create skiing result for athlete 1 with time, position, and the total shooting result as inputs.
	    SkiingResult skiingResult3 = new SkiingResult(50.1, 4, shootingResult3);
	    
	    //create athlete1 object with inputs shooting result and skiing result
	    athlete3 = new Athlete(shootingResult3, skiingResult3, "Bob");
	    
	    //creates a list of athletes
	    LinkedList<Athlete> athletesTotal = new LinkedList<>();
	    athletesTotal.add(athlete1);
	    athletesTotal.add(athlete2);
	    athletesTotal.add(athlete3);
	    
	    //creates competition 1
	    competition1 = new Competition(4, athletesTotal); 
	    
	    // creates athlete 4 to compare with Dillon
	    r1 = new ShootingRound(5);
	    r2 = new ShootingRound(3);
	    r3 = new ShootingRound(4);
	    r4 = new ShootingRound(3);
	    
	    LinkedList<ShootingRound> shootingRounds4 = new LinkedList<>();
	    
	    shootingRounds4.add(r1);
	    shootingRounds4.add(r2);
	    shootingRounds4.add(r3);
	    shootingRounds4.add(r4);
	    
	    //create shooting result for athlete 4
	    ShootingResult shootingResult4 = new ShootingResult(shootingRounds4);
	    
	    //create skiing result for athlete 2 with time, position, and the total shooting result as inputs.
	    SkiingResult skiingResult4 = new SkiingResult(18.8, 2, shootingResult4);
	    
	    //create athlete2 object with inputs shooting result and skiing result to compare Dillon
	    athlete4 = new Athlete(shootingResult4, skiingResult4,"Dillon");
	    
	    //creates a list of athletes 2
	    LinkedList<Athlete> athletesTotal2 = new LinkedList<>();
	    athletesTotal2.add(athlete4);
	    athletesTotal2.add(athlete1);
	    
	    //creates competition 2
	    competition2 = new Competition(4, athletesTotal2); 
	    
	    //creates new MassStartResult
	    massStartResult = new MassStartResult(12.01,4);
    }
   
    @Test//check athlete 1 shooting score
    public void athlete1ShootingScore() {
      assertEquals(10, athlete1.shootingResult.pointsEarned(),.5);
    }
    @Test//check athlete 1 skiing score
    public void athlete1SkiingScore() {
      assertEquals(210.1, athlete1.skiingResult.pointsEarned(),.5);
    }
    @Test//check athlete 2 shooting score
    public void athlete2ShootingScore() {
      assertEquals(13, athlete2.shootingResult.pointsEarned(),.5);
    }
    @Test//check athlete 2 skiing score
    public void athlete2SkiingScore() {
      assertEquals(151.8, athlete2.skiingResult.pointsEarned(),.5);
    }
    @Test //check if athlete 1 beat athlete 2
    public void athlete1HasBeaten() {
      assertFalse(athlete1.hasBeaten(athlete2));
    }
    @Test //check if athlete 2 beat athlete 1
    public void athlete2HasBeaten() {
      assertTrue(athlete2.hasBeaten(athlete1));
    }
    @Test //check better skiier using athlete 2 class
    public void betterSkiierAthlete2() {
      assertEquals(athlete2, athlete2.betterSkiier(athlete1));
    } 
    @Test  //checks better skiier using athlete 1 class
    public void betterSkiierAthlete1() {
        assertEquals(athlete2, athlete1.betterSkiier(athlete2));
    }
    @Test // checks athlete 1 shooting penalties
    public void athlete1ShootingPenalties() {
    	assertEquals(200, athlete1.skiingResult.addShootingPenalties(athlete1.shootingResult),.5);
    }
    @Test // checks athlete 2 shooting penalties
    public void athlete2ShootingPenalties() {
    	assertEquals(140, athlete2.skiingResult.addShootingPenalties(athlete2.shootingResult),.5);
    }
    @Test //Checks athlete 3 DNF in competition 1
    public void athlete3DNF() {
    	LinkedList<String> dnfTest = new LinkedList<>();
    	dnfTest.add("Bob");
    	assertEquals(dnfTest,competition1.shootingDNF());
    }
    @Test //Checks athlete skiing score
    public void athleteSkiingScoreName() {
    	assertEquals(210.1,competition1.skiingScoreForAthlete("Matt"),.5);
    }
    @Test //Checks athlete improvement possibilities, returns false 
    public void athleteImprovement() {
    	assertFalse(competition1.anySkiingImprovement(competition2));
    }
    @Test //Checks athlete2 bestRound, returns r1
    public void athlete2bestRound() {
    	assertEquals(athlete2.shootingResult.shootingRounds.get(0),athlete2.shootingResult.bestRound());
    }
    @Test //Checks athlete1 bestRound, returns r3
    public void athlete3bestRound() {
    	assertEquals(athlete1.shootingResult.shootingRounds.get(2),athlete1.shootingResult.bestRound());
    }
    @Test // checks massStartResult
    public void massStartResult() {
    	assertEquals(12.01, massStartResult.pointsEarned(),.05);
    }
    @Test // checks competition names, returns -1 for none of the names == input name
    public void competitionNoAthleteNameInList() {
    	assertEquals(-1, competition1.skiingScoreForAthlete("Foo"),.01);
    }
    @Test //Checks athlete improvement possibilities (athletes in different order), return true 
    public void athleteImprovement2() {
    	assertTrue(competition2.anySkiingImprovement(competition1));
    }
    @Test //Checks competition 2 for any DNF, returns null
    public void competition2DNF() {
    	assertEquals(null,competition2.shootingDNF());
    }
}