package washing_machine_state_pattern;

public interface WashingMachineState {    
	public openLid(WashingMachine machine);
	public closeLid(WashingMachine machine);
	public pushOnBtn(WashingMachine machine);
	public pushStartBtn(WashingMachine machine);
	public pushStopBtn(WashingMachine machine);
} 