package washing_machine_state_pattern_with_adapter;

public class IdleStateEvents extends WashingMachineStateEventsAdapter {

	@Override
	public void pushStartBtn(WashingMachine machine) {
		System.out.println("Start btn pressed - washing starts, going from idleState to washingState");
		machine.changeState(new WashingStateEvents());
	}

	@Override
	public void pushStopBtn(WashingMachine machine) {
		System.out.println("Stop btn pressed - washing stops, going from idleState to stopState");
		machine.changeState(new WashingStateEvents());
	}

}