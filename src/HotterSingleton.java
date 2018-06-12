
public class HotterSingleton extends SubclassSingleton {
	// useful instance variables here
    private int temp = 100;
 
	private HotterSingleton() {
		super();
	}
 
	// useful methods here
	public String getDescription() {
		return "I'm a HotterSingleton! Temp = " + temp;
	}
}
