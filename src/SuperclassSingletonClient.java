

public class SuperclassSingletonClient {
	public static void main(String[] args) {
	    HotTemp bar = HotTempSingleton.getInstance();
	    System.out.println("bar says: " + bar.getDescription());
	    System.out.println(bar);

	    HotTemp foo = HotTempSingleton.getInstance();
	    System.out.println("foo says: " + foo.getDescription());
	    System.out.println(foo);

	    HotTemp hot = new HotTemp();
	    System.out.println("hot says: " + hot.getDescription());
	    System.out.println(hot);

 	}
}
