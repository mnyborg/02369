package washing_machine_state_pattern;

public class WashingMachine  {

	private WashingMachineState state;
	
	boolean turnedOn;

	public WashingMachine() {
		// initial state
		this.state =  new StopState();
		turnedOn = false;
	}        

	protected  void changeState(WashingMachineState state) {
		this.state = state;      
	}

	public void openLid(){
		state.openLid(this);
	} 

	public void closeLid(){
		state.closeLid(this);         
	} 
	
	public void pushOnBtn(){
		state.pushOnBtn(this);
	} 

	public void pushStartBtn(){
		state.pushStartBtn(this);
	} 

	public void pushStopBtn(){
		state.pushStopBtn(this);
	} 

	public WashingMachineState getState() {
		return state;
	}
	
	public void setTurnedOn(boolean state) {
		turnedOn = state;
	}
}