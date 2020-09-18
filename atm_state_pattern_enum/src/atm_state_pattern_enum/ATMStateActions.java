package atm_state_pattern_enum;


public enum ATMStateActions
{
	NOCARD {
		@Override
		void doAction(String aParameter) {
			System.out.println("Please enter your card");
			atmMachine.setATMState(ATMStateActions.INSERTCARD);
		}
	},
	
	INSERTCARD {
		@Override
		void doAction(String aParameter) {
			System.out.println("You entered the correct PIN");
			//atmMachine.setCorrectPinEntered(true);
			atmMachine.setATMState(ATMStateActions.INSERTPIN);
		}
	},
	EJECTCARD {
		@Override
		void doAction(String aParameter) {
			System.out.println("Doing Something in NEXT_STEP and jumping into FINAL, argument = " + aParameter);
		}
	},
	INSERTPIN {
		@Override
		void doAction(String aParameter) {
			System.out.println(2000 + " is provided by the machine");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - 2000);
			System.out.println("Your card is ejected");
			atmMachine.setATMState(ATMStateActions.EJECTCARD);
		}
	},

	REQUESTCASH {
		@Override
		void doAction(String aParameter) {
			System.out.println("I am in FINAL state, argument = " + aParameter);
		}
	};


	// reference to context
	public static ATMMachine atmMachine;


	// abstract method - must be defined for all enum types
	abstract void doAction(String aParameter);
	// Different states expected

	// HasCard, NoCard, HasPin, NoCash
	//	void insertCard();
	//	void ejectCard();
	//	void insertPin(int pinEntered);
	//	void requestCash(int cashToWithdraw);

	/*public static void setATMMachine(ATMMachine atmMachine) {
		setATMMachine(ATMMachine atmMachine);
	}*/
}
