package emum_states;

public class StatefulObject {
	private State state;

	public StatefulObject() {
		state = State.INITIAL;
	}

	public void performRequest(String aParameter) {
		state = state.doAction(aParameter);
	}

	public static void main(String[] args) {
		StatefulObject theObject = new StatefulObject();
		theObject.performRequest("Hello");
		theObject.performRequest("Hello");
	//	theObject.performRequest("Hello");
	}
}
