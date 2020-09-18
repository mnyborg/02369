package washing_machine_state_pattern;

public class StopState implements WashingMachineState {

	@Override
	public void openLid(WashingMachine machine) {
	}

	@Override
	public void closeLid(WashingMachine machine) {	
	}

	@Override
	public void pushStartBtn(WashingMachine machine) {
	}

	@Override
	public void pushStopBtn(WashingMachine machine) {
	}

	@Override
	public void pushOnBtn(WashingMachine machine) {
		System.out.println("On btn pressed - machine is turned on, going from stopState to idleState");
		
		// turn machine on
		machine.setTurnedOn(true);
		
		// change to idle state
		machine.changeState(new IdleState());
	}
}
