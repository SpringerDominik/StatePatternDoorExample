/**
 * Door (Contexte)
 */
public class Door {
    private State state;

    public Door() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}