
//
// Danger!  This implementation of DoubleCheckLockSingleton not
// guaranteed to work prior to Java 5
//

public class DoubleCheckLockSingleton {
    private volatile static DoubleCheckLockSingleton uniqueInstance;
 
    private DoubleCheckLockSingleton() {}
 
    public static DoubleCheckLockSingleton getInstance() {
	// Check #1: if instance already set then get outta here!
	if (uniqueInstance == null) {
	    // more efficient to only synchronize if we are racing to the
	    // constructor call. 
	    synchronized (DoubleCheckLockSingleton.class) {
		// Check #2: Multiple threads may be racing through check #1
		//           but only one can get inside this synchronize block at
		//           a time. So, the first will pass through check 2 and 
		//           when the others unblock from the synchronize they will
		//           find uniqueInstance is set
		if (uniqueInstance == null) {
		    uniqueInstance = new DoubleCheckLockSingleton();
		}
	    }
	}
	return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
	return "I'm a DoubleCheckLockSingleton!";
    }
}
