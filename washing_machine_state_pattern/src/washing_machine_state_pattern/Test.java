package washing_machine_state_pattern;

public class Test {

	public static void main(String[] args) {
	WashingMachine w = new WashingMachine();
	
	// turn machine on
	w.pushOnBtn();
	
	// push start
	w.pushStartBtn();

	// open lid during wash
	w.openLid();
	
	// close lid
	w.closeLid();
	
	// push stop
	w.pushStopBtn();
			
	}
}
