package washing_machine_state_pattern;

public class PauseState implements WashingMachineState {

	@Override
	public void openLid(WashingMachine machine) {
	}

	@Override
	public void closeLid(WashingMachine machine) {
		System.out.println("Close lid - washing resumes, going from pauseState to washingState");
		machine.changeState(new WashingState());
	}

	@Override
	public void pushStartBtn(WashingMachine machine) {
	}

	@Override
	public void pushStopBtn(WashingMachine machine) {
	}

	@Override
	public void pushOnBtn(WashingMachine machine) {
	}
}
