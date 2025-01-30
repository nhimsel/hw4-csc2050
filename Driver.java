/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
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
	    ...add the rest of the exits to all rooms
	    ...the make each room display itself showing something like:
	    Room: r2
	    Also here: Mike
	    Obvious Exits: north south


	    

	    //Arena ring = new Arena(p1, p2);
	    //ring.startFight();
	    //Fighter f = new Fighter("Bob");
	    //f.display();
	    
	    //Room r = new Room();
	    //System.out.println(r);
	    
	    //String s = new String("hello");
	    //System.out.println(s);

	    
	    /*
	    String s = "hello"; // syntactic sugar
	    String s2 = new String("hello");
	    String s3 = "hello";
	    String s4 = new String("hello");
	    
	    System.out.println(s == s3);
	    System.out.println(s2 == s4);
	    System.out.println(s2.equals(s4));
	    System.out.println(s4.equals(s2));

	    
	    Long l = new Long((long)15);
	    l.byteValue();
	    long l2 = 15;
	    
	    
	    
	    char c = 'a';
	    
	    String answer = s2.toUpperCase(); // -> "HELLO"
	    char answer2 = Character.toUpperCase(c); // -> 'A'
	    */
	}
}
