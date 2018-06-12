
public class HotTempSingleton extends HotTemp {
	protected static HotTemp uniqueInstance;
 
	// other useful instance variables here
 
	protected HotTempSingleton() {}
 
	public static synchronized HotTemp getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new HotTemp();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
    public String getDescription() {
	return "I'm the HotTempSingleton! Temp is " + temp;
    }
    
}
