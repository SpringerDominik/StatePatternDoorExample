/**
 * StopState
 */
public class CloseDoorState implements State {

    public void closeDoor(Door context) {
        System.out.println("Tür wird geschlossen");
        context.setState(this);
    }

    public String toString() {
        return "Tür geschlossen";
    }
}