package atm_state_pattern;

public class TestATMMachine {

	public static void main(String[] args) {
		ATMMachine atmMachine = new ATMMachine();
		atmMachine.setCashInMachine(5000);
		atmMachine.insertCard();
		atmMachine.ejectCard();
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		atmMachine.requestCash(2000);
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
	}
}
