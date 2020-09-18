package washing_machine_state_pattern;

public interface WashingMachineState {
	void openLid(WashingMachine machine);
	void closeLid(WashingMachine machine);
	void pushOnBtn(WashingMachine machine);
	void pushStartBtn(WashingMachine machine);
	void pushStopBtn(WashingMachine machine);
} 