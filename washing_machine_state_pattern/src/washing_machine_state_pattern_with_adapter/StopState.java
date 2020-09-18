package washing_machine_state_pattern_with_adapter;

public class StopState extends WashingMachineStateAdapter {

	@Override
	public void pushOnBtn(WashingMachine machine) {
		System.out.println("On btn pressed - machine is turned on, going from stopState to idleState");
		
		// turn machine on
		machine.setTurnedOn(true);
		
		// change to idle state
		machine.changeState(new IdleState());
	}
}
