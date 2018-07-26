# 2102HW2

Problem Statement

This week, we extend your initial classes for athletic competitions so you can practice programming with lists in Java. We also add a new kind of event so you can practice working with abstract classes.
Another Nordic event in the Olympics is called the Mass Start event. This is similar to a marathon for runners; all the skiers assemble en masse and the first skier to cross the finish line wins. Add a class MassStartResult to your project. Like a SkiingResult, a MassStartResult has a finishing time and position. However, the pointsEarned for a mass start race is simply the finishing time (position is irrelevant). MassStartResult should also be an IEvent.
Create abstract classes as needed to share appropriate details between SkiingResult and MassStartResult. You may use whatever names you wish for these classes.

Do NOT add a MassStartResult field to your Athlete class. We are simply creating the ability to have a new kind of event, but the athletes in this assignment will not participate in it. Larger projects often have classes that don't get used in all scenarios.

Add a name field (type String) to the Athlete class.
Create a class Competition, which contains an integer indicating the (non-negative) number of ShootingRounds to be used in this competition. It should also contain a LinkedList of Athletes.
Modify your ShootingResult class to now contain a list of ShootingRounds (rather than a fixed four rounds). We assume the rounds are in order (the first round went first, the second went second, etc).
Modify pointsEarned in ShootingResult to now total the points across all rounds in the list.
Write a method called bestRound in the ShootingResult class to return the best round in the list. If there is a tie between the top two rounds, just return one of the rounds.
Pay particular attention to creating a thorough set of tests for this method.

Within a single competition, all of the athletes should have completed the same number of rounds in the Shooting event. Write a method in the Competition class called shootingDNF (for "did not finish"), which produces a LinkedList of the names of the Athletes in the competition whose list of ShootingRounds is less than the number of rounds stored in the Competition class.
The names of the Athletes should occur in the same order in the returned list as they were in the list within the Competition.

Write a method in the Competition class called skiingScoreForAthlete, which takes the name of an athlete and returns the score that the athlete earned in the skiing race. You may assume that no two athletes have the same name. You may also assume that the athlete name given is in the competition (we'll talk about how to handle error cases later in the course).
Write a method in the Competition class called anySkiingImprovement, which takes another Competition as input and returns true if any of the athletes in "this" competition had a better Skiing score than they had in the given competition. You may assume that both competitions have the same athletes, but the athletes may appear in different orders within the athlete lists in both competitions.
Pay particular attention to creating a thorough set of tests for this method.

Look back on your solutions to skiingScoreForAthlete and anySkiingImprovement. In hindsight, do you see any helper methods that you should have written that could have been shared over those two problems, or are you happy with how you organized the code?
Put your answer (a couple of sentences) in a comment at the bottom of your Competition class. You do not need to write any code or rewrite either method for this question. We're just asking you to reflect on your code and tell us what changes you might have made were you to do this pair of problems again.
