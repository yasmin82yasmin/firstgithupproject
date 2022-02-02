package yasmin;

public class Boolean {
    public static void main(String[] args) {

        boolean passedDoor = true;
        boolean missedDoor = false;
        boolean passedallDoor = false;
        int doorcount = 0;
        if (passedDoor) {
            System.out.println("we passed the first door");
            doorcount = doorcount + 1;
        }
        if (passedDoor) {
            System.out.println("we passed the second door");
            doorcount = doorcount + 1;
        }
        if (passedDoor) {
            System.out.println("we passed the third door");
            doorcount = doorcount + 1;
        }
        if (doorcount == 3) {
            passedallDoor = true;
        }
        if(passedallDoor){
            System.out.println("congaretilotions you passed all door");
        }

    }
}
