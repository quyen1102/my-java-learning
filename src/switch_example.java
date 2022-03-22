import java.util.Scanner;

public class switch_example {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        int n = new Scanner(System.in).nextInt();
        String direction = "";

        //switch
        switch (n) {
            case 1:
                direction = "east";
                System.out.println("One");
                break;
            case 2:
                direction = "west";
                System.out.println("Two");
                break;
            case 3:
                direction = "north";
                System.out.println("Three");
                break;
            case 4:
                direction = "south";
                System.out.println("Four");
                break;
            default:
                System.out.println("invalid switch!!");
                break;
        }

        //swithc la viec voi Direction
        // System.out.println(Direction.valueOf(direction.toUpperCase()));
        switch (Direction.valueOf(direction.toUpperCase())) {
            case EAST:
                System.out.println("EAST (use enum)");
                break;
            case WEST:
                System.out.println("WEST (use enum)");
                break;
            case NORTH:
                System.out.println("NORTH (use enum)");
                break;
            case SOUTH:
                System.out.println("SOUTH (use enum)");
                break;
            default:
                System.out.println("invalid switch!!");
                break;
        }
        
        // swithc lam viev voi string
        switch (direction.toLowerCase()) {
            case "east":
                System.out.println("east (use string)");
                break;
            case "west":
                System.out.println("east (use string)");
                break;
            case "north":
                System.out.println("north (use string)");
                break;
            case "south":
                System.out.println("south (use string)");
                break;
            default:
                System.out.println("invalid switch!!");
                break;
        }
    }
}
