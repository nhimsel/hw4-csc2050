public class Driver
{
	public static void main(String[] args) 
	{
	    Player p1 = new Player("Mike");
	    Player p2 = new Player("Dave");
	    
	    Room r1 = new Room("R1");
	    Room r2 = new Room("R2");
	    Room r3 = new Room("R3");
	    Room r4 = new Room("R4");
	    Room r5 = new Room("R5");
	    Room r6 = new Room("R6");
	    
	    r1.setThePlayer(p1);
	    r1.addExit("north", r2);
	    r2.addExit("north", r3);
	    r2.addExit("south", r1);
	    r3.addExit("north", r6);
        r3.addExit("south", r2);
        r3.addExit("west", r4);
        r3.addExit("east", r5);
        r4.addExit("east", r3);
        r5.addExit("west", r3);
        r6.addExit("south", r3);

        /*...add the rest of the exits to all rooms
	    ...the make each room display itself showing something like:
	    Room: r2
	    Also here: Mike
	    Obvious Exits: north south*/
	}
}
