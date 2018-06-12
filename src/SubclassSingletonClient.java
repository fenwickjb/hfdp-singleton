
public class SubclassSingletonClient {
	public static void main(String[] args) {
		SubclassSingleton foo = CoolerSingleton.getInstance();
		SubclassSingleton bar = HotterSingleton.getInstance();

		System.out.println("Hotter obj says: " + bar.getDescription());
		System.out.println(bar);
		System.out.println("Cooler obj says: " + foo.getDescription());
		System.out.println(foo);
 	}
}
