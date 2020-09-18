package washing_machine_state_pattern_with_adapter;

public class PauseStateEvents extends WashingMachineStateEventsAdapter {

	@Override
	public void closeLid(WashingMachine machine) {
		System.out.println("Close lid - washing resumes, going from pauseState to washingState");
		machine.changeState(new WashingStateEvents());
	}
}
