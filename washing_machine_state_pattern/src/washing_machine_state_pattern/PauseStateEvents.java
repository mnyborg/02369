package washing_machine_state_pattern;

public class PauseStateEvents implements WashingMachineStateEvents {

	@Override
	public void openLid(WashingMachine machine) {
	}

	@Override
	public void closeLid(WashingMachine machine) {
		System.out.println("Close lid - washing resumes, going from pauseState to washingState");
		machine.changeState(new WashingStateEvents());
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
