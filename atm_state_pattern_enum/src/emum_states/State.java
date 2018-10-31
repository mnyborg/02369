package emum_states;

public enum State {

	INITIAL {
		@Override
		State doAction(String aParameter) {
			System.out.println("Doing Something in INITIAL state and jumping to NEXT_STEP, argument = " + aParameter);
			return NEXT_STEP;
		}
	},
	NEXT_STEP {
		@Override
		State doAction(String aParameter) {
			System.out.println("Doing Something in NEXT_STEP and jumping into FINAL, argument = " + aParameter);
			return FINAL;
		}
	},
	FINAL {
		@Override
		State doAction(String aParameter) {
			System.out.println("I am in FINAL state, argument = " + aParameter);
			return this;
		}
	};

	abstract State doAction(String aParameter);
}
