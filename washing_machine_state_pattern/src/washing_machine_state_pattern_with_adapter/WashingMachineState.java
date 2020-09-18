package washing_machine_state_pattern_with_adapter;

public interface WashingMachineState {
	public void openLid(WashingMachine machine);
	public void closeLid(WashingMachine machine);
	public void pushOnBtn(WashingMachine machine);
	public void pushStartBtn(WashingMachine machine);
	public void pushStopBtn(WashingMachine machine);
} 