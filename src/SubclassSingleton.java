
public class SubclassSingleton {
	protected static SubclassSingleton uniqueInstance;
 
	// other useful instance variables here
 
	protected SubclassSingleton() {}
 
	public static synchronized SubclassSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SubclassSingleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a SubclassSingleton!";
	}
}
