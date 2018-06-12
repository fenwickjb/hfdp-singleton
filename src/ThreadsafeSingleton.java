
public class ThreadsafeSingleton {
	private static ThreadsafeSingleton uniqueInstance;
 
	// other useful instance variables here
 
	private ThreadsafeSingleton() {}
 
	public static synchronized ThreadsafeSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ThreadsafeSingleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a ThreadsafeSingleton!";
	}
}
