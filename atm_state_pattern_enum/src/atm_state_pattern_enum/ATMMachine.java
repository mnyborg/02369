package atm_state_pattern_enum;

public class ATMMachine {
//	ATMState hasCard;    
//	ATMState noCard;
//	ATMState hasCorrectPin;
//	ATMState atmOutOfMoney;
	 
	private ATMState state;

	
	int cashInMachine = 2000;
	boolean correctPinEntered = false;
	 
	public ATMMachine(){     
//	    hasCard = new HasCard(this);
//	    noCard = new NoCard(this);
//	    hasCorrectPin = new HasPin(this);
//	    atmOutOfMoney = new NoCash(this);
	     
		
		state = ATMState.NOCARD;
	   
	
	     
	    if(cashInMachine < 0) {
	    
	    }	     
	}
	 
	void setATMState(ATMState newATMState) {
	    state = newATMState;
	}
	 
	public void setCashInMachine(int newCashInMachine) {	     
	    cashInMachine = newCashInMachine;
	}
	 
	public void insertCard() {
	    state.insertCard();
	}
	
	public void ejectCard() {     
	    atmState.ejectCard();
	}
	
	public void requestCash(int cashToWithdraw) {     
	    atmState.requestCash(cashToWithdraw);
	}
	
	public void insertPin(int pinEntered){     
	    atmState.insertPin(pinEntered);
	}
	 
	public ATMState getYesCardState() { return hasCard; }
	public ATMState getNoCardState() { return noCard; }
	public ATMState getHasPin() { return hasCorrectPin; }
	public ATMState getNoCashState() { return atmOutOfMoney; }
}
