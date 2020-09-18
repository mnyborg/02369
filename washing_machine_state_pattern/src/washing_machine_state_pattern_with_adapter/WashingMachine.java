package washing_machine_state_pattern_with_adapter;

public class WashingMachine  {

	private WashingMachineStateEvents state;
	
	boolean turnedOn;

	public WashingMachine() {
		// initial state
		this.state =  new StopStateEvents();
		turnedOn = false;
	}        

	protected  void changeState(WashingMachineStateEvents state) {
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

	public WashingMachineStateEvents getState() {
		return state;
	}
	
	public void setTurnedOn(boolean state) {
		turnedOn = state;
	}
}