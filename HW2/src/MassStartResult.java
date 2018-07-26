
class MassStartResult extends AbsNordicEvent implements IEvent {
	//constructs results for a Mass Start to have a time and position 
	MassStartResult(double time, int position){
		super(time,position);
	}
	//returns the finishing time as points earned for a certain athlete that was part of a Mass Start
	public double pointsEarned() {
		return this.time;
	}
}
