package atm_state_pattern_enum;

public class ATMMachine {
	// private ATMStates state;
	private ATMStateActions atmStateActions = ATMStateActions.NOCARD;
	

	// ATM machine properties
	int cashInMachine = 2000;

    boolean correctPinEntered = false;
	 
	public ATMMachine(){
        ATMStateActions.atmMachine=this;
      //  ATMStateActions.INSERTCARD.setATMMachine(this);


	    if(cashInMachine < 0) {
	    }	     
	}

    public void setCorrectPinEntered(boolean correctPinEntered) {
        this.correctPinEntered = correctPinEntered;
    }

	void setATMState(ATMStateActions newATMState) {
        atmStateActions = newATMState;
	}
	 
	public void setCashInMachine(int newCashInMachine) {	     
	    cashInMachine = newCashInMachine;
	}
	 
	public void insertCard() {
		atmStateActions.doAction("insert");
	}
	
	public void ejectCard() {
        atmStateActions.doAction("insert");
	}
	
	public void requestCash(int cashToWithdraw) {
        atmStateActions.doAction("insert");	}
	
	public void insertPin(int pinEntered){
        atmStateActions.doAction("insert");	}
}
