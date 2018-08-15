package washing_machine_state_pattern;

public class WashingState implements WashingMachineState {

	@Override
	public void openLid(WashingMachine machine) {
		System.out.println("Open lid - washing pauses, going from washingState to pauseState");
		machine.changeState(new PauseState());
	}

	@Override
	public void closeLid(WashingMachine machine) {
	}

	@Override
	public void pushStartBtn(WashingMachine machine) {
	
	}

	@Override
	public void pushStopBtn(WashingMachine machine) {
		System.out.println("Stop btn pressed - washing stops, going from washingState to stopState");
		machine.changeState(new StopState());
	}

	@Override
	public void pushOnBtn(WashingMachine machine) {
	}
}
