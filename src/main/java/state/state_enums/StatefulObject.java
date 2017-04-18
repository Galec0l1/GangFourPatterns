package state.state_enums;

/**
 * Created by bondarchuk
 */
public class StatefulObject {
    private State state;

    public StatefulObject() {
        state = State.INITIAL;
    }

    public void goToNextState(String aParameter) {
        state = state.proceedToNextSate(aParameter);
    }

    public static void main(String[] args) {
        StatefulObject theObject = new StatefulObject();
        theObject.goToNextState("Hello");
        theObject.goToNextState("Hello");
        theObject.goToNextState("Hello");
        theObject.goToNextState("Hello");
        theObject.goToNextState("Hello");
    }
}
