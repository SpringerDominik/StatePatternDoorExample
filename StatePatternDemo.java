/**
 * StatePatternDemo
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Door context = new Door();

        OpenDoorState openDoorState = new OpenDoorState();
        openDoorState.doAction(context);

        System.out.println(context.getState().toString());

        CloseDoorState closeDoorState = new CloseDoorState();
        closeDoorState.closeDoor(context);

        System.out.println(context.getState().toString());
    }
}