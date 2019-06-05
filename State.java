/**
 * State
 */
public interface State {

    public void doAction(Door context);

    public void closeDoor(Door context);

    public void openDoor(Door context);

}