package atm_state_pattern_enum;


public enum ATMState {

	NOCARD {
		@Override
		ATMState doAction(String aParameter) {
			System.out.println("Doing Something in INITIAL state and jumping to NEXT_STEP, argument = " + aParameter);
			return NOCARD;
		}
	},
	
	INSERTCARD {
		@Override
		ATMState doAction(String aParameter) {
			System.out.println("Doing Something in INITIAL state and jumping to NEXT_STEP, argument = " + aParameter);
			return NOCARD;
		}
	},
	EJECTCARD {
		@Override
		ATMState doAction(String aParameter) {
			System.out.println("Doing Something in NEXT_STEP and jumping into FINAL, argument = " + aParameter);
			return NOCARD;
		}
	},
	INSERTPIN {
		@Override
		ATMState doAction(String aParameter) {
			System.out.println("I am in FINAL state, argument = " + aParameter);
			return this;
		}
	},

	REQUESTCASH {
		@Override
		ATMState doAction(String aParameter) {
			System.out.println("I am in FINAL state, argument = " + aParameter);
			return this;
		}
	};

	abstract ATMState doAction(String aParameter);
	// Different states expected

	// HasCard, NoCard, HasPin, NoCash
	//	void insertCard();
	//	void ejectCard();
	//	void insertPin(int pinEntered);
	//	void requestCash(int cashToWithdraw);

}
