/**
 * StartState
 */
public class OpenDoorState implements State {

    public void openDoor(Door context) {
        System.out.println("Tür wird geöffnet");
        context.setState(this);
    }

    public String toString() {
        return "Tür offen";
    }
}