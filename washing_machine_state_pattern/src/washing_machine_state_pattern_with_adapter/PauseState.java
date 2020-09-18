package washing_machine_state_pattern_with_adapter;

public class PauseState extends WashingMachineStateAdapter {

	@Override
	public void closeLid(WashingMachine machine) {
		System.out.println("Close lid - washing resumes, going from pauseState to washingState");
		machine.changeState(new WashingState());
	}
}
