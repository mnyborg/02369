package washing_machine_state_pattern_with_adapter;

public interface WashingMachineStateEvents {
	void openLid(WashingMachine machine);
	void closeLid(WashingMachine machine);
	void pushOnBtn(WashingMachine machine);
	void pushStartBtn(WashingMachine machine);
	void pushStopBtn(WashingMachine machine);
} 