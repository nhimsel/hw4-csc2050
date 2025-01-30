class Room
{
    private String name;
    private Player thePlayer;
    private Exit[] availableExits = new Exit[4];
    private int currNumberOfExits = 0;
    
    public Room(String name)
    {
        this.name = name;
        this.thePlayer = null;
    }
    
    public void addExit(String direction, Room destination)
    {
        if(this.currNumberOfExits <= 3)
        {
            Exit e = new Exit(direction, destination);
            this.availableExits[this.currNumberOfExits] = e;
            this.currNumberOfExits++;
        }
        else
        {
            System.err.println("there are too many exits!!!!");
        }
    }
    
    public void setThePlayer(Player thePlayer)
    {
        this.thePlayer = thePlayer;
    }
    
    public void display()
    {
        System.out.println("Room: " + this.name);
        System.out.println("Also here: " + ((this.thePlayer != null)?this.thePlayer.getName():"nobody"));
        System.out.println("Obvious Exits: " + getExitDirections());
    }
    
    private String getExitDirections()
    {
        String exits = "";
        for (int i=0; i<currNumberOfExits; i++)
        {
            exits += availableExits[i].getDirection() + " ";
        }
        return exits;
    }
}
