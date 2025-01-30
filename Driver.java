public class Driver
{
	public static void main(String[] args) 
	{
	    Player p1 = new Player("Mike");
	    Player p2 = new Player("Dave");

        //init an array to hold the rooms
        int roomCount = 6;
        Room[] rooms = new Room[roomCount];
	    
	    //init the rooms
        for (int i=0; i<roomCount; i++)
        {
            rooms[i] = new Room("R"+(i+1));
        }

        //manually set the properties of rooms
	    rooms[0].setThePlayer(p1);
	    rooms[1].addExit("north", rooms[1]);
	    rooms[1].addExit("north", rooms[2]);
	    rooms[1].addExit("south", rooms[0]);
	    rooms[2].addExit("north", rooms[5]);
        rooms[2].addExit("south", rooms[1]);
        rooms[2].addExit("west", rooms[3]);
        rooms[2].addExit("east", rooms[4]);
        rooms[3].addExit("east", rooms[2]);
        rooms[4].addExit("west", rooms[2]);
        rooms[5].addExit("south", rooms[2]);
        

        //display all the rooms
        for (int i=0; i<roomCount; i++)
        {
            rooms[i].display();
        }
	}
}
