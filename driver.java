public class driver{
	public static void main(String[] args){
		SuperArray beef = new SuperArray();
		System.out.println("Phase 1 testing, start!");

		//testing SuperArray initializing
		System.out.println("\n!!Testing SuperArray initializing!!");
		System.out.println("Testing toString(): should return []");
		System.out.println(beef);
		System.out.println("\nTesting toStringDebug(): should return [null, ... null]");
		System.out.println(beef.toStringDebug());

		//testing size()
		System.out.println("\n\n!!Testing size()!!");
		System.out.println("Testing size(): should return 0");
		System.out.println(beef.size());

		//testing add()
		System.out.println("\n\n!!Testing add()!!");
		System.out.println("Testing add() while empty: should return true");
		System.out.println(beef.add("red"));
		System.out.println("\nChecking add() and toString(): should return [red]");
		System.out.println(beef);
		beef.add("cow");
		System.out.println("\nChecking add() and toString(): should return [red, cow]");
		System.out.println(beef);
		for (int x = 0; x < 9; x++){
			beef.add("filler");
		}
		System.out.println(beef.size());
		System.out.println("\n\nTesting add() while full: should resize and return true");
		System.out.println(beef.add("full"));
		System.out.println(beef.toStringDebug());

		//testing clear()
		System.out.println("\n\n!!Testing clear()!!");
		System.out.println("Testing clear(): should return []");
		beef.clear();
		System.out.println(beef);
		System.out.println("\nTesting clear() and size(): should return 0");
		System.out.println(beef.size());
		System.out.println("\nTesting add(\"red\") after clear(): should return true");
		System.out.println(beef.add("red"));
		System.out.println("\nSeeing SuperArray: should be [red]");
		System.out.println(beef);
		beef.clear();

		//testing get()
		System.out.println("\n\n!!Testing get()!!");
		beef.add("red");
		beef.add("cow");
		beef.add("meat");
		System.out.println("\nTesting get() with indices 0-2 filled: should return values *check code*");
		System.out.println(beef.get(0));
		System.out.println(beef.get(1));
		System.out.println(beef.get(2));
		System.out.println("\nTesting get() with an index greater than the size, should return 'The error was printed'");
		try {
			beef.get(3);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("The error was printed, congrats!");
		}

		//testing set()
		System.out.println("\n\n!!Testing set()!!");
		System.out.println("Using SuperArray from !!testing get()!!");
		System.out.println(beef);
		System.out.println("\nTesting set(0, \"blue\"): should return red");
		System.out.println(beef.set(0, "blue"));
		System.out.println("SuperArray should now be [blue, cow, meat]");
		System.out.println(beef);
		System.out.println("\nTesting set(1, \"fish\"): should return cow");
		System.out.println(beef.set(1, "fish"));
		System.out.println("SuperArray should now be [blue, fish, meat]");
		System.out.println(beef);
		System.out.println("\nTesting set(2, \"vegetal\"): should return meat");
		System.out.println(beef.set(2, "vegetal"));
		System.out.println("SuperArray should now be [blue, fish, vegetal]");
		System.out.println(beef);
		System.out.println("\nUsing empty SuperArray ");
		beef.clear();
		System.out.println("\nTesting set() on an empty array, should return 'The error was printed'");
		try {
			beef.set(3, "testtttt");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("The error was printed, congrats!");
		}
		System.out.println("SuperArray should now be []");
		System.out.println(beef);
		/** phase 1 & 2 testing end*/

		/** phase 3 testing start*/
		SuperArray a=new SuperArray();
    	  	for(int i=0;i<9;i++) {
    		  	a.add("aba");
    	  	}
    		//first phase
	  	System.out.println("should print 9 abas");
	  	System.out.println(a);
	 	System.out.println("shoud also print 9 abas plus one null");
   		System.out.println(a.toStringDebug());
	 	System.out.println("should print one aba");
  		System.out.println(a.get(7));
	 	a.set(6,"suraj");
	  	System.out.println("should print suraj");
	  	System.out.println(a.get(6));

	  	//second phase
	  	a.add("new");
	  	System.out.println("checks to see if the resize method works,should add the element new and test to the list");
	  	a.add("test");
	  	System.out.println(a);
	  	System.out.println("should print the list as seen above plus nine nulls");
	  	System.out.println(a.toStringDebug());
	  	System.out.println("should print true");
	  	System.out.println(a.contains("new"));
	  	System.out.println("should print false");
	  	System.out.println(a.contains("kill"));
	  	//time to test the overloaded add method
	  	a.add(9,"goku");
	  	System.out.println("should make goku to be the 9th element and push others to the right");
	  	System.out.println(a);
	  	System.out.println("should return 9");
	  	System.out.println(a.indexOf("goku"));
	  	System.out.println("should return -1");
	  	System.out.println(a.indexOf("naruto"));
	  	a.add(2,"goku");
		System.out.println(a);
	  	System.out.println("should print 10");
	  	System.out.println(a.lastIndexOf("goku"));
	  	System.out.println("should print -1");
	  	System.out.println(a.lastIndexOf("gok"));
	  	System.out.println("should print goku");
	  	System.out.println(a.remove(10));
	  	System.out.println("should move other elements to the left");
	  	System.out.println(a);
	  	System.out.println("should return false");
	  	System.out.println(a.remove("gok"));
	  	a.add("goku");
	 	 a.remove("goku");
	  	System.out.println("should remove the first instance of goku and shift all the elements to the left");
	  	System.out.println(a);
		a.clear();
		System.out.println("\nTesting remove() with a bad index, should return: 'The error was printed'");
		try {
			beef.remove(-1);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("The error was printed, congrats!");
		}
		System.out.println("\nTesting add() with a bad index, should return: 'The error was printed'");
		try {
			beef.add(-1, "testy");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("The error was printed, congrats!");
		}
		//Second Constructor
		System.out.println("\n\n!!Testing new constructor!!");
		SuperArray testy = new SuperArray(3);
		System.out.println("Created new SuperArray with 3 spaces");
		System.out.println(testy.toStringDebug());
	}
}